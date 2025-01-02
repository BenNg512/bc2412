public class Dog extends Animal{
    // private String name;
    private int age;
    private String color;

// constructor is hot inherit
  public Dog(String name, int age, String color) { 
    super(name); 
    // this.name = name;
    this.age = age;
    this.color = color;
  }

  public int getAge() {
    return this.age;
  }

  public String getColor() {
    return this.color;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void walk(){
    System.out.println(this.name + " Dog is walking");
  }


  public static void main(String[] args){
    Dog dog1 = new Dog("Tom", 3, "White");
    dog1.walk();
    dog1.setName("Tommy");
    System.out.println("Name: " + dog1.getName());
    System.out.println(dog1.name);
  }
}
