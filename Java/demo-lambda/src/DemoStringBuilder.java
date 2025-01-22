public class DemoStringBuilder {
  public static void main(String[] args) {
    String s = "hello";
    s += "!!!";
    s += "???";
    System.out.println(s);

    long before = System.currentTimeMillis();
    for (int i = 0; i < 100000; i++){
      s += "!";
    }
    long after = System.currentTimeMillis();
    System.out.println(after-before); // 230-350 ms

    StringBuilder sb = new StringBuilder("");
    before = System.currentTimeMillis();
    for (int i = 0; i < 100000; i++){
      sb.append("!");
      // or write sb = sb.append("!");
    }
    after = System.currentTimeMillis();
    System.out.println(after-before); // 2-3 ms

    StringBuilder sb2 = new StringBuilder("ABC");
    sb2.reverse();
    System.out.println(sb2); // CBA

    System.out.println(sb2.charAt(2)); // A
    sb2.replace(0, 2, "YY"); 
    System.out.println(sb2); // YYA

    sb2.setCharAt(2, 'O');
    System.out.println(sb2); // YYO

    sb2.insert(1, "!!!");
    System.out.println(sb2); // Y!!!YO

  }
  
}
