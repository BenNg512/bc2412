public class Printer {
  private Integer x;

  public Printer(Integer x){
    this.x = x;
  }

  public String print(){
    return "this is " + this.x;
  }

  public static void main(String[] args) {
    Printer p1 = new Printer(10);
    System.out.println(p1.print());
  }

  // 10 -> int 10 -> long 10
  GeneralPrinter<Long> longPrinter = new GeneralPrinter<>(10L);

}
