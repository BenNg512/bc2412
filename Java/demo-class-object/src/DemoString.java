public class DemoString {
  public static void main(String[] args) {
    String s1 = "hello";                 //1933863327
    String s2 = "hello";                 //1933863327
    String s3 = s1;                      //1933863327
    //! s1 == s2 == s3
    String s4 = "hello!";                //112810359
    String s5 = new String("hello");     //2124308362
    String s6 = String.valueOf("hello"); //1933863327
    String s7 = new String("hello");     //146589023
    //! s1 == s2 == s3 == s6

    // identityHashCode -> Object's reference address
    System.out.println(System.identityHashCode(s1));
    System.out.println(System.identityHashCode(s2));
    System.out.println(System.identityHashCode(s3));
    System.out.println(System.identityHashCode(s4));
    System.out.println(System.identityHashCode(s5));
    System.out.println(System.identityHashCode(s6));
    System.out.println(System.identityHashCode(s7));
    System.out.println("---------------------------");
    // equals() ==
    // If you use == to compare objects, it will compare the //! reference address
    // Besides, s.equals() will compare the //! String value 
    //! Always use equals() for String
    System.out.println(s1 == s2); // true
    System.out.println(s1.equals(s2)); // true
    System.out.println(s1 == s7); //! false
    System.out.println(s5 == s7); //! false
    System.out.println(s1.equals(s7)); //! true
    System.out.println(s5.equals(s7)); //! true
    System.out.println("---------------------------");



    // String is immutable (purpose: reduce risk)
    // Is s1 still the same object? : No
    s1 = s1 + "?"; 
    System.out.println(System.identityHashCode(s1)); //349885916
    System.out.println(s1);



  }
  
}
