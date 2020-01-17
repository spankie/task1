package live.spankie;

/**
 * Person
 */
public class Person implements Comparable<Person> {

  private String name;
  private String role;
  private String bookToBorrow;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public Person(String name, String role) {
    this.name = name;
    this.role = role;
  }

  @Override
  public int compareTo(Person o) {
    // int isEqual = 0;
    // if (this.role.equals(o.getRole())) {
    // isEqual = 0;
    // }
    if (this.role.equals("TUTOR") && o.getRole().equals("STUDENT")) {
      return -1;
    }
    if (this.role.equals("STUDENT") && o.getRole().equals("TUTOR")) {
      return 1;
    }
    return 0;
  }

  public String getBookToBorrow() {
    return bookToBorrow;
  }

  public void setBookToBorrow(String bookToBorrow) {
    this.bookToBorrow = bookToBorrow;
  }

  @Override
  public String toString() {
    return "Person [bookToBorrow=" + bookToBorrow + ", name=" + name + ", role=" + role + "]";
  }

}