public record Book (String name, double price) {
  // private int age; not allowed

  public static void main(String[] args) {
    Book b1 = new Book("ABC", 10.5);
    System.out.println(b1.name());
    System.out.println(b1.price());
    System.out.println(new Book("ABC", 10.5).equals(b1)); // True
    
    System.out.println(b1); // Book[name=ABC, price=10.5]



    // support equals() and HashCode()
    // renamed getter
    // no setter (immutable)
    // All-arg constructor
    // support toString()
    // support static variable
    // Support custom instance method
    // Do not support custom attribute
    // Do not support custom constructor

    
  }
}
