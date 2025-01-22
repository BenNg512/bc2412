import java.util.Scanner;

public class ExceptionExercise4 {

  // Follow the instructions below to complete the User Registration Process.
  public static void main(String[] args) throws UserRegistrationException {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter username: ");
    String username = scanner.nextLine();

    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    System.out.print("Enter email: ");
    String email = scanner.nextLine();

    // code here ...
    try{
      registerUser(username, password, email);
      validateUsername(username);
      validatePassword(password);
      validateEmail(email);
      System.out.println("User Registration is Successful.");
    } catch (IllegalArgumentException e) {
      System.out.println("User Registration is Failed.");
    } 
    // call method registerUser(), handle the exception to print "User Registration is Fail."
    // or "User Registration is Success."

    scanner.close();

  }

  // Call validateUsername(), validatePassword() and validateEmail()
  // if anyone of the above throw exception, this method registerUser() should throw custom
  // exception UserRegistrationException.
  // otherwise, print "User registered successfully: jackywong", where jackywong is the username.
  public static void registerUser(String username, String password, String email) throws UserRegistrationException {
    try {
      validateUsername(username);
      validatePassword(password);
      validateEmail(email);
      System.out.println("User registered successfully: " + username);
    } catch (IllegalArgumentException e) {
      throw new UserRegistrationException();
    }

  }

  // Throw IllegalArgumentException if String username is null or empty string
  private static void validateUsername(String username) throws IllegalArgumentException {
    if (username == null || username.isEmpty()) {
      throw new IllegalArgumentException();
    }
  }

  // Throw IllegalArgumentException
  // if password is null or password length < 8 or it does not contain
  // any special characters of !@$&_
  private static void validatePassword(String password) throws IllegalArgumentException {
    if (password == null 
    || password.length() < 8 
    || !password.matches(".*[!@$&_].*")){ // contain at least 1 symbol -> false -> allowed
      throw new IllegalArgumentException();
    }
  }

  // Throw IllegalArgumentException if String email is null or it does not contain character @
  private static void validateEmail(String email) throws IllegalArgumentException {
    if (email == null || !email.contains("@")) {
      throw new IllegalArgumentException();
    }
  }
}