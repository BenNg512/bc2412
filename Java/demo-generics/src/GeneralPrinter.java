// General Design -> Reduce Number of class
public class GeneralPrinter <T> {
  private T value;

  public GeneralPrinter(T value){
    this.value = value;
  }
  public T getValue(){
    return this.value;
  }
  public String print(){ // String + anything = String
    return "this is " + this.value.toString(); 
    // add toString -> more safer and sure it's String
    // or write this but risky;
    // return (String) this.value; 
  }
  public static void main(String[] args) {
    GeneralPrinter<Integer> printer = new GeneralPrinter<>(Integer.valueOf(0));
    System.out.println(printer.print());

    GeneralPrinter<Object> printer2 = new GeneralPrinter<>(Integer.valueOf(3));
    System.out.println(printer2.print());

    Object obj = 3;
    if (obj instanceof Integer){
      Integer integer = (Integer) obj;
      System.out.println(integer.compareTo(2));
    }
  }

}
