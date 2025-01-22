import java.lang.StackWalker.Option;
import java.util.Optional;

public class DemoOptional {
  
  public static void main(String[] args) {
    // Caller
    // Advantage: able to handle null
    Optional<String> result = concat("abc", "def");
    Optional<String> b = concat(null, "b");
    Optional<String> c = concat("a", null);
    Optional<String> d = concat(null, null);
    if (result.isPresent()) {
      System.out.println(result.get());
    }
    result.ifPresent(e -> System.out.println(e));
    System.out.println();

    String s2 = concat2(Optional.of("A"), Optional.of("def"));
    System.out.println(s2);

  }
  
  // Optional can only be used to return a value
  public static Optional<String> concat(String a, String b) {
    if (a == null || b == null)
      // return null; //! this one is risky and useless in using Optional
      return Optional.empty();
    return Optional.of(a.concat(b));
  }

  // Never use Optional as input parameter
  // x and y can still be null
  //! rubbish
  public static String concat2(Optional<String> x, Optional<String> y) {
    if (x == null || y == null)
      return null;
    if (!x.isPresent() || !y.isPresent())
      return null;
    return x.get().concat(y.get());
  }
}
