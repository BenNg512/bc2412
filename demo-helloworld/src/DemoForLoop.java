public class DemoForLoop {
  public static void main(String[] args) {
    // 2^100
    int x = 2;
    x = x + 2;
    x *= 2;
    System.out.println("x = " + x); // 8

    // For Loop
    //! for ( ; ; ) {}
    // "i < 3" -> continue criteria
    // "i++" -> modifier
    // you have to let the modifier work with "continue criteria";
    // so that continue criteria becomes false at the end
    //! range: 0 <= i < 3 : 0, 1, 2
    for (int i = 0; i < 3; i++) {
      System.out.println("i1 = "+i);
    }
    // step 1: int = 0;
    // Step 2: i < 3 (question) -> true
    // Step 3: if true, enter into doe block: i++
    // Step 4: i++ -> +1, 
    // Step 5: +1 until i = 2 (i < 3) -> exit the loop

    for (int z = 1; z <= 12; z = z + 2 ){
      System.out.println("z = " + z);
    }
    for (int i = 0; i <5; i++){
      System.out.println("i2 = " + i);
    }
    for (int i = 0; i < 10; i++){
      if (i % 2 == 0){
        System.out.println(i + " : i is even");
      } else {
        System.out.println(i);
      }
    }  
    // print 0-100, divide by 3 & 4
    for (int i = 0; i <= 100; i++){
      if (i % 3 == 0 && i % 4 == 0){
        System.out.println(i + " : i can be divided by 3 & 4");
      } 
      // else {
      // System.out.println(i); //! remove this row to delete unwanted numbers
      // }
    }
    // sum up 0-20: 0+1+2+...
    int sum = 0;
    for (int i = 0; i < 21; i++){
      sum = sum + i; // 0+1+2+3+...
      //! i is declared within for loop, so 
      //! i can be used only within the for loop
    }
    System.out.println("Sum 1-20 = " + sum);
    // sum up 0-10 all oll numbers
    int sum2 = 0;
      for  (int i = 0; i < 11; i++){
      if( i % 2 == 1){
        sum2 += i; // 1+3+5+7+9 = 25
      }
    }
    System.out.println("Sum 1-10 odd numbers = " + sum2);
    // sum up all even numbers 0-10
    int sum3 = 0;
    for (int i = 0; i < 11; i++){
      if (i % 2 == 0){
        sum3 += i; // 0+2+4+6+8+10 = 30
      }
    }
    System.out.println("Sum 1-10 even numbers = " + sum3);
    // Find difference of oddSum and evenSum -> positive number
    
    int oddSum = 0;
    int evenSum = 0;
    //
    for (int i = 0; i < 11; i++){
      if (i % 2 == 1);{ // sum up odd numbers
        oddSum += i;
      } if (i % 2 == 0){ // sum up even numbers
        evenSum += i;
      }
    }
    // int diff = 0;
    // if (oddSum > evenSum){ // find difference
    //  diff = oddSum - evenSum;
    //} else {
    //  diff = evenSum - oddSum;
    //}
    int diff = oddSum > evenSum ? oddSum - evenSum : evenSum - oddSum;
    System.out.println("Diff = " + diff);



    // Searching 
    String str = "abcdefghijk";
    // 1. check if 'd' exists in the string
    // for loop + if + charAt
    boolean found = false;
    for (int i = 0; i < str.length(); i++){
      if (str.charAt(i) == 'd');{
        found = true;
      }
        System.out.println("Found d = " + found);
        break;//break the loop
    } 
    // System.out.println("Found = " + found);

    // Test cases
    // 1. sabcdefghijk
    // 2. abcefg
    // 3. abcdefijk
    // 4. ""(nothing)

    //  check if substring exists in the string
    String substr = "ll";
    String str2 = "hello";
    boolean exists = false;
    // for (int i = 0; i < str2.length() - substr.length()-1; i++){
    for (int i = 0; i < str2.length() - substr.length()+1; i++){
      System.out.println(i);
      System.out.println("AWS: " + str2.substring(i,i + substr.length()));
      if (str2.substring(i,i + substr.length()).equals(substr)){
        exists = true;
      } else {
        exists = false; 
      }
      System.out.println(substr + " exists = " + exists);
    }
  }
}