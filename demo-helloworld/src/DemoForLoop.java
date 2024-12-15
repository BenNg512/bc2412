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
    // for (int i = 0; i < str2.length() - substr.length()+1; i++){
    for (int i = 0; i < str2.length() - substr.length()+1; i++){
      System.out.println(i);
      System.out.println("ANSWER: " + str2.substring(i,i + substr.length()));
      if (str2.substring(i,i + substr.length()).equals(substr)){
        exists = true;
      } else {
        exists = false; 
      }
      System.out.println(substr + " exists = " + exists);
    }

    // Counting
    String s = "hellololololo";
    int count = 0;
    for (int i = 0; i < s.length(); i++){
      if (s.charAt(i) == 'l'){
        count++;
      }
    }
    System.out.println("count1: " + count);

    // continue - skip the rest, go to the next iteration
    int count2 = 0;
    for (int i = 0; i < s.length(); i++){
      if (s.charAt(i) != 'l'){  //  != here
        continue; // skip count++ (because char is not l), go to i++ (next loop)
      }
      count2++; 
    }
    System.out.println("count2: " + count2);

    // 1-100, print out all divided by 3 & 4;
    for (int i = 1; i < 101; i++){
      if (i % 3 != 0 || i % 4 != 0){ // i % 12 != 0
      //      i % 3 != 0 && i % 4 != 0 event 1
      //   || i % 3 != 0 && i % 4 == 0 event 2
      //   || i % 3 == 0 && i % 4 != 0 event 3
      // if (i % 3 != 0 || i % 4 != 0) 
      //! We need to find: (i % 3 == 0 && i % 4 == 0)
      //! use the opposite : if (i % 3 != 0 || i % 4 != 0) 

        continue;
        }
      System.out.println(i);
      }
      // Nest loop: loop inside loop
      for (int i = 0; i < 3; i++){
        for (int j = 0; j < 4; j++){
          System.out.print("* ");
        }
      }
      System.out.println();
      // step 1: i=0, j=0 : print *
      // step 2: i=0, j=1 : print *
      // step 3: i=0, j=2 : print *
      // step 4: i=0, j=3 : print * end for looping i = 0 because j++ loop ends at i < 4
      //!        i=0, j=4 : * not print
      // step 5: i=1, j=0 : print *
      // step 6: i=1, j=1 : print *
      // step 7: i=1, j=2 : print *
      // step 8: i=1, j=3 : print *
      // step 9: i=2, j=0 : print *
      // step 10: i=2, j=1 : print *
      // step 11: i=2, j=2 : print *
      // step 12: i=2, j=3 : print * and end the loop because i++ loop ends at i < 3
      //!         i=3, j=0 : * not print

    // draw
    //. *
    //. **
    //. ***
    //. ****
      int rows = 10;
      int column = 20;
      for (int i = 0; i <= rows; i++){ // no. rows
        for (int j = 0; j <= column; j++){ // max column
          if (i >= j){ // if j > i, no. of stars = j-1 on that row
          System.out.print("*");
          } else {
          System.out.print(" ");
          }
        }System.out.println();
      }
      System.out.println();
    // draw a Christmas tree
    // ....*.... // mid = 
    // ...***...
    // ..*****..
    // .*******.
    int rows2 = 5;
    int column2 = 9;
    for (int i = 0; i <= rows2; i++){ // rows
      for (int j = 0; j <= column2; j++){ // columns
        if (j > column2/2 +i || j < column2/2 -i ){ // if j > i, no. of stars = j-1 on that row
        System.out.print(" ");
        } else {
        System.out.print("*");
        }
      } System.out.println("");
    }


    System.out.println();
  }
}