package lesson;

import java.sql.SQLException;

public class EventsDemo {
  public static void main(String[] args) throws SQLException {
  EventsDAO eventsDAO = new EventsDAO(MyDataSource.getDataSource());
  Events event = eventsDAO.findById(1);
  Events event1 = eventsDAO.findByName("Party");
  System.out.println(event);
  System.out.println(event1);

  }

}
