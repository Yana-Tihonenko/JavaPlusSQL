package lesson;

import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;

public class MyDataSource {

  private  static  DataSource dataSource;

  public static DataSource getDataSource(){
    if (dataSource == null) {
      PGSimpleDataSource pgDataSource = new PGSimpleDataSource();
      pgDataSource.setServerName("localhost");
      pgDataSource.setDatabaseName("first_bd");
      pgDataSource.setUser("postgres");
      pgDataSource.setPassword("123");
      dataSource = pgDataSource;
    }
    return dataSource;
  }

}
