package lesson.spring;

import lesson.EventsDAO;
import lesson.UserDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class UserDAOSpringDemo {
  public static void main(String[] args) throws SQLException {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    UserDAO userDAO = context.getBean(UserDAO.class);
    EventsDAO eventsDAO = context.getBean(EventsDAO.class);

    System.out.println(userDAO.findById(1));
    System.out.println(userDAO.findByName("ss"));
    System.out.println(eventsDAO.findById(2));
    System.out.println(eventsDAO.findByName("Party"));

  }
  }
