public class DemoRecursion {
  public static void main(String[] args) {
    // 1+2+...+10;
    int sum = 0;
    for (int i =1; i <= 10; i++){
      sum = sum + i;
    }
    System.out.println("sum:" + sum); // 55

    // Recursion
    System.out.println(sum(10));
    System.out.println(oddNumProduct(3)); // 3
    System.out.println(oddNumProduct(4)); 
    System.out.println(oddNumProduct(5)); // 15
    System.out.println(oddNumProduct(6)); // 
    System.out.println(oddNumProduct(7)); // 105
    System.out.println(oddNumProduct(8)); // 
  
  
  }
    public static int sum(int value){
      // base criteria (exit)
      if (value <= 1 )
      return value;
      // invoke self
      return value + sum(value - 1);
    }

    // 1*3*5*7*....*n
    public static int oddNumProduct(int n){
      // base criteria (exit)
      if (n <= 1){
        if (n % 2 == 0){
        return 1;
        } else {
        return n;
        }// invoke self
      
    }return n * oddNumProduct(n - 1);
    
  }
}
