import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoList {
  
  public static void main(String[] args) {
    List<String> string1 = new ArrayList<>();
    string1.add("abc");
    string1.add("def");

    List<String> string2 = new ArrayList<>(Arrays.asList("ABC","DEF"));
    string2.add("abc");
    string2.remove("def");
    string2.remove(0);

    // 2. Array.asList()

    List<String> string3 = Arrays.asList("abc", "def", "ijk");
    // string3.add("XYZ"); // UnsupportedOperationException
    // string3.remove("IJK"); // UnsupportedOperationException
    string3.set(0, "OPQ");
    System.out.println(string3);

    // 3. List.of()
    // Able to read only
    List<String> string4 = List.of("ABC", "dEf", "ijK");
    // string4.add("XYZ"); // UnsupportedOperationException
    // string4.remove("IJK"); // UnsupportedOperationException
    // string4.set(0, "OPQ"); // UnsupportedOperationException
    System.out.println(string4);




  }
  
}
