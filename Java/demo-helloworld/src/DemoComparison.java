public class DemoComparison {
  public static void main(String[] args) {
    // >, <, >=, <=, ==, !=
    // "==" -> check if they are equal
    // "=" ->assignment
    // "!=" -> check if they are not equal
    int age = 20;
    boolean isAdult = (age >= 18);
    boolean isElderly = (age >= 65);
    System.out.println("is Adult?: " +isAdult); //true
    System.out.println("is Elderly?: " +isElderly); //false
    
    double pi = 3.141592653589;
    boolean isCorrect = (pi == 3.141592653589);
    System.out.println(isCorrect); //true

    char gender = 'M';
    boolean isMale = (gender == 'M');
    System.out.println("is Male?: " +isMale); //true

    float price = 10.2f;
    // price is 10.2f, not 10.2
    System.out.println(price != 10.2f); // false, price == 10.2f
    System.out.println(price != 10.2); // true, price not = 10.2

    //! operator (Not)
    boolean result = !isAdult;
    System.out.println(result);

    if (age >= 18){
      // do something
    }

    if (!(age >= 18)){
      // do something
    }

    if (!isAdult){
      // do something
    }

    // && AND
    int age2 = 30;
    char gender2 = 'F';
    boolean result2 = (age2 >= 18) && (gender2 == 'M');
    System.out.println("true AND false: "+result2);
    // event 1: age > 18: true
    // event 2: gender == 'M': //! false
    // output: true + false = false

    // || OR (true || false)
    boolean result3 = (age2 >= 18) || (gender2 == 'M');
    System.out.println("true OR false: " + result3);
    // event 1: age > 18: true
    // event 2: gender == 'M': false
    // output: at least 1 is true = true

    // || OR (false || false)
    double weight = 50.0; 
    int height = 160;
    int age3 = 20;
    boolean result4 = (weight < 50) || (height > 160);
    System.out.println("false OR false: " + result4);

    // AND OR (true AND (false OR true))
    boolean result5 = (weight < 50) || (height == 160);// false OR true = true
    boolean result6 = (age3 >= 18) && (result5 == true);// tree AND true = true
    System.out.println("true AND (false OR true): " + result6);

    // AND OR (true AND false OR true)
    boolean result7 = (age3 >= 18) && (weight < 50) || (height == 160);
    // 1: age3 >= 18: true
    // 2: weight < 50: false
    // 3: height == 160: true
    // 4: true AND false OR true
    // Step 1: true AND false: false
    // Step 2: false OR true: true
    System.out.println("true AND false OR true: " + result7);

    //!try try (true OR false AND true) to see which part run first

    // print the last character of a string
    String password2 = "helloworld";
    char lastChar = password2.charAt(password2.length() - 1);
    System.out.print("Last char = " + lastChar);

    // Empty String
    String emptyString = "";
    System.out.println(emptyString.length());
    boolean isStringEmpty = (emptyString.length() == 0);
    //! isStringEmpty = "".equals(emptyString);
    //! do not write = emptyString.equals("");
    System.out.println(isStringEmpty);
    System.out.println(isStringEmpty + "1");

    String s = "hello";
    System.out.println("hello".equals(s) + " hello");
    System.out.println("hello".length());
    System.out.println("hello".charAt(2));

  }  
}
