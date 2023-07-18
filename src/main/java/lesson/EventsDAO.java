package lesson;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EventsDAO {

  private DataSource dataSource;

  public EventsDAO(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  public Events findById(Integer id) throws SQLException {
    Events events = null;
    try (Connection connection = dataSource.getConnection()) {
      PreparedStatement ps = connection.prepareStatement("select * from events where id = ?");
      ps.setInt(1, id);
      ResultSet rs = ps.executeQuery();
      if (rs.next()) {
        events = new Events(rs.getInt(1), rs.getString(2), rs.getString(3));
      }
    }
    return events;
  }

  public Events findByName(String name) throws SQLException {
    Events events = null;
    try (Connection connection = dataSource.getConnection()) {
      PreparedStatement ps = connection.prepareStatement("select * from events where name = ?");
      ps.setString(1, name);
      ResultSet rs = ps.executeQuery();
      if (rs.next()) {
        events = new Events(rs.getInt(1), rs.getString(2), rs.getString(3));
      }
    }
    return events;
  }

}
