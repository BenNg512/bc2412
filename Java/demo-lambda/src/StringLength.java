import java.util.function.Function;

public class StringLength implements Function<String, Integer> {

  @Override
  public Integer apply(String s) {
    return s.length();
  }

  public static void main(String[] args) {
    // Traditional method
    StringLength stringLength = new StringLength();
    System.out.println(stringLength.apply("hello"));// 5

    // lambda expression
    Function<String, Integer> stringLength2 = s -> s.length();
    System.out.println(stringLength2.apply("hello"));// 5


  }

  
}
