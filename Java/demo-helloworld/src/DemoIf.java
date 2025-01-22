public class DemoIf {
  public static void main(String[] args){
    // check if -> check event -> event result
    int x = 3;
    if (x > 2){ // check if "x > 2" this event : T/F
      System.out.println("x > 2.");
    }

    // check if length >3
    String s = "hello";
    if (s.length() > 3){
      System.out.println("hello's length > 3");
    }
  
    // equals
    if ("hello".equals(s)){
      System.out.println("hello = s");
    }
    // char
    if (s.charAt(1) == 'e' ){
      System.out.println("char = e");
    }

    if (x > 5){
      System.out.println("x > 5");
    } else { // x< 5 }
      System.out.println("x <= 5");
    }

    int y = 10;
    if (y % 2 == 0){
      System.out.println("y is an even number");
    } else {
      System.out.println("y is an odd number");
    }
    if (y > 3){
      System.out.println("y > 3");
    } else {
      System.out.println("y <= 3");
    }

    // if y > 3 & is even number
    if ((y > 3) && (y % 2 == 0)){
      System.out.println("True");
    } else {
      System.out.println("False");
    }
    
    int age = 16;
    boolean isAdult = age >= 18;
    if (isAdult == true){
      System.out.println("true");
    }
    if (!isAdult){
      System.out.println("not adult");
    }

    // Grading
    int score = 87;
    // >= 90: A
    // 80-89: B
    // 70-79: C
    // <70 : F
    //! score between 85-89 for F: grade T
    //! score 80-84 for F: B
    //! score between 87-89 for M: grade T
    //! score 80-86 for M: B
    char grade = ' ';
    char gender = 'M';
    //! better write mutually exclusive events -> easy for other ppl to read and amend
    if (score >= 90){
      grade = 'A';
    //! method 1: mutually exclusive case
    } else if (score >= 85 && score <= 89 && gender == 'F') {
      grade = 'T';
    } else if (score >= 87 && score <= 89 && gender == 'M') {
      grade = 'T';
    //! method 2: use OR
    } else if (score >= 80 && score <= 84 && gender == 'F' 
            || score >= 80 && score <= 86 && gender == 'M') {  
      grade = 'B';
    } else if (score >= 70 && score <=79) {
      grade = 'C';
    } else {
      grade = 'F';
    }
    System.out.println("Score: " + score);
    System.out.println("Gender: " + gender);
    System.out.println("Grade: " + grade);

    
    //! Test cases : 10
    //! Test + Expected result
    // 1. M 90-100 -> A
    // 2. F 90-100 -> A //! do not skip
    // 3. M 85-89 -> T
    // 4. F 87-89 -> T
    // 5. M 80-84 -> B
    // 6. F 80-86 -> B
    // 7. M 70-79 -> C
    // 8. F 70-79 -> C //! do not skip
    // 9. M 0-69 -> F
    //10. F 0-69 -> F //! do not skip



  }
}
