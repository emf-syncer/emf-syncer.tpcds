
package tpcds;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DbConfig {

	@Value("${dbConfig.username}")
	private String USERNAME;
	@Value("${dbConfig.password}")
	private String PASSWORD; 
	@Value("${dbConfig.name}")
	private String FACTOR; 
	
	@Value("${dbConfig.host}")
	private String HOST;
	@Value("${dbConfig.port}")
	private int PORT;
				
    @Bean
    public DriverManagerDataSource dataSource() {
    	System.out.println("dbConfig: factor = " + FACTOR);
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("org.mariadb.jdbc.MariaDbDataSource");
        if (FACTOR.equals("01"))
        	ds.setUrl("jdbc:mysql://" + HOST + ":" + PORT + "/tpcds");
        else
        	ds.setUrl("jdbc:mysql://" + HOST + ":" + PORT + "/tpcds_" + FACTOR );
        ds.setUsername(USERNAME);
        ds.setPassword(PASSWORD);
        return ds;
    }
}
