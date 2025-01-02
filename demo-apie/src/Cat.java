public class Cat extends Animal{
    // Animal.class is a Parent Class
    // Cat.class is a Child Class
    // Inherit all attribute from Animal.class

    //! Existed Attributes in Animal.class can be removed here
    // private String name;

    // Car's own attributes
    private int age;
    private String color;
    
public Cat(String name, int age, String color) {
    super(name); // Calling parent constructor
    this.age = age;
    this.color = color;
}

//! getName is already created in animal class
// public String getName() {
// return this.name;
// }

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
    System.out.println(this.name + " Cat is walking");
}

    public static void main(String[] args){
        Cat cat1 = new Cat("Tom", 3, "White");
        System.out.println("Name: " + cat1.getName());
        System.out.println("Age: " + cat1.getAge());
        System.out.println("Color: " + cat1.getColor());
        cat1.walk();
    }
}
