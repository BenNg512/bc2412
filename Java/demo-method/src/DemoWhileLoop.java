import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoWhileLoop {
  public static boolean isDuplicated(int[] arr, int newValue){
    for (int i = 0; i < arr.length; i++){
      if (arr[i] == newValue){
        return true;
      }
    }return false;
  }
  public static void main(String[] args){
    String end ="-------------- E N D --------------";
    // For loop
    for (int i = 0; i < 10; i+=2){
      System.out.println(i);
      }
    System.out.println(end);
    // While loop
    int j = 0; // declare the counter outside the loop
    while (j < 3){ // continue criteria
      System.out.println(j);
      j++; //! flexible to control j
    }
    System.out.println(end);
    //
    String s = "heeeeeeello";
    char target = 'e';
    int countTarget = 0; //! usually write something meaningful instead of character only
    boolean found= false;
    while (countTarget < s.length()){
      if (s.charAt(countTarget) == target){
        found = true;
      }
      countTarget++;
    }
    System.out.println(found);
    System.out.println(end);
    //
    int l = 0;
    while (l < 10){
      System.out.println(l);
      l++;
      l++;
      l++; // l += 3 -> 0, 3, 6, 9
    }
    System.out.println(end);
    // Random
    int number = new Random().nextInt(3); // 0-2
    System.out.println("Rand 0-2: " + number);
    System.out.println(end);
    //
    int markSixNo = new Random().nextInt(49) + 1; // 1-49
    int[] markSixArr = new int[6];
    // 1st no.(generate) -> second no.
    // if exist(count) -> generate again
    int count = 0;
    int value= 0;
    while (count < 6){
      value = new Random().nextInt(49) + 1;
      if(!isDuplicated(markSixArr, value)){
        markSixArr[count] = value; //! to add value to array, otherwise the arrays has no value
        // System.out.println(value);
        count++;
        }
    }System.out.println("Mark Six Numbers:" + Arrays.toString(markSixArr));
    System.out.println(end);
    // 1-100
    // bomb: 47
    //! Game
    //  please choose a number between 1-100 -> input 4 -> result : 4-100
    //  please choose a number between1-100 -> input 48 -> result : 4-48
    //  please choose a number between1-100 -> input 47 -> result : bomb!
    
    
    int min = 1;
    int max = 100;
    int bomb = new Random().nextInt(max)+1;
    int input = -1;
    // 
    while (bomb != input){
    System.out.println("Please choose a number between: " + min + " - " + max);//
    Scanner scanner = new Scanner (System.in);
    input = scanner.nextInt();
    // min, max
    if(input < min || input > max){
      continue;
    }
    if (input < bomb){
      min = input + 1;
    } else {
      max = input - 1;
    }
  }
    System.out.println(" Game over: BOOM!");
      //  if(input > bomb){
      //  min = input;
      //  System.out.println("Please choose a number between: " + min + " - " + max);
      //  continue;
      //  } else if(input < bomb){
      //  max = input;
      //  System.out.println("Please choose a number between: " + min + " - " + max);
      //  continue;
      //  } else if(input == bomb){
      //  System.out.println(" Game over: BOOM!");
      //  break;
      //}
      
      
        //
    
        System.out.println(end);
    




    
    
  
  
  
  }
}
