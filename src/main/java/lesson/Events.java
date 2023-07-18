package lesson;

public class Events {
  private int id;
  private String name;
  private String city;

  public Events(int id, String name, String city) {
    this.id = id;
    this.name = name;
    this.city = city;
  }

  @Override
  public String toString() {
    return "Events{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", city='" + city + '\'' +
        '}';
  }
}
