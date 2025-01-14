public class App {
  public static void main(String[] args) throws Exception {
    // 1. Expect -> Avoid
    int q = 0;
    if (q != 0){
      int x = 10 / q;
    } else {
      System.out.println("Cannot divide by zero");
  }
  // Handle the exception
    try {
      int x = 10 / q; // Java by default flow exception
    } catch (ArithmeticException e) {
    System.err.println("Cannot divide by zero");
    }

    // 2. nullPointer Exception
    String s = null;
    // System.out.println(s.charAt(0));
    
    // try & catch
    String result = null;
    try {
    concat(null, "abc"); // method caller
    } catch (IllegalArgumentException e) {
      // catch class
      // when something goes wrong, we can handle it here
    System.err.println("Ignore the bomb.");
    }

    System.out.println(result);

    // 3. java lang.NumberFormatException
    String input2 = "-3";
    try{
      int x = Integer.parseInt(input2);
    } catch (NumberFormatException e) {
      System.err.println("Invalid input");
    }

    int x2 = Integer.parseInt("-3"); // from string to int
    System.out.println(x2); // -3

    // 4. java lang ArrayIndexOutOfBoundsException
    String[] arr = new String[] {"abc", "ijk", "def"};
    System.out.println(arr);
    for (int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }

    // 5. java lang NullPointerException
    String s3 = "hello";
    System.out.println(s3.charAt(s3.length()-1 //-1
    ));

    // Match: contains at least one of these characters
    String password = "2345Z67890@";
    System.out.println(password.matches(".*[987@6@55543213375421@0].*")); // T
    System.out.println(password.matches(".*[!@$&_].*")); // T
    System.out.println(password.matches("@")); // F, not formatted
    System.out.println(password.matches(".*[0].*")); // T
    System.out.println(password.matches(".*[1].*")); // F
    System.out.println(password.matches(".*[A].*")); // F
    System.out.println(password.matches(".*[Z].*")); // T



  }

    public static String concat(String x, String y) {
        if (x == null) {
            throw new IllegalArgumentException();
        }
      return x.concat(y);
    }
}
