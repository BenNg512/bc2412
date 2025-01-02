public class DemoInteger {
  public static void main(String[] args) {
  Integer x1 = 3;                     // 1841205829
  Integer x2 = 3;                     // 1841205829
  Integer x3 = new Integer(3);        // 1933863327
  Integer x4 = Integer.valueOf(3);    // 1841205829

  System.out.println(System.identityHashCode(x1));
  System.out.println(System.identityHashCode(x2));
  System.out.println(System.identityHashCode(x3));
  System.out.println(System.identityHashCode(x4));
  System.out.println("---------------------------");
  // Cache Range //! Different address
  Integer x5 = 128;
  Integer x6 = 128;
  System.out.println(System.identityHashCode(x5)); // 112810359
  System.out.println(System.identityHashCode(x6)); // 2124308362
  Integer x7 = new Integer(128);
  Integer x8 = Integer.valueOf(128);
  System.out.println(System.identityHashCode(x7)); // 146589023
  System.out.println(System.identityHashCode(x8)); // 1482968390
  //! Same for Byte, Short, Long
  System.out.println("---------------------------");
  
  Character c1 = 'a';
  Character c2 = 'a'; // == c1
  Character c3 = '你'; 
  Character c4 = '你'; // != c3
  System.out.println(System.identityHashCode(c1));
  System.out.println(System.identityHashCode(c2));
  System.out.println(System.identityHashCode(c3));
  System.out.println(System.identityHashCode(c4));
  System.out.println("---------------------------");

  boolean b1 = true;
  boolean b2 = true; // == b1
  System.out.println(System.identityHashCode(b1));
  System.out.println(System.identityHashCode(b2));
  System.out.println("---------------------------");

  // Not support internal cache: Float & Double (Objects) //! not float & double
  Float f1 = 3.9f;
  Float f2 = 3.9f; // != f1
  System.out.println(System.identityHashCode(f1));
  System.out.println(System.identityHashCode(f2));
  System.out.println("---------------------------");
  Double d1 = 3.9;
  Double d2 = 3.9; // != d1
  System.out.println(System.identityHashCode(d1));
  System.out.println(System.identityHashCode(d2));
  System.out.println("---------------------------");

  //! Most important
  // >, <, ==, != for Primitive type only
  //! Never use symbols for Objects: String, Double, Integer...
  Double d3 = 10.3;
  Double d4 = 10.1;
  Double d5 = 10.3;
  //! use compareTo() for objects
  if(d3 > 10.3){ //! not OK
  }
  if (d3.compareTo(10.3) > 0){ //! OK
  }
  if (d3.compareTo(d4) > 0){ 
    System.out.println("d3 > d4");
  }
  if (d3.compareTo(d4) < 0){ 
    System.out.println("d3 < d4");
  }
  if (d3.equals(d5)){ // d3.compareTo(d5) == 0
    System.out.println("d3 == d5"); 
  }

}
}
