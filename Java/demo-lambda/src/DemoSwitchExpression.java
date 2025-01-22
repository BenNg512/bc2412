public class DemoSwitchExpression {
  public static void main(String[] args){
  //Switch + lambda
  }

  public static char gerColor(Color color){
    //! color will be red underline if any enum (or final case) is missing
    return switch(color){
      case RED -> 'R';
      case BLUE -> 'B';
      case YELLOW -> 'Y';
    };
  }
  public static char gerColor2(Color color){
    return switch(color){
      case RED -> {
        yield 'R';
      }
      case BLUE -> {
        yield 'B';
      }
      case YELLOW -> {
        yield 'Y';
      }
    };
  }
  
  
}
