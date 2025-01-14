import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DemoHashMap {

  public static void main(String[] args) {
    HashMap<String, Integer> fruitMap = new HashMap<>();
    // put an entry to Map
    // Key -> Apple
    fruitMap.put("Apple", 1);
    fruitMap.put("Apple", 3);
    // If the key already exists, the value will be replaced -> Apple 1 -> Apple 3
    System.out.println(fruitMap);

    fruitMap.put("APPLE", 4); 
    System.out.println(fruitMap);
    System.out.println(fruitMap.size());

    // apple != APPLE according to equals()

    for (Map.Entry<String, Integer> entry : fruitMap.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    for (String Key : fruitMap.keySet()) {
      System.out.println(Key + " : " + fruitMap.get(Key));
    }

    for (Integer values : fruitMap.values()) {
      System.out.println(values);
    }
    // get value by key
    System.out.println(fruitMap.get("Apple"));
    System.out.println(fruitMap.get("APPLE"));

    // contains()
    System.out.println(fruitMap.containsKey("Apple")); // true

    //for (Map.Entry<String, Integer> entry : fruitMap.entrySet()) {
    //  if (entry.getKey().equals("Apple")) {
    //    entry.setValue(entry.getValue() + 1); // return value + 1
    //  }
    //}
    if (fruitMap.containsKey("Apple")) {
      fruitMap.put("Apple", fruitMap.get("Apple") + 1);
    }

    Integer value = fruitMap.get("Apple");
    if (value != null){ // make sure value is not null first
      fruitMap.put("Apple", value + 1);
    }

    // fruitMap.put("Apple", null); //! null
    System.out.println(fruitMap);
    System.out.println(fruitMap.size());

    fruitMap.put(null, 999);
    fruitMap.put(null, 1000);
    System.out.println(fruitMap);
    System.out.println(fruitMap.size());

    System.out.println(fruitMap.containsValue(1000));
    System.out.println(fruitMap.getOrDefault("Orange", 0));
    System.out.println(fruitMap.getOrDefault("Apple", 0)); // 5
    Integer removedInteger = fruitMap.remove("APPLE"); // return value
    System.out.println(removedInteger); // 4

    fruitMap.put("cherry", fruitMap.getOrDefault("cherry", 0));
    System.out.println(fruitMap);
    System.out.println(fruitMap.size());

    fruitMap.clear();
    System.out.println(fruitMap);
    System.out.println(fruitMap.size());

    Book book1 = new Book("ABC", 1);
    Book book2 = new Book("IJK", 2);
    Book book3 = new Book("DEF", 3);

    System.out.println();
    HashMap<Integer, Book> bookMap = new HashMap<>();
    bookMap.put(book1.getId(), book1);
    bookMap.put(book2.getId(), book2);
    bookMap.put(book3.getId(), book3);
    System.out.println(bookMap.size());
    for (Map.Entry<Integer, Book> entry : bookMap.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue().getName());
    }

    Book book4 = new Book("ABC", 1);
    Book book5 = new Book("IJK", 2);
    Book book6 = new Book("DEF", 3);
    Book book7 = new Book("DEF", 3);
    HashMap<Book, Integer> bookMap2 = new HashMap<>();
    bookMap2.put(book4, bookMap2.getOrDefault(book4, 0) + 1);
    bookMap2.put(book5, bookMap2.getOrDefault(book5, 0) + 1);
    bookMap2.put(book6, bookMap2.getOrDefault(book6, 0) + 1);
    bookMap2.put(book7, bookMap2.getOrDefault(book7, 0) + 1);
    System.out.println(bookMap2.size());
    for (Map.Entry<Book, Integer> entry : bookMap2.entrySet()) {
      System.out.println(entry.getKey().getName() + " : " + entry.getValue());
    }

  }
  public static class Book{
    private String name;
    private int id;
    public Book(String name, int id ){
      this.name = name;
      this.id = id;
    }
    public String getName(){
      return this.name;
    }
    public int getId(){
      return this.id;
    }
    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (!(obj instanceof Book))
        return false;
      Book book = (Book) obj;
      return Objects.equals(this.id, book.getId())
          && Objects.equals(this.name, book.getName());
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.id, this.name);
    }

    @Override
    public String toString() {
      return "Book[" //
          + "id=" + this.id //
          + ",name=" + this.name //
          + "]";
    }
  }
  
  
}
