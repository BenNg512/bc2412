// package questions;

public class JavaQuest5 {
  /**
   * Expected output:
   * The index of the last character of c is 11
   */
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic

    // if not found, print "Not Found."
    int targetCharIndex = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target){
      targetCharIndex = i;
      // System.out.println("Found target char at index: " + targetCharIndex);
      }     
    } 
    if (targetCharIndex == 0){
      System.out.println("Not Found.");
    } else {
      System.out.println("The index of the last character of c is " + targetCharIndex);
    }
    
    // code here ...

  }
}