
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
	private String DB_NAME; 
	
	@Value("${dbConfig.host}")
	private String HOST;
	@Value("${dbConfig.port}")
	private int PORT;
				
    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("org.mariadb.jdbc.Driver");
        String connectionString = "jdbc:mariadb://" + HOST + ":" + PORT + "/TPCDS_" + DB_NAME;
       	ds.setUrl(connectionString);
        ds.setUsername(USERNAME);
        ds.setPassword(PASSWORD);
        return ds;
    }
}
