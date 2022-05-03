package tpcds;

import com.opencsv.bean.StatefulBeanToCsvBuilder
import emf_syncer.EMFSyncer.SyncingStrategy
import java.io.FileWriter
import java.io.Writer
import java.util.List
import org.apache.commons.cli.CommandLine
import org.apache.commons.cli.CommandLineParser
import org.apache.commons.cli.DefaultParser
import org.apache.commons.cli.HelpFormatter
import org.apache.commons.cli.Option
import org.apache.commons.cli.Options
import org.apache.commons.cli.ParseException
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import tpcds.repository.DateDimRepository
import tpcds.repository.StoreRepository
import tpcds.repository.StoreReturnsRepository
import util.QueryStats
import tpcds.repository.CustomerRepository

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
    
    var csvDir = 'experimentResults/'
    var csvBaseName = 'file'
 
 	var dbName = ''
 
    val static Logger LOG = LoggerFactory.getLogger(Driver);
 	
 	@Autowired
    var StoreReturnsRepository srRepo;
 	@Autowired
    var CustomerRepository cRepo;
 	@Autowired
    var DateDimRepository dateRepo;
 	@Autowired
    var StoreRepository storeRepo;
    
    @Autowired
    Q1 q1
    @Autowired
    Q2 q2
    @Autowired
    Q3 q3
    @Autowired
    DriverReferenceMapper referenceMapper
 	
    def static void main(String[] args) {
        LOG.info("STARTING THE APPLICATION");
        SpringApplication.run(Driver, args);
        LOG.info("APPLICATION FINISHED");
    }
  
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
 		dbName = cmd.getOptionValue("dbn")

    	val List<QueryStats> queryStatsList = newArrayList
		var queryStats = new QueryStats
		queryStatsList.add(queryStats)
		
    	val size_model = 
			(
				srRepo.count() +  
				cRepo.count() + 
				dateRepo.count() + 
				storeRepo.count()
			) as int 
    	queryStats.size_model = size_model / 2 as int // there are DateDim and Store records that are not relevant
		
		
		if (WITH_REFERENCE_MAPPER) {
			
			referenceMapper.runExperiments(FACTOR, DEBUG, ITERATIONS, CHECK_CORRECTNESS, SYNCING_STRATEGY, queryStatsList)

		} else {
			
			q1.runExperiments(FACTOR, size_model, DEBUG, ITERATIONS, CHECK_CORRECTNESS, SYNCING_STRATEGY, queryStatsList)
			
	    	q2.runExperiments(FACTOR, size_model, DEBUG, ITERATIONS, CHECK_CORRECTNESS, SYNCING_STRATEGY, queryStatsList)
	    	
	    	q3.runExperiments(FACTOR, size_model, DEBUG, ITERATIONS, CHECK_CORRECTNESS, SYNCING_STRATEGY, queryStatsList)
		
		}	    	

			



    	// STORE STATS
		var newFilePath = ''
		if (SYNCING_STRATEGY == SyncingStrategy.EAGER) 
			newFilePath = '''«csvDir»/«csvBaseName»_eager_«dbName».csv'''
		else
			newFilePath = '''«csvDir»/«csvBaseName»_«dbName».csv'''
    	println(newFilePath)

		val Writer writer = new FileWriter(newFilePath);
		val beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
		beanToCsv.write(queryStatsList);
		writer.close();
    }
    
    
    
    
    
}