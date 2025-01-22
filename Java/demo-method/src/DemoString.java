public class DemoString {
  public static void main(String[] args){
    String s1 = "hello";
    System.out.println(s1.length());
    System.out.println(s1.charAt(1));
    System.out.println("hello".equals(s1));
    System.out.println(s1.substring(0,2));
    System.out.println("------");
    //
    System.out.println(s1.contains("llo"));
    System.out.println(s1.concat("!!!"));
    System.out.println(s1.startsWith("h"));
    System.out.println(s1.endsWith("h"));
    System.out.println(s1.toUpperCase()); //HELLO
    System.out.println(s1.toLowerCase()); // hello
    System.out.println("HELLO".toLowerCase());
    System.out.println("------");
    //
    System.out.println(s1.replace("ll","XXXXX")); // heXXXXXo
    System.out.println(s1.equalsIgnoreCase("HeLlo")); // true

    System.out.println(s1.indexOf("e")); // 1
    System.out.println(s1.indexOf("h")); // 0
    System.out.println(s1.indexOf("x")); // -1 : does not exist
    System.out.println(s1.indexOf("o")); // 4
    System.out.println(s1.indexOf("ll"));
    System.out.println("------");
    //
    System.out.println(s1.lastIndexOf("l"));
    System.out.println("".isEmpty());
    System.out.println(" ".isEmpty());
    System.out.println("".isBlank()); 
    System.out.println(" ".isBlank()); 

    System.out.println(" Hel L o ".trim()); // trim 1st and last space 
    //! compareTo
    System.out.println("aaa".compareTo("zxy")); // -25: a compare to z
    System.out.println("aaa".compareTo("abc")); // -1
    System.out.println("aaa".compareTo("bac")); // -1
    System.out.println("aaa".compareTo("cab")); // -2
    System.out.println("zhb".compareTo("zab")); 
    System.out.println("zab".compareTo("zah")); 
    System.out.println("zga".compareTo("bga")); 

    System.out.println(Math.abs(-99));

    // Chain Method
    System.out.println("hello".concat("Ijk").toUpperCase());
    //
    // CharAt()





  }
}
