public class Test {
    // attributes
    private String name;
    private int age;
    private String email;
  
    // constructor //! not a method: no return type
    public Test(String name, int age, String email) {
      this.name = name;
      this.age = age;
      this.email = email;
    }
  
    // getter //! Method
    public String getName() {
      return this.name;
    }
    public int getAge() {
      return this.age;
    }
    public String getEmail() {
      return this.email;
    }


}
