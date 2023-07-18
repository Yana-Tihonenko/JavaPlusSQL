package lesson.spring;

import lesson.EventsDAO;
import lesson.UserDAO;
import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class AppConfig {

  @Bean
  public DataSource dataSource() {
    PGSimpleDataSource pgDataSource = new PGSimpleDataSource();
    pgDataSource.setServerName("localhost");
    pgDataSource.setDatabaseName("first_bd");
    pgDataSource.setUser("postgres");
    pgDataSource.setPassword("123");
    return pgDataSource;
  }

  @Bean
  public UserDAO userDAO() {
    return new UserDAO(dataSource());
  }


  @Bean
  public EventsDAO eventsDAO() {
    return new EventsDAO(dataSource());
  }
}
