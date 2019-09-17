package tpcds;

import com.opencsv.bean.StatefulBeanToCsvBuilder
import java.io.FileWriter
import java.io.Writer
import java.util.List
import emf_syncer.Syncer.SyncingStrategy
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.CriteriaQuery
import org.apache.commons.cli.CommandLine
import org.apache.commons.cli.CommandLineParser
import org.apache.commons.cli.DefaultParser
import org.apache.commons.cli.HelpFormatter
import org.apache.commons.cli.Option
import org.apache.commons.cli.Options
import org.apache.commons.cli.ParseException
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import tpcds.domain.lazy.Customer
import tpcds.domain.lazy.DateDim
import tpcds.domain.lazy.Store
import tpcds.domain.lazy.StoreReturns
import util.QueryStats

@SpringBootApplication
class Driver implements CommandLineRunner {

 	var String FACTOR 
 	// = 0.0625
// 	val FACTOR = 0.125
// 	val FACTOR = 0.25
// 	val FACTOR = 0.5
// 	val FACTOR = 1
// 	val FACTOR = 8
// 	val FACTOR = 16


 	var DEBUG = false
 	var ITERATIONS = 10
 
 	var CHECK_CORRECTNESS = true 
 	var SYNCING_STRATEGY = SyncingStrategy.LAZY 
 	var WITH_REFERENCE_MAPPER = true 
    
    var csvDir = '/Users/ab373/Documents/ArturData/WORK/git/javaecoresync/tpcds-emf/src/main/resources/experimentResults/'
    var csvBaseName = 'file'
 
 
	@PersistenceContext
    EntityManager em;
	
    val static Logger LOG = LoggerFactory.getLogger(Driver);
 	
 	
 	
    def static void main(String[] args) {
        LOG.info("STARTING THE APPLICATION");
        SpringApplication.run(Driver, args);
        LOG.info("APPLICATION FINISHED");
    }
  
  
    def static count(EntityManager em, Class<?> type) {
  		val CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
		val CriteriaQuery<Long> countQuery = criteriaBuilder.createQuery(Long);
		countQuery.select(criteriaBuilder.count(countQuery.from(type)));
		val Long count = em.createQuery(countQuery).getSingleResult();
		count
  	}
  
//  	def static List<StoreReturns> runSqlQuery(EntityManager em, Class<?> type, int page_size, String sqlQuery) {
//  		val Long count = em.count(StoreReturns);
//		val  maxPageNumber = ((count / page_size) + 1) as int
//		var List<StoreReturns> intermediateResultList = newArrayList
//		for (var int pageNumber = 1; pageNumber <= maxPageNumber; pageNumber++) {
//			
//			val list = em.createQuery(sqlQuery, StoreReturns)
//				.setFirstResult((pageNumber-1) * page_size)
//				.setMaxResults(page_size)
//				.getResultList()
//				
//			intermediateResultList += list
//		} 
//		return intermediateResultList
//  	}
  
  
  
