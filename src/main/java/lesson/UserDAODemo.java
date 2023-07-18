package lesson;

import java.sql.SQLException;

public class UserDAODemo {
  public static void main(String[] args) throws SQLException {
    UserDAO userDAO = new UserDAO(MyDataSource.getDataSource());
    User user = userDAO.findById(1);
    User user1 = userDAO.findByName("jj");
    System.out.println(user);
    System.out.println(user1);

  }


}
