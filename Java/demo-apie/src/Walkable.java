public interface Walkable  {
  // everyone can use it after implemented -> for common use
  
  // 1. no instance variable
  // 2. All methods are abstract (100% abstract)
  // 3. Abstract method is Implicitly public //! Every thing is public
  // 4. Support "static final" variable
  // 5. no constructor
  // 6. after java 8
  void walk(); // abstract method
  int x = 3; // Implicitly static final

  // After Java 8, we can use default instance method
  default void walkFaster(){
    System.out.println("Walking faster");
  }

  // After Java 8, we can use static method in interface
  static int calculateDistance(){
    return -1;
  }

  static void main(String[] args) {
    System.out.println(Walkable.x); //3
    
  }

  
}