  	def parseArgs(String... args) {
  		val Options options = new Options();

        val Option factor = new Option("f", "factor", true, "size factor");
        factor.setRequired(true);
        options.addOption(factor);

        val Option debug = new Option("d", "debug", false, "execute in debug mode (verbose)");
        debug.setRequired(false);
        options.addOption(debug);

        val Option iterations = new Option("i", "iterations", true, "number of iterations per experiment");
        iterations.setRequired(true);
        options.addOption(iterations);

        val Option eagerSyncing = new Option("e", "eager", false, "with eager syncing");
        eagerSyncing.setRequired(false);
        options.addOption(eagerSyncing);

        val Option mapperOnly = new Option("m", "mapper", false, "execute reference mapper only");
        mapperOnly.setRequired(false);
        options.addOption(mapperOnly);

        val Option csvDirectory = new Option("d", "dir", true, "directory for csv files");
        csvDirectory.setRequired(true);
        options.addOption(csvDirectory);

        val Option csvBaseName = new Option("n", "name", true, "base name for csv files");
        csvBaseName.setRequired(true);
        options.addOption(csvBaseName);

        val Option host = new Option("dbh", "dbConfig.host", true, "data source host");
        host.setRequired(true);
        options.addOption(host);

        val Option port = new Option("dbp", "dbConfig.port", true, "data source port");
        port.setRequired(true);
        options.addOption(port);

        val Option username = new Option("usn", "dbConfig.username", true, "data source username");
        username.setRequired(true);
        options.addOption(username);

        val Option password = new Option("pwd", "dbConfig.password", true, "data source password");
        password.setRequired(true);
        options.addOption(password);

        val Option dbName = new Option("dbn", "dbConfig.name", true, "data source database name");
        dbName.setRequired(true);
        options.addOption(dbName);


        val CommandLineParser parser = new DefaultParser();
        val HelpFormatter formatter = new HelpFormatter();
        var CommandLine cmd;

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("utility-name", options);

            System.exit(1);
        }
        cmd
  	}
  
    override void run(String... args) {
    	val cmd = parseArgs(args)
    	
    	
    	FACTOR = cmd.getOptionValue("factor")
	 	DEBUG = cmd.hasOption("debug")
 		ITERATIONS = Integer.valueOf(cmd.getOptionValue("iterations"))
 		if (cmd.hasOption("eager"))
 			SYNCING_STRATEGY = SyncingStrategy.EAGER
 		WITH_REFERENCE_MAPPER = cmd.hasOption("mapper")
    	csvDir = cmd.getOptionValue("dir")
    	csvBaseName = cmd.getOptionValue("name")
 



    	
    	val List<QueryStats> queryStatsList = newArrayList
		var queryStats = new QueryStats
		queryStatsList.add(queryStats)
		
    	val size_model = 
			(
				count(em, StoreReturns) +  
				count(em, Customer) + 
				count(em, DateDim) + 
				count(em, Store)
			) as int 
    	queryStats.size_model = size_model / 2 as int // there are DateDim and Store records that are not relevant
		
		
		
		
		if (WITH_REFERENCE_MAPPER) {
			
			val referenceMapper = new DriverReferenceMapper(em, FACTOR, DEBUG, ITERATIONS, CHECK_CORRECTNESS, SYNCING_STRATEGY)
			referenceMapper.runExperiments(queryStatsList)

		} else {
			
	    	val q1 = new Q1(em, FACTOR, size_model, DEBUG, ITERATIONS, CHECK_CORRECTNESS, SYNCING_STRATEGY)
			q1.runExperiments(queryStatsList)
			
	    	val q2 = new Q2(em, FACTOR, size_model, DEBUG, ITERATIONS, CHECK_CORRECTNESS, SYNCING_STRATEGY)
	    	q2.runExperiments(queryStatsList)
	    	
	    	val q3 = new Q3(em, FACTOR, size_model, DEBUG, ITERATIONS, CHECK_CORRECTNESS, SYNCING_STRATEGY)
	    	q3.runExperiments(queryStatsList)
		
		}	    	

			



    	// STORE STATS
//    	val String pattern = "yyyyMMdd_HHmm";
//		val simpleDateFormat = new SimpleDateFormat(pattern);
//		val String date = simpleDateFormat.format(new Date());
		
		
//		val NumberFormat nf = DecimalFormat.getInstance(Locale.ENGLISH);
// 		val DecimalFormat decimalFormatter = nf as DecimalFormat;
// 		decimalFormatter.applyPattern("00.0000");
// 		val String fString = decimalFormatter.format(FACTOR);
		
		
		// create directory
//		new File('''«csvDir»/«date»''').mkdir
		
		var newFilePath = ''
		if (SYNCING_STRATEGY == SyncingStrategy.EAGER) 
			newFilePath = '''«csvDir»/«csvBaseName»_eager_«FACTOR».csv'''
		else
			newFilePath = '''«csvDir»/«csvBaseName»_«FACTOR».csv'''
    	println(newFilePath)

		val Writer writer = new FileWriter(newFilePath);
		val beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
		beanToCsv.write(queryStatsList);
		writer.close();
    }
    
    
    
    
    
}