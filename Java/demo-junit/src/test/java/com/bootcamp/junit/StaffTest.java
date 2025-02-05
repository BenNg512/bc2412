package com.bootcamp.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class StaffTest {
  @Test
  void testStaff_GetterSetter(){
    Staff s1 = new Staff();
    s1.setAge(18);
    s1.setName("John");
    Assertions.assertEquals(18, s1.getAge());
    Assertions.assertEquals("John", s1.getName());
  }

  @Test
  void testStaff_Equal(){
    Staff s1 = new Staff();
    s1.setName("John");
    Staff s2 = new Staff();
    s2.setName("John");
    Assertions.assertEquals(true, s1.equals(s2));
    Assertions.assertEquals(false, s1 == s2);
    Assertions.assertEquals(true, s1.getName().equals(s2.getName()));
  }
}
