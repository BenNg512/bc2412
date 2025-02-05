package com.bootcamp.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//! mvn compile: compile the code
//! mvn testCompile: "mvn compile" + test the code
//! mvn test: "mvn testCompile" + run all the code
//! mvn package: "mvn test" + package jar
//! mvn install: "mvn package" + install jar to m2

//! mvn clean: clean the target folder
//! mvn install: run the codes again, return error while codes fail

public class CalculatorTest {
  // Unit test = requires a framework to compile the actual and expected result
  // Definition of PASS: 
  @Test
  void testSum(){
    // TC1 : 1 + 2 = 3
    // TC2 : 2 + 3 = 5
    // TC3 : 2 + 4 = 6
    // day 1
    // Assertions.assertEquals(3, Calculator.sum(1,2));
    // Assertions.assertEquals(2, Calculator.sum(-1,3));
    // Assertions.assertEquals(0, Calculator.sum(0,0));
    //! if actual result != expected result, the test will fail (maven throws error)
    //! fail and cannot pass through the test cycle
    // day 2
    Assertions.assertEquals(4, Calculator.sum(1,2));
    Assertions.assertEquals(3, Calculator.sum(-1,3));
    Assertions.assertEquals(1, Calculator.sum(0,0));
  }
  @Test 
  void testSum2(){
    // day 1
    // Assertions.assertEquals(-5, Calculator.sum(-1,-4));
    // day 2
    Assertions.assertEquals(-4, Calculator.sum(-1,-4));
  }

  // Mockito
  @Test
  void testMethodB(){
    Assertions.assertEquals(24, Calculator.methodB(7));
  }


}
