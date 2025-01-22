import java.util.ArrayList;

public abstract class Shape { 
    abstract double area();

//  public static <T extends Shape> double totalArea(T[] shapes){
//  public static double totalArea(List<? extends Shape> shapes){
//  }

//! Variable length
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<>(); 
    strings.add("ABC");
    strings.add("IJK");
    strings.size(); // 2
    strings.get(1); // ABC

    // Book[]
    ArrayList<Book> books = new ArrayList<>();
    books.add(new Book("ABC"));
    books.add(new Book("IJK"));
    books.size(); // 2
    System.out.println(books.size());
    for (Book book : books) {
        System.out.println(book.getName());
    }

    books.remove(0);
    books.add(new Book("XYZ"));
    books.remove(new Book("IJK"));
    //! if not added equals method, the 
    // after @override equals() in Book.class
    // ArrayList.remove(Object obj) -> Books.equals()
    // Generics Design ensure the Type must contains equals

    System.out.println(books.size()); // 1
    for (Book book : books) {
      System.out.println(book.getName());
    }

    System.out.println(books.contains(new Book("XYZ"))); // true
    System.out.println(books.indexOf(new Book("XYZ"))); // 0
    System.out.println(books.isEmpty()); // false
    books.clear();//! return an array with size 0, not return null
    System.out.println(books.isEmpty()); // true
    System.out.println(books.add(new Book("ABCD"))); // successfully added : true
    System.out.println(books.isEmpty()); // false
    //System.out.println(books.)
    books.add(new Book("XYZ"));
    books.add(new Book("XYZ"));
    books.add(new Book("XYZ"));
    books.add(new Book("XYZ"));
    books.add(new Book("XYZ"));
    books.remove(new Book("IJK"));
    books.add(new Book("XYZ"));
    books.remove(new Book("XYZ"));
    books.remove(new Book("XYZ"));
    books.remove(new Book("XYZ"));

    String bookName = "None";
    //boolean found = false;
    for (Book book : books) {
      if (book.getName().contains("XY")){
        //found = true;
        bookName = book.getName();
        break;
      }
    }
    System.out.println("Book " + bookName + " is available");







  }

}   