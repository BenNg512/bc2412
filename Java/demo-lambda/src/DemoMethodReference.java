import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoMethodReference {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1,2,3,4,5);
    numbers.forEach(e -> 
      System.out.println(e + 10)
    );

    numbers.forEach(System.out::println);

    Function<String, Integer> stringLength = s -> s.length();
    Function<String, Integer> stringLength2 = str -> Integer.valueOf(str);
    Function<String, Integer> stringLength3 = String::length;

    String s = new String("abc");
    Supplier<Integer> randomNumber = () -> new Random().nextInt(10);
    Supplier<Integer> randomNumber2 = s::length;
  }  
}
