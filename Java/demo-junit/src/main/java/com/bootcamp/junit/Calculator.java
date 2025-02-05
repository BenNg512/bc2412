package com.bootcamp.junit;

public class Calculator {
  public static int sum(int x, int y) {
    // day 1 
    // return x + y;
    // day 2
    return x + y + 1;
  }  public static int sum2(int x, int y) {
    // day 1 
    // return x + y;
    // day 2
    return x + y;
  }

  public static int methodB(int a){
    return a + sum(a, a + 2);
  }


  public static void main( String[] args )
  {
      System.out.println(sum(1,2));
  }
  
}


