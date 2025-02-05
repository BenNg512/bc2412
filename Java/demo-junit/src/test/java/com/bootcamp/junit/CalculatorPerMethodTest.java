package com.bootcamp.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class CalculatorPerMethodTest {
  private int x;
  //! x is independent for each test

  @Test
  void testSum(){
    this.x += Calculator.sum2(1,2);
    Assertions.assertEquals(3, this.x); //x+y+1
  }
  @Test
  void testSum2(){
    this.x += Calculator.sum2(1,2);
    Assertions.assertEquals(3, this.x);
  }
  
}
