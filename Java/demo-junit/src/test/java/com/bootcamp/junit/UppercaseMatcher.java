package com.bootcamp.junit;

import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.Description;

public class UppercaseMatcher extends TypeSafeMatcher<String> {

  @Override
  public boolean matchesSafely(String item) {
    return item.matches("[a-zA-Z0-9._]+@+[a-z]+.com");
    //return item.matches("[a-zA-Z0-9]+@");
  }

  @Override
  public void describeTo(Description description) { // pass by reference
    description.appendText("upper case only!");
  }
  
}
