public class Animal implements Eatable{
  // Java will check if the method is implemented during compilation
  // public void eat(){}

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
  
  @Override
  public void eat(){
    System.out.println(this.name + " Animal is eating...");
  }

  public static void main(String[] args) {
    Cat cat = new Cat("Tom", 3, "White");
    System.out.println("Name: " + cat.getName());
    cat.eat();
    cat.sleep();
    // cat.walk();

    Animal cat2 = new Cat("Cat2", 3, "White");
    cat2.eat();

    // During the compile time, 
    // "Animal cat2" imply the object can be accessed in "Animal Scope"
    // Hide the object instance method walk() & sleep()
    // cat2.sleep();
    // cat2.walk();

    // Rule 2. Runtime
    cat2.eat(); // Find the object during runtime
    // Found that the object can be accessed in "Cat Scope"
    // So cat2.eat() -> Cat class' eat()
    // Cannot place a parent to a child reference
    // cat2 = new Animal("Cat3", 3, "White"); //! Not allowed

    Animal[] animals = new Animal[4];
    animals[0] = new Cat("Cat", 3, "White");
    animals[1] = new Dog("Dog", 2, "Dark");
    animals[2] = new Pig("Pig", "Pink");
    animals[3] = new Animal("Animal");
    // Animal cannot be new if it is abstract
    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle(3.0);
    shapes[1] = new Square(3.0);
    shapes[2] = new Triangle(3.0, 4.0);
    for (Shape shape : shapes) {
      System.out.println(shape.area());
    }
    // Downcast
    for (Shape shape : shapes) {
      if ( shape instanceof Circle ) { // Check if it's instance of circle?
        Circle circle = (Circle) shape; 
        System.out.println("Radius: " + circle.getCircumference());
      } else if ( shape instanceof Square ) {
        Square square = (Square) shape;
        System.out.println("Length: " + square.getLength());
      } else if ( shape instanceof Triangle ) {
        Triangle triangle = (Triangle) shape;
        System.out.println(triangle.getBase() + " & "+ triangle.getHeight());
      }
    }

    // Example 4: for Interface
    Eatable cat4 = new Cat("Cat4", 3, "White");
    cat4.eat();

    Eatable[] eatables = new Eatable[3];
    eatables[0] = new Cat("Cat", 3, "White");
    eatables[1] = new Dog("Dog", 2, "Dark");
    eatables[2] = new Pig("Pig", "Pink");
    // cannot put new animal because animal class has no eat() method

  }
}
