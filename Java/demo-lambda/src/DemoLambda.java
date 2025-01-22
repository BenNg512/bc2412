import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class DemoLambda {
  public static void main(String[] args) {
    // Java Lambda Expression -> Stream, Optional
    // Java Build-in Lambda Functions
    
    // y = f(x) 
    Function<String, Integer> stringLength = s -> s.length();
    // input: String s
    // output: Integer s.length()

    // Function< T, R > lambda;
    // Function< T, T > identity = t -> t; eg int to int

    //! can also add more parameters
    stringLength = s -> s.length() + 10;

    BiFunction<String, String, Integer> totalLength = 
      (s1, s2) -> s1.length() + s2.length();

    System.out.println(stringLength.apply("hello")); // 5+10 = 15
    System.out.println(totalLength.apply("hello", "world")); // 10

    // SuperFunction 3 inputs, 1 output
    SuperFunction<Integer, Integer, Integer, String> intsToStr =
      (a, h, w) -> "Age:" + a.toString()
                + " Height:" + h.toString() 
                + " Weight:" + w.toString();
    System.out.println(intsToStr.operate(18, 180, 180));

    SuperFunction<String, String, String, Integer> nameLength =
      (firstName, middleName, lastName) -> firstName.length() + middleName.length() + lastName.length();
    System.out.println(nameLength.operate("J", "K", "Rowling"));
    System.out.println(nameLength.operate("Ben", "", "Ng"));

    UnaryOperator<String> toUpperCase = s -> s.toUpperCase();
    System.out.println(toUpperCase.apply("hotDog"));

    



    // Consumer: 1 input, convert to output
    Consumer<String> printString = s -> System.out.println("The string is: " + s);
    printString.accept("hello");

    // Supplier: nothing input, 1 output
    Supplier<Integer> randomMarkSixNumber = () -> new Random().nextInt(49) + 1; // 1 - 49
    System.out.println("random no. 1: " + randomMarkSixNumber.get());
    System.out.println("random no. 2: " + randomMarkSixNumber.get());
    System.out.println("random no. 3: " + randomMarkSixNumber.get());
    System.out.println("random no. 4: " + randomMarkSixNumber.get());
    System.out.println("random no. 5: " + randomMarkSixNumber.get());
    System.out.println("random no. 6: " + randomMarkSixNumber.get());

    Supplier<Integer> s = () -> 99999999;
    System.out.println(s.get()); 

    // Java 8: interface -> class -> object
    // after Java 8: interface -> object
    Swimmable lucas = () -> System.out.println("swim");
    // class interface + object -> output
    lucas.swim();

    MathOperation add = (a, b) -> a + b;
    System.out.println(add.operate(1, 2));

    MathOperation sub = (a, b) -> a - b;
    System.out.println(sub.operate(1, 2));

    MathOperation mul = (a, b) -> a * b;
    System.out.println(mul.operate(1, 2));

    MathOperation div = (a, b) -> b == 0? 0: a / b;
    System.out.println(div.operate(1, 0));

    MathOperation BMI = (a, b) -> a / (b * b);
    System.out.println(BMI.operate(70, 2));

    // Lambda Assumption
    // 1. only one method
    // 2. no return
    List<Book> books = new ArrayList<>();
    books.add(new Book(1));
    books.add(new Book(2));
    books.add(new Book(3));
    
    for (Book book: books){
      System.out.println(book.getId());
    }
    books.forEach(b -> System.out.println(b.getId()));
    books.forEach(b -> {
      String message = "hello";
      System.out.println(b.getId() + message);
    });


    Map<String, String> fruitMap = new HashMap<>();
    fruitMap.put("orange","abc");
    fruitMap.put("apple","def");

    fruitMap.forEach((key,value) -> {
      System.out.printf("KEY"+key, "Value"+ value);
    });

    // Predicate
    // x -> B -> boolean
    // X -> X > 8 -> Predicate (formula)
    // int x1 = -1;
    // boolean isLargerThanEight = x1 > 8;
    Predicate<Integer>isLargerThan8 = x -> x >8;

    // check if the integer is even number:
    Predicate<Integer> isEvenNumber = x -> x % 2 == 0;
    System.out.println(isLargerThan8.and(isEvenNumber).test(9));
    books.removeIf(book -> book.getId() % 2 == 1);

    BiFunction<String, String, String> appendHello = (Key, Value) -> "Hello";// 
    fruitMap.merge("Pineapple","2321", appendHello); // put(Pineapple, 2321)
    fruitMap.merge("apple","2321", appendHello); // (apple, value is changed to Hello)
    // if found key, replace Hello to value
    // if no, add new map with (new key, new value)
    System.out.println(fruitMap);

  }

  public static class Book{
    private int id;
    
    public Book(int id){
      this.id = id;
    }
    public int getId(){
      return this.id;
    }
    public void setId(int id){
      this.id = id;
    }
  }

  // similar to Consumer.class
  public static void printString(String s){
    System.out.println("The string is: " + s);
  }
  // similar to Supplier.class
  public static int randomMarkSixNumber(){
    return new Random().nextInt(49) + 1; // 1 - 49
  }

  // similar to Function.class
  // method: store inside class file: public -> share use among classes, private -> self use
  public static Integer stringLength(String s){
    return s.length();
  }

}
