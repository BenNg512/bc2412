import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
  public static void main(String[] args) {
    // traditional for loop
    int[] arr = {1, 2, 3, 4, 5};
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    // for each loop
    for (int num : arr) {
      System.out.println(num);
    }
    // Stream API
    // int[], Integer[], ArrayList<Integer>
    // Java 8 (2014) : Stream style -> stream -> List
    // before Java 8 : for loop (list)
    List<Integer> integers = Arrays.asList(1,2,3,4);
    List<Integer> newIntegers = integers.stream() // Stream<Integer>
      .filter(e -> e % 2 == 0) // "e -> e % 2 == 0" is a lambda expression (Predicate)
      .collect(Collectors.toList());

    System.out.println(integers);
    System.out.println(newIntegers);

    // Declare an array of String
    String[] names = {"abcdef", "def", "ghosts", "jkjkjkjk"};
    // filter if length >5;
    List<String> newStrings = Arrays.stream(names)
      .filter(e -> e.length() > 5)
      .collect(Collectors.toList());
    System.out.println(newStrings);

    List<Book> books = new ArrayList<>();
    books.add(new Book("A Herry Potter"));
    books.add(new Book("Harry Potter 2"));
    books.add(new Book("a Hehehe herry"));
    //
    List<Book> newBooks = books.stream()
      //.filter(e -> "Herry".equalsIgnoreCase(e.getName()))
      .filter(e -> e.getName().toUpperCase().contains("HERRY"))
      .collect(Collectors.toList());
    System.out.println(newBooks);

    
    // map(): change the object type, but not the content
    List<String> bookNames = books.stream().map(e -> e.getName())//map
      .collect(Collectors.toList());
    System.out.println(bookNames);
      //.forEach(e -> System.out.println(e));

    // filter + map
    List<String> newBookNames = books.stream()
      .filter(e -> e.getName().toUpperCase().contains("HERRY"))
      .map(e -> e.getName().toUpperCase())
      .collect(Collectors.toList());
    System.out.println(newBookNames);

    // for loop + if + procedure
    books.stream()
      .filter(e -> e.getName().startsWith("A")) // filter
      .map(e -> e.getName().toUpperCase())   // get something and process it -> get name here
      .forEach(e -> System.out.println(e)); // output: for each loop
  
  
  
    List<String> bookName2 = List.of("abc", "herry", "def");
    List<Book> newbooks2 = bookName2.stream()
      .map(e -> new Book(e))
      .collect(Collectors.toList());
    System.out.println(bookName2);

    // Stream sorted()
    // Collection.sort + comparator
    // Arrays.sort()
    Integer[] arr2 = {2, 4, -1, 1, -3};
    Arrays.sort(arr2, (i1, i2) -> i1 > i2 ? -1 : 1);
    System.out.println(Arrays.toString(arr2));

    // Integer[] -> Stream <Integer>
    List<Integer> sortedInteger = Arrays.stream(arr2)
      .sorted((i1, i2) -> i1 < i2 ? 1 : -1)
      .collect(Collectors.toList());
    System.out.println(sortedInteger);

    List<String> fruits = Arrays.asList("orange","apple", "orange", "lemon");
    // remove duplicate: 
    //! 1. Set stream -> output is Set
    Set<String> newFruits = fruits.stream().collect(Collectors.toSet());
    System.out.println(newFruits);

    //! 2. distinct method
    List<String> newFruits2 = fruits.stream()
      .distinct() 
      .collect(Collectors.toList());
    System.out.println(newFruits2);





    // Stream.class
    Stream.of("abc", "def", "ghi");
    Stream <Book> books2 = Stream.of(new Book("abc"), new Book("def"), new Book("ghi"));

    List<Book> books3 = books2.filter(e->e.getName().startsWith("a"))
    .map(e -> new Book(e.getName()))
    .collect(Collectors.toList());

    LocalDate date1 = LocalDate.of(2014,10,31);
    String str = String.valueOf(123);

    Stream<String> strStream = Stream.empty();
    System.out.println(strStream.count());

    Optional<Book> targetBookBox = 
        Stream.of(new Book("abc"), new Book("def"), new Book("ghi")).filter(e -> "abc".equals(e.getName()))
        .findFirst();

    // Optional
    // 1. target is never be null
    // 2. target is an Optional object
    // 3. You have to check if null exist or not
    // 4. isPresent() & ifPresent()
    // 5. Never use 

    int x = 10;
    if (targetBookBox.isPresent()) {
      Book targetBook = targetBookBox.get();
      System.out.println(targetBook.getName());
      x = 100;
    }

    
    targetBookBox.ifPresent(e -> {
      System.out.println(e.getName());
      // System.out.println(x);
    });





    String name = "oscar";
  Stream.of(100,200,300).forEach(e -> {
    System.out.println(e);
    System.out.println(name);
  });

  String name2 = "abc";
  for (Integer integer : Stream.of(100,200,300).collect(Collectors.toList())) {
    System.out.println(integer);
    //name = "ijk";
    name2 = "ijk";
  }
  Book targetBook2 = targetBookBox.orElse(new Book("default"));
  System.out.println(targetBook2.getName());
  Book targetBook3 = targetBookBox.orElseThrow(() -> new RuntimeException("targetBookBox is null"));
  System.out.println(targetBook3.getName());

  Book targetBook4 = targetBookBox.orElseGet(() -> new Book("default")); // similar to orElse()
  System.out.println(targetBook4.getName());

  // of(), ofNullable(), empty()
String name3 = "ABC";
Optional<String> os1 = Optional.of(name3);
os1.ifPresent(e -> System.out.println(e));

Optional<String> os2 = Optional.ofNullable(name3);
os2.ifPresent(e -> System.out.println(e));

Optional<String> os3 = Optional.empty();
if (os3.isPresent()) {
  System.out.println(os3.get());
} else {
  System.out.println("os3 is empty");
}

// 1. Stream intermediate operations wont execute itself, until terminal operation
// 2. Once the terminal operation is executed, the stream Object cannot be used
Stream<Integer> integersLargerThan10 = 
  Stream.of(10, 100 , -1).filter(e -> e > 10);
  // Terminal operations: collect(), count(), forEach(), findFirst(), findAny(), max(), min(

System.out.println(integersLargerThan10.count()); // 1

Stream<Integer> plusOne = Stream.of(1,2,3)
  .map(i -> {
  System.out.println(i);
  return i + 1; // 2,3,4
});
//! If you process the following statement, the terminal operation will be executed
//! Line 203-204 will not be executed
// System.out.println(plusOne.collect(Collectors.toList()));

long count = plusOne.count();
System.out.println(count);



}
  // Cover from Book to Book2
  public static List<Book> getBookListForEachSearch(List<Book2> books){
    return books.stream()
      .map(e -> new Book(e.getName()))
      .collect(Collectors.toList());
  }

    public static class Book{
      private String name;
      public Book(String name){
        this.name = name;
      }
      public String getName(){
        return this.name;
      }
    }

    public static class Book2{
      private String name;
      public Book2(String name){
        this.name = name;
      }
      public String getName(){
        return this.name;
      }
    }



  
}
