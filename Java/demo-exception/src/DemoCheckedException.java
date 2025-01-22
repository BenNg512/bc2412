public class DemoCheckedException extends Exception {
  // 2 Type: Checked Exception (compile error) / Unchecked Exception (runtime error)
  // Define Unchecked Exception first
  public static class BusinessException extends Exception {
  
  }

  public static class BusinessRuntimeException extends RuntimeException {
  
  }

  public static void main(String[] args) {
    int sum = 0;
    try{
      sum = sum(10, null);
      System.out.println("sum:" + sum);
    } catch (BusinessException e) {
      System.out.println("X and Y cannot be null");
    }

    sum = sum2(10, null); // compile time: syntax OK, but exception still exist
    //! explode at runtime 

    try{
      sum = sum2(10, null);
      System.out.println("sum:" + sum);
    } catch (BusinessRuntimeException e) {
      System.out.println("X and Y cannot be null");
    }


  }
  public static int sum(Integer x, Integer y) throws BusinessException {
    if (x == null || y == null)
      throw new BusinessException();
    return x.intValue() + y.intValue();      
  }
  public static int sum2(Integer x, Integer y) {
    if (x == null || y == null)
      throw new BusinessRuntimeException();
    return x.intValue() + y.intValue();      
  }

  
}
