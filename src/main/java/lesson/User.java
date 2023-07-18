package lesson;

public class User {

  private int id;
  private String name;
  private String password;

  public User(int id, String name, String password) {
    this.id = id;
    this.name = name;
    this.password = password;
  }

  @Override
  public String toString() {
    return "lesson.User{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", password='" + password + '\'' +
        '}';
  }
}
