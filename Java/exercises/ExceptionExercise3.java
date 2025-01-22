import java.util.Scanner;

public class ExceptionExercise3 {
  // Question: Create a custom exception called InvalidAgeException. Throw this exception if a user
  // enters an age less than 18.

  // 1. If NumberFormatException is caught, print "Error: Please enter a valid number."
  // 2. Pass the age number into a static method checkAge(). 
  // This method will throw a custom exception InvalidAgeException if the age < 18; otherwise, print "Age X is accepted".
  // 3. For the method caller, handle the potential exception by printing "Age is invalid. Please input again later."
  private static class InvalidAgeException extends Exception {

  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String age = scanner.nextLine();
    // code here for the caller...
    try{
      int ageInt = Integer.parseInt(age);
      checkAge(ageInt);
      System.out.println("Age " + age + " is accepted.");
    } catch (NumberFormatException e) {
      System.out.println("Error: Please enter a valid number. (Integer)");
    } catch (InvalidAgeException e) {
      System.out.println("Age is invalid. Please input again later. (Age >= 18)");
    } 

    scanner.close();
  }

  // code here for the method
  public static void checkAge(int age) throws InvalidAgeException {
    if (age < 18) {
      throw new InvalidAgeException();
    }
  }
}