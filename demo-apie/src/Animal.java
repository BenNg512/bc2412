public class Animal {

  // common attributes
  //! attributes have to public here
  public String name;
  public int age;
  
  public Animal(String name) {
    this.name = name;
  }

  public Animal(){ 
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
}
