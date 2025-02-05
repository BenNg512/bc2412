package com.bootcamp.junit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode; // what if extends? need to override something
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// JDK (Java Development Kit) = Dev Library/Tool + JRE + JVM
// Dev Lib => java c, class Library (BigDecimal)
// 1. some of the library auto-imported by Java Project (i.e java.lang)
// 2. but some of them has to manually import
// 3. Maven: download external (outside JDK) library from maven public (i.e lombok)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
public class Staff {
  private String name;
  private int age;

  public static void main(String[] args) {

  }
  
}
