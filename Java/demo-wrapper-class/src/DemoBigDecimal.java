import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    double result = 0.1 + 0.2;
    Double result2 = 0.1 + 0.2;
    System.out.println("double ANS: "+ result);
    System.out.println("Double ANS: "+ result2); // 0.30000000000000004
    if (result == 0.3){
      System.out.println("result is 0.3");
    } else {
      System.out.println("result is not 0.3");
    }

    // BigDecimal
    BigDecimal bd1 = BigDecimal.valueOf(0.1);
    BigDecimal bd2 = BigDecimal.valueOf(0.2);
    BigDecimal bd3 = BigDecimal.valueOf(0.3);
    BigDecimal ansSum = bd1.add(bd2);
    System.out.println("0.1 + 0.2 = " + ansSum); // 0.3

    System.out.println(0.3 - 0.1); // 0.19999999999999998
    BigDecimal ansSubtract = bd3.subtract(bd1);
    System.out.println("0.3 - 0.2 = " + ansSubtract); // 0.2

    // 0.1 * 0.2 multiply
    System.out.println(0.1 * 0.2); 
    BigDecimal ansMultiply = bd1.multiply(bd2);
    System.out.println("0.1 * 0.2 = " + ansMultiply);

    // 0.3 / 0.1 divide
    System.out.println(0.3 / 0.1); 
    BigDecimal ansDivide = bd3.divide(bd1);
    System.out.println("0.3 / 0.1 = " + ansDivide.doubleValue());

    BigDecimal bd10 = BigDecimal.valueOf(10);
    BigDecimal bd03 = BigDecimal.valueOf(3);
    BigDecimal ansDivide2 = bd10.divide(bd03,BigDecimal.ROUND_DOWN);
    //BigDecimal ansDivide3 = bd10.doubleValue();
    
    System.out.println(ansDivide2.doubleValue()); // 3.0
    //System.out.println(ansDivide3);
    BigDecimal bd16 = BigDecimal.valueOf(4.566).setScale(2, RoundingMode.HALF_DOWN);
    System.out.println(bd16.doubleValue());

    // round
    BigDecimal bd17 = BigDecimal.valueOf(4.564).setScale(2, RoundingMode.HALF_UP);//! 0.004 -> down, 0.005 -> up
    BigDecimal bd18 = BigDecimal.valueOf(4.565).setScale(2, RoundingMode.HALF_DOWN); //! 0.005 -> down, 0.006 -> up 
    BigDecimal bd19 = BigDecimal.valueOf(4.565).setScale(2, RoundingMode.HALF_EVEN);

    System.out.println("UP :" + bd17.doubleValue());
    System.out.println("DOWN :" + bd18.doubleValue());
    System.out.println("EVEN: "+ bd19.doubleValue());

    BigDecimal bd20 = BigDecimal.valueOf(4.565);
    System.out.println(bd20.setScale(2, RoundingMode.UP));
    System.out.println(bd20.setScale(2, RoundingMode.DOWN));
    System.out.println(bd20.setScale(2, RoundingMode.HALF_UP));
    System.out.println(bd20.setScale(2, RoundingMode.HALF_DOWN));

    double length = 4.2;
    double squareArea = length * length;
    System.out.println(BigDecimal.valueOf(squareArea).doubleValue());


    BigDecimal length2 = BigDecimal.valueOf(length);
    BigDecimal squareArea2 = length2.multiply(length2);
    System.out.println(squareArea2);

    double squareArea3 = BigDecimal.valueOf(length)//
        .multiply(BigDecimal.valueOf(length))// or write .pow(2)
        .doubleValue();
    System.out.println(squareArea3);

    // Math
    double pi = 3.14159;
    double radius = 5.0;
    double area = BigDecimal.valueOf(radius).pow(2).doubleValue() * Math.PI;
    System.out.println(area);

    double area2 = BigDecimal.valueOf(Math.pow(radius, 2.0))
        .multiply(BigDecimal.valueOf(Math.PI))
        .doubleValue();

    int x = 8;
    int y = 9;
    int max = Integer.MIN_VALUE;
    max = Math.max(x, max); // If (x > max, max = x);
    max = Math.max(y, max);
    
    int[] arr = new int[] {10, 9, 3};
      for (int i = 0; i < arr.length; i++) {
        max = Math.max(arr[i], max);
    }
    System.out.println(max);

    System.out.println(Math.sqrt(9)); // 3.0, Java auto convert it to double
    System.out.println(Math.sqrt(-10)); // NaN

    // Round
    double u = 3.456;
    System.out.println(Math.round(u)); // 3
    System.out.println(Math.round(u * 100.0) / 100.0); // 3.46
    double u2 = 3.556;
    System.out.println(Math.round(u2)); // 4
    System.out.println(Math.round(u2 * 100.0) / 100.0 ); // 3.56

    System.out.println(Math.abs(-9L));  // 9


}
}
