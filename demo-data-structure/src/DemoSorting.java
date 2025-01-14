import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DemoSorting {
  public static void main(String[] args) {  
    // bubble sort (need Loop)
    List<Integer> integer = Arrays.asList(1, 3, 10, -4, 2);
    Collections.sort(integer);
    System.out.println(integer);
  
  int[] arr = new int[] {10, 2, 9};
  allZero(arr);
  System.out.println(Arrays.toString(arr));
  // In java,  array & all custom type is pass by reference
  // Wrapper class & String & Primitive type is pass by value (a copy of value)
  Book book = new Book("abc");
  changeBookName(book); // pass by book reference
  System.out.println(book.getName());

  int a = 3;
  int b = 4;
  System.out.println(sum(a, b)); // pass by value
  System.out.println(a); // 3
  System.out.println(b); // 4

  BigDecimal original = new BigDecimal("3.14");
  BigDecimal delta = new BigDecimal("1.23");
  System.out.println(addBigDecimal(original, delta));
  System.out.println(original);

  // Sort String by Collection.sort(){}
  List<String> string = Arrays.asList("bbb", "kdb", "bcdd", "abcccc");
  Collections.sort(string);
  System.out.println(string);

  
  }
  public static int sum(int x, int y) {
    x = 100;
    y = 200;
    return x + y;
  }
  public static String concat(String x, String y) {
    return x.concat(y);
  }
  public static long multiply(long x, long y) {
    return (long) x  * (long) y; // avoid overflow
  }

  public static void allZero(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      arr[i] = 0;
    }
  }
  public static void changeBookName(Book book) {
    book.setName("hello"); // change the name attribute only. New object is not created
  }
  // BigDecimal pass by value
  // Similar to String
  public static BigDecimal addBigDecimal(BigDecimal original, BigDecimal delta) {
    return original.add(delta); // always return a new object
  }


}