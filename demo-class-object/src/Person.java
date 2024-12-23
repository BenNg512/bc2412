public class Person { // blueprint - define a Person
  // attributes
  private String name;
  private int age;
  private String email;

  // constructor //! not a method: no return type
  public Person(String name, int age, String email) {
    this.name = name;
    this.age = age;
    this.email = email;
  }
  // getter //! Method, get something
  public String getName() {
    return this.name;
  }
  public int getAge() {
    return this.age;
  }
  public String getEmail() {
    return this.email;
  }

  // Setter //! Method, set something -> set return type
  // void -> return nothing
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public void setEmail(String email){
    this.email = email;
  }

  public static void main(String[] args) {
    // int x = 3;
    // System.out.println(x);
    // int[] arr = new int[3];
    // String person = "person 1";
    // int personAge = 20;
    // String person2 = "person 2";
    // int personAge2 = 21;
    // .. loop
    // String[] names = new String[] {"person 1", "person 2", "person 3"};
    // int[] ages = new int[] {20, 21, 22};
    Person p1 = new Person("Vincent", 18, "vincent@gmail.com");
    // System.out.println(p1.getName());
    // System.out.println(p1.getAge());
    // System.out.println(p1.getEmail());

    Person p2 = new Person("Lucas", 17, "lucas@gmail.com");

    // Person[] persons = new Person[]{p1, p2, new Person("Dicky", 19, "dicky@gmail.com")};
    Person p3 = p2; // refer to the same box;
    
    p3.setAge(30);
    p2.setAge(20);
    
    Person[] persons = new Person[]{p1, p2, p3};

    for (Person p : persons){
      System.out.println(p.getName() + ", " +
                         p.getAge()  + ", " + 
                         p.getEmail());
    }
  }
}
