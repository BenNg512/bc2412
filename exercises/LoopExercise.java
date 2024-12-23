import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class LoopExercise {
  public static void main(String[] args) {
    System.out.println("-------------- Q1");
    // 1. Print 6 times hello
    // Use: for loop
    for (int i = 0; i < 6; i++){
      System.out.println("Hello");
    }
    System.out.println("-------------- Q2");


    // 2. Expected output: "0,1,2,3,4"
    // Use: for loop
    for (int i = 0; i < 5; i++){
      System.out.println(i);
    }
    System.out.println("-------------- Q3");
    // 3. Print even numbers between 2 and 20
    // Use: for loop + if
    for (int i = 0; i < 21; i++){
      if (i >=2 && i % 2 == 0){
      System.out.println(i);
      }
    }
    System.out.println("-------------- Q4");
    // 4. Print the numbers, which can be divided by 3 or 5
    // Use: for loop + if
    for (int i = 0; i < 21; i++){
      if (i % 3 == 0 && i % 5 == 0){
      System.out.println(i);
      }
    }
    System.out.println("-------------- Q5");
    // 5. Sum up the numbers between 0 and 15 and print it
    // Use: for loop
    int sum = 0;
    for (int i = 0; i < 16; i++){
      sum += i;
    }
    System.out.println(sum);
    //
    System.out.println("-------------- Q6");
    // 6. sum up all odd numbers betwen 0 - 10
    // Sum up all even numbers betwen 0 - 10
    int evenSum = 0;
    int oddSum = 0;
    // Find the product of evenSum and oddSum
    // Use: for loop + if
    for (int i = 0; i < 11; i++){
      if (i % 2 == 0){
        evenSum += i;
      } else {
        oddSum += i;
      }
    }
    System.out.println("evenSum: " + evenSum);
    System.out.println("oddSem: " + oddSum);

    System.out.println("-------------- Q7");
    // 7. Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    String str7 = "ijkabcpodi";
    char targetChar = 'd';
    int countChar = 0;
    for (int i = 0; i < str7.length(); i++){
      if (str7.charAt(i) == targetChar){
        System.out.println(targetChar + " is found.");
        countChar++;
      } 
    } if (countChar == 0){
      System.out.println(targetChar + " is not found.");
    }
    System.out.println("-------------- Q8");
    // 8. Check if the string s8b is a substring of s8a
    // print "s8b is a substring."
    // otherwise, print "s8b is not a substring."
    // Use: for loop + if + substring method
    String s8a = "abcba";
    String s8b = "cba";
    int counts8b = 0;
    for (int i = 0; i < s8a.length()-s8b.length()+1 ; i++){
      if (s8a.substring(i, i+s8b.length()).equals(s8b)){
        System.out.println(s8b + " is a substring.");
        counts8b++;
      }
    }
    if (counts8b == 0){
      System.out.println(s8b + " is not a substring.");
    }


    System.out.println("-------------- Q9");
    // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    String s9 = "pampers";
    char c9 = 'p';
    int countc9 = 0;
    for (int i = 0; i < s9.length(); i++){
      if (s9.charAt(i) == c9){
        countc9++;
      }
    }
    System.out.println("count = " + countc9);

    System.out.println("-------------- Q10");
    // 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};
    for (int i = 0; i < arr10.length; i++){
      arr10[i] = arr10[i].replace('x', 'k');
    }
    System.out.println(Arrays.toString(arr10)); 



    System.out.println("-------------- Q11");
    // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if
    String s11 = "kLKloOOu";
    int countUpper = 0;
    for (int i = 0; i < s11.length(); i++){
      if (s11.charAt(i) >= 'A' && s11.charAt(i) <= 'Z'){
        countUpper++;
      }
    }
    System.out.println("count uppercase = " + countUpper);

    System.out.println("-------------- Q12");
    // 12. Print the following pattern of * value
    // *****
    // *****
    // *****
    for (int i = 0; i < 3; i++){
      for (int j = 0; j < 5; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    //
    System.out.println("-------------- Q13");
    // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop

    // l -> 1 score
    // r -> 3 score
    // d -> 2 score
    // u -> 4 score
    // for other character, -1 score
    String s13 = "lrlaudbucp";
    int scoreS13 = 0;
    for (int i = 0; i < s13.length(); i++){
      switch (s13.charAt(i)){
        case 'l':
          scoreS13 += 1;
          break;
        case 'r':
          scoreS13 += 3;
          break;
        case 'd':
          scoreS13 += 2;
          break;
        case 'u':
          scoreS13 += 4;
          break;
        default:
    }
    }
    System.out.println(scoreS13);




    System.out.println("-------------- Q14");
    // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
    long[] arr14 = new long[4];
    arr14[0] = 1;
    arr14[1] = 4;
    arr14[2] = 9;
    arr14[3] = -4;

    System.out.println(Arrays.toString(arr14));

    System.out.println("-------------- Q15");
    // 15. Find the max value and min value in arr14
    // Use One Loop + if
    Long min = Long.MAX_VALUE;
    Long max = Long.MIN_VALUE;

    for (int i = 0; i < arr14.length; i++){
      if (arr14[i] < min){
        min = arr14[i];
      }
      if (arr14[i] > max){
        max = arr14[i];
      }
    }
    System.out.println("min = " + min);
    System.out.println("max = " + max);

    //
    System.out.println("-------------- Q16");
    // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.5
    float[] arr16 = new float[] {0.2f, 0.3f, 0.5f};
    System.out.println("float[] arr16 = new float[] {0.2f, 0.3f, 0.5f};");
    //
    System.out.println("-------------- Q17");
    // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.6]
    BigDecimal[] arr17 = new BigDecimal[arr16.length];
    for (int i = 0; i < arr16.length; i++){
      BigDecimal currentValue = BigDecimal.valueOf(arr16[i]);
            arr17[i] = currentValue.add(BigDecimal.valueOf(0.1)).setScale(1, RoundingMode.HALF_UP);
    }
    System.out.println(Arrays.toString(arr17));

    //
    System.out.println("-------------- Q17");
    // 18. Count the number of target strings in the String[]
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
    String target = "Tommy";
    // Print "count name=2"
    int countName = 0;
    for (int i = 0; i < arr18.length; i++){
      if (arr18[i].equals(target)){
        countName++;
      }
    }
    System.out.println("count name: "+ target +" = " + countName);


    System.out.println("-------------- Q19");
    // 19. swap the max digit and min digit
    // Assumption: each digit value appear once in the String
    // Print: "49280"
    String s19 = "40289";
    char maxDigit = s19.charAt(0);
    char minDigit = s19.charAt(0);
    for (int i = 1; i < s19.length(); i++) {
      if (s19.charAt(i) > maxDigit) {
          maxDigit = s19.charAt(i);
      }
      if (s19.charAt(i) < minDigit) {
          minDigit = s19.charAt(i);
      }  
    } 
    s19 = s19.replace(maxDigit, '*')//
             .replace(minDigit, maxDigit)//
             .replace('*', minDigit);
    System.out.println(s19);





    System.out.println("-------------- Q20");
    // 20. Find the longest String in the String array
    // Print "longest=programming"
    String[] arr20 = new String[] {"python", "array", "programming", "java", "bootcamp"};
    String longest = "";  
    for (int i = 0; i < arr20.length; i++){
      if (arr20[i].length() > longest.length()){
        longest = arr20[i];
      }
    }
    System.out.println("longest=" + longest);
    
  }
}