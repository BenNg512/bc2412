public class LoginManager{
  private String username;
  private String password;

  public LoginManager(String username, String password) {
    this.username = username;
    this.password = password;
  }

  // Approach 2: BusinessRuntimeException
  public static class BusinessRuntimeException extends RuntimeException {
    public static BusinessRuntimeException of (SysError sysErr) { // Best Design
      return new BusinessRuntimeException(sysErr);
    }
    private BusinessRuntimeException (SysError sysErr) {
    super(sysErr.getDesc());
    }

    // private BusinessRuntimeException(String message) {
    //  super(message);
    // }
  }
  // Approach 1: Throw custom exception
  public static class InvalidUserNameException extends RuntimeException {
    public InvalidUserNameException(String message) {
      super(message);
      
    }
  }
  public static class InvalidPasswordException extends RuntimeException {
    public InvalidPasswordException(String message) {
      super(message);
    }
  }

  public void validateUsername() {
    if (this.username == null || this.username.isEmpty()) {
      throw new InvalidUserNameException("User Name is Invalid: " + this.username);
    }
  }

  public void validatePassword() {
    if (this.password == null || this.password.length() < 8
        || (!this.password.contains("@") && !this.password.contains("!")
            && !this.password.contains("$") && !this.password.contains("&")
            && !this.password.contains("_"))) {
      throw new InvalidPasswordException("Password is Invalid: " + this.password);
    }
  }

  public void validateUsername2() {
    if (this.username == null || this.username.isEmpty()) {
      throw BusinessRuntimeException.of(SysError.INVALID_USERNAME);
    }
  }

  public void validatePassword2() {
    if (this.password == null || this.password.length() < 8
        || (!this.password.contains("@") && !this.password.contains("!")
            && !this.password.contains("$") && !this.password.contains("&")
            && !this.password.contains("_"))) {
      throw BusinessRuntimeException.of(SysError.INVALID_PASSWORD);
    }
  }

   // Follow the instructions below to complete the User Registration Process.
  public static void main(String[] args) {
    LoginManager loginManager = new LoginManager("AAA", "password!"); // returnInvalidPasswordException in runtime
    // Approach 1
    try{
    loginManager.validateUsername();
    loginManager.validatePassword();
      System.out.println("Validation success.");
    } catch (InvalidPasswordException e) {
      System.out.println(e.getMessage());
    } catch (InvalidUserNameException e) {
      System.out.println(e.getMessage());
    }

    // 2. 
    LoginManager loginManager2 = new LoginManager("AAA", "password"); // returnInvalidPasswordException in runtime
    // 1. We can
    try{
    loginManager2.validateUsername2();
    loginManager2.validatePassword2();
      System.out.println("Validation success.");
    } catch (BusinessRuntimeException e) {
      System.out.println(e.getMessage());
    } 
  
  
  }
}
