public class BootCampException extends Exception{
  // once you extends the Exception class, your class becomes exception class
  // you can throw exception Object of this class
  public static void main(String[] args) throws Exception {
    // throw new BootCampException(); // syntax
    // throw new Cat(); // Class cat didn't extend Exception Family, it cannot be thrown

    
    // caller :
    try {
      throw new BootCampException();
    } catch (BootCampException e) {
      System.out.println("BootCampException handled"); // exception handler
    }

    // Write a method to throw BootCampException
    try {
      throw new BootCampException();
    } catch (BootCampException e) {
      System.out.println("BootCampException handled");
    }

  }
  
}
