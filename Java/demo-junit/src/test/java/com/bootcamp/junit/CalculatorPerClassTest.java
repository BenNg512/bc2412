package com.bootcamp.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Calculator.java Tests")
public class CalculatorPerClassTest {
  private int x; // test environment variable
  //! x is the same x for each test
  @BeforeAll
  void intiAll(){
    System.out.println("Before All Test Cases");
  }
  @AfterAll
  void afterAll(){
    System.out.println("After All Test Cases");
  }
  @BeforeEach
  void beforeEach(){
    System.out.println("Before Each Test Case, clear or reset something");
    // this.x = 0;
  }
  @AfterEach
  void AfterEach(){
    System.out.println("After Each Test Case, clear or reset something");
    // this.x = 0;
  }



  @Test
  void testSum(){
    this.x += Calculator.sum2(1,2);
    Assertions.assertEquals(3, this.x);
  }
  @Test
  void testSum2(){
    this.x += Calculator.sum2(1,2);
    Assertions.assertEquals(6, this.x);
  }

  // per class test: object


}
