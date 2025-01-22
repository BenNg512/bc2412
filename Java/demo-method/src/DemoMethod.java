public class DemoMethod {
  // ! sum(int x, int y) -> input parameters
  // ! int -> return type
  // Sum
    public static int sum(int x, int y) {
    int result = x + y;
    return result; // the return value should align the return type
    }
    //! not allowed: same method signature
    // sum(int a, int b) = sum(int x, int y);
    // same method name + same parameter list
    // public static int sum(int a, int b){
    // return 1
    // }
  //! Java does not allow "different type" for the same method signature
  // public static long sum (int a, int b)
    public static double sum(int a, double b) {
    return a + b;
    }
    public static double sum(double a, int b) {
    return a + b;
    }
    public static double sum(double a, String b) { // int + int -> int -> double
    return a + Integer.valueOf(b);
    }
    //
  // Subtraction
    public static double subtract(double Vincent, double Lucas) {
    return Vincent - Lucas; // variable here can be set any
    }
  // Count char
    public static int countCharacter(String source, char target) {
    int count = 0;
    for (int i = 0; i < source.length() ; i++){
        if (source.charAt(i) == target){
        count++;
        } 
    }
    return count;
    }
  // toCharArray //! use for modifying
  //
    public static int totalMinutes(int day){
    int minutesInDay = 60*24;
    for (int i = 0; i < 24; i++){
        minutesInDay = 60*24*day;
    }
    return day * minutesInDay;
    }
    public static int countEven(int[] arr){ 
    int count = 0;
    for (int i = 0; i < arr.length; i++){
        if (arr[i] % 2 == 0)
        count++;
    }
    return count;
    }
    public static int countEven(long[] arr){ 
    //! write long here so it can also cater other primitives
    int count = 0;
    for (int i = 0; i < arr.length; i++){
        if (arr[i] % 2 == 0)
        count++;
    }
    return count;
    }

    public static void main(String[] args) {
    String end = "---------- E N D ----------";
    int x = 3;
    int a = 10;
    int b = 11;
    int y = a + b;
    System.out.println(y); // 21
    a = 19;
    b = 21;
    y = a + b;
    System.out.println(y); // 40
    // call sum() method
    y = sum (10, 11);
    System.out.println(y); // 21
    y = sum (19, 21);
    System.out.println(y); // 40
    System.out.println(end);
    // Subtraction
    double sub = subtract (20.1, 5.7); //! cannot use y because y is int, need to declare a new variable
    System.out.println(sub);
    System.out.println(subtract                     (20.1, 5.7));
    System.out.println(subtract(10, 8)); // 2.0 <- double value
    System.out.println(end);
    // Count char
    System.out.println(countCharacter("Hello", 'o')); //1
    System.out.println(countCharacter("Hello o y o t o o r r o x o o l", 'o')); // 8
    System.out.println(countCharacter("Hello", ' ')); // 0
    System.out.println(countCharacter("2", ' ')); // 0
    System.out.println(end);

    sum(1, 2.0); // sum(int x, int y)
    sum(1, 2); // sum(int x, int y)
    sum(1.2, 2);// sum(double x, int y)
    System.out.println(sum(1.0, "13")); // sum (double x, String y)

    System.out.println(totalMinutes(3) + " mins");

    System.out.println(countEven(new long[] {1L, 2L, 3L, 6L}));
    System.out.println(countEven(new int[] {1, 2, 3, 6}));





    }
}
