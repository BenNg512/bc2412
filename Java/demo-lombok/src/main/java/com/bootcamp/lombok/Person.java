package com.bootcamp.lombok;

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
public class Person {
  private String name;
  private int age;

  public void main(String[] args) {
    Person p1 = new Person();
    p1.setAge(20);
    Person p2 = new Person("Tommy", 10);
    System.out.println(p1.getName());
    System.out.println(p2.getAge());

    Person p3 = new Person("Tommy", 10); 
    System.out.println(p2.hashCode() == p3.hashCode());
    Person p4 = Person.builder().name("Tommy").age(10).build();
    
  }
  
}