import java.util.HashSet;
public class DemoHashSet {
  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    strings.add("ABC");
    strings.add("IJK");
    System.out.println(strings);
    System.out.println(strings.size());

    strings.add("ABC"); //! false, HashSet avoid duplicate items
    System.out.println(strings);
    System.out.println(strings.size());

    strings.add("XYZ");
    System.out.println(strings);
    System.out.println(strings.size());

    strings.remove("XYZ");
    System.out.println(strings);
    System.out.println(strings.size());
    strings.add("XXXX");
    strings.add("XXX3");
    strings.add("XXX4");
    strings.add("XXX0");
    strings.add("XXX1");
    strings.add("XXX2");

    // no remove by index in HashSet
    // can use this for loop to do so
    int targetRemoveIndex = 1; // remove 2nd book (index = 1)
    String targetRemoveString = null;
    int index = 0;
    for (String s : strings) {
      if (index == targetRemoveIndex) { // find index 1 String
        targetRemoveString = s;
        break;
      }
      index++;
    }
    strings.remove(targetRemoveString);
    System.out.println(strings);
    System.out.println(strings.size());



  }
  
}
