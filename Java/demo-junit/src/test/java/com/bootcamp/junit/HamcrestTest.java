package com.bootcamp.junit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.List;
import org.junit.jupiter.api.Test;

public class HamcrestTest {
  @Test
  void testBasic() {
    assertThat(Calculator.sum2(1,2), is(equalTo(3)));
    assertThat(10, is(greaterThan(4)));
    String s = null;
    assertThat(s, nullValue());
    String s1 = "hello";
    String s2 = "hello";
    assertThat(s2, is(sameInstance(s1)));
    assertThat(s1, is(equalTo(s2)));
  }

  // List
  @Test
  void testList(){
    List<String> names = List.of("John", "Jane", "Jack");
    assertThat(names, hasSize(3));
    assertThat(names, hasItem("John"));
    assertThat(names, hasItems("John", "Jane"));

    assertThat(names, contains("John", "Jane", "Jack"));
    assertThat(names, containsInAnyOrder("John", "Jack", "Jane"));

  }

  @Test
  void testNum(){
    double tolerance = 0.01d;
    double actual = 3.14159d;

    assertThat(actual, closeTo(3.14, tolerance)); // 3.14 ~ 3.15
    //assertThat(actual, not(closeTo(3.15, tolerance))); // 3.14 ~ 3.15
    //assertThat(actual, closeTo(3.16, tolerance));
  }

  @Test
  void testInstance(){
    assertThat(Long.class, typeCompatibleWith(Number.class));
    assertThat(String.class, instanceOf(Number.class));
    assertThat(StringBuilder.class, instanceOf(Long.class));
  }
  @Test
  void testUppercase(){
    assertThat("Hello", UppercaseMatcher.matchesSafely("Hello"));
    assertThat("abc", anyOf(startsWith("a"), endsWith("c")));
    assertThat("abc", not(anyOf(startsWith("a"), endsWith("d"))));

  }

}


