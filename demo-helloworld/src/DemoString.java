public class DemoString {
  public static void main(String[] args){
    char x = 'a';
    x = 1;
    // x=1.1 //! no
    // x = true;
    x = 'x';
    //char x = '0';
    // char x ='abcd1234'//! no
    
    // String // ! define a string value by double quote "xxx"
    // char // ! define a char value by single quote 'x'
    String password = "abcd1234";
    String emailAddress = "abcd@gmail.com";

    // + operation
    password = password + "!";
    System.out.println("helloworld");
    System.out.println(password);

    // String is not premitive type, can enter '.' to find tools after String
    // password.  -> tools show out and include rules for input
    // ! only input allowed premitive and input
    // Java Method (Instance method)
    // action / tools
    
    char result = password.charAt(0);
    // charAt starts from 0,1,2,3...
    // abcd1234! has 9 char, "!" is at charAt(8)
    System.out.println(result);

    // ! index starts from 0 (max: length - 1)
    // System.out.println(password.charAt(-1)); //! error, cannot be negative for index (out of range)
    // System.out.println(password.charAt(9)); //! error, exceeds range (max 8,out of range)

    // equals() : A=B? output: true or false
    String s1 = "abc";
    String s2 = "abc";
    String s3 = "ABC";
    String s4 = "AbC";
    System.out.println(s1.equals(s2)); //true
    boolean result2 = s1.equals(s3);
    System.out.println(result2); //false
    System.out.println("abc=AbC? : " + s1.equals(s4)); //false b =/= B

    // length()
    password.length();
    int result4 = password.length();
    System.out.println("Length of 'password!': " + result4);

  }
  
}
