public class Calculator <T extends Number>{ //byte, short, int, long, float, double 
  // If we achieve the same purpose without generics
  // ByteCalculator.class
  // ShortCalculator.class
  // IntCalculator.class
  // LongCalculator.class
  // FloatCalculator.class
  // DoubleCalculator.class
  //! NumberCalculator.class

  private T x;
  private T y;

  public Calculator(T x, T y){
    this.x = x;
    this.y = y;
  }

  public Number sum(){
    //! Number * Number = 36
    if (this.x instanceof Byte && this.y instanceof Byte){
      // return this.x.byteValue() + this.y.byteValue(); // byte + byte = int
      return (byte) this.x + (byte) this.y;
    }else if(this.x instanceof Short && this.y instanceof Short){
      return this.x.shortValue() + this.y.shortValue();
    }else if(this.x instanceof Integer && this.y instanceof Integer){
      return this.x.intValue() + this.y.intValue();
    }else if(this.x instanceof Long && this.y instanceof Long){
      return this.x.longValue() + this.y.longValue();
    }else if(this.x instanceof Float && this.y instanceof Float){
      return this.x.floatValue() + this.y.floatValue();
    }else if(this.x instanceof Double && this.y instanceof Double){
      return this.x.doubleValue() + this.y.doubleValue();
    }
      return null;
  }

  public static void main(String[] args) {
    Calculator<Byte> calculator = 
    new Calculator<>(Byte.valueOf("10"), Byte.valueOf("20"));
    Calculator<Number> calculator2 = 
    new Calculator<>(Byte.valueOf("10"), Byte.valueOf("20"));
    // private number x
    // private number y

    // 30-40 ppl/F 
    // 30/F, no limited no. of lifts
    //! what's the actual output client wants
    // purpose and environment, peak hours


  }
}
