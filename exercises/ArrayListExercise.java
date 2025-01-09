import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class ArrayListExercise {
  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    // 1c. Print all the elements in the list.
    // 1d. Remove the number 30 from the list.
    // 1e. Print the size of the list.
    System.out.println("Q1)");
    // 1a
    ArrayList<Integer> numbers = new ArrayList<>();
    // 1b
    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    numbers.add(50);
    // 1c
    System.out.println(numbers);
    // 1d
    numbers.remove(2);
    // 1e
    System.out.println(numbers.size());
    System.out.println();  
    

    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.
    System.out.println("Q2)");
    // 2a
    ArrayList<String> fruits = new ArrayList<>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Mango");
    fruits.add("Orange");
    // 2b
    if (fruits.contains("Grapes") == false) {
      // 2c
      fruits.add("Grapes");
    }
    // 2d
    fruits.set(2, "Peach");
    // 2e
    System.out.println(fruits);
    System.out.println();  

    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.
    System.out.println("Q3)");
    // 3a
    ArrayList<Integer> num2 = new ArrayList<>();
    num2.add(10);
    num2.add(20);
    num2.add(10);
    num2.add(30);
    num2.add(40);
    num2.add(20);
    num2.add(50);
    // 3b
    HashSet<Integer> num3 = new HashSet<>(num2);
    // 3c
    System.out.println(num3);
    System.out.println();  


    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.
    System.out.println("Q4)");
    // 4a
    HashSet<String> countries = new HashSet<>();
    countries.add("USA");
    countries.add("India");
    countries.add("China");
    countries.add("Japan");
    // 4b
    countries.add("Canada");
    // 4c
    System.out.println(countries.contains("India"));
    // 4d
    System.out.println(countries);
    System.out.println();  

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of integers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.
    System.out.println("Q5)");
    // 5a
    HashSet<Double> num4 = new HashSet<>();
    num4.add(1.1);
    num4.add(2.2);
    num4.add(3.3);
    num4.add(4.4);
    num4.add(5.5);
    // 5b
    System.out.println(num4.contains(3.3)); //true
    // 5c
    num4.remove(2.2);
    // 5d
    System.out.println(num4.size());
    System.out.println();  

    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.
    System.out.println("Q6)");
    // 6b
    HashSet<Integer> set1 = new HashSet<>();
    set1.add(10);
    set1.add(20);
    set1.add(30);
    set1.add(40);
    // 6c
    HashSet<Integer> set2 = new HashSet<>();
    set2.add(30);
    set2.add(40);
    set2.add(50);
    set2.add(60);
    // 6d
    for (Integer num : set1) {
      if (set2.contains(num)) {
        // 6e
        System.out.println(num);
      }
    }
    System.out.println();

    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.
    System.out.println("Q7)");
    // 7a
    HashSet<String> names = new HashSet<>();
    names.add("Cherry");
    names.add("Steve");
    names.add("Chole");
    names.add("Jenny");
    names.add("Vicky");
    // 7b
    ArrayList<String> nameArray = new ArrayList<>(names);
    // 7c
    System.out.println(nameArray);
    System.out.println();

    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'
    System.out.println("Q8)");
    // 8a
    ArrayList<Student> students = new ArrayList<>();
    // 8b
    students.add(new Student(1, "Alice"));
    students.add(new Student(2, "Bob"));
    students.add(new Student(3, "Charlie"));
    for (Student student : students) {
      System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
    }
    // 8c
    students.remove(new Student(2, "Bob")); // add equals @Override
    for (Student student : students) {
      System.out.println(student.getName());
    }
    // 8d
    System.out.println(searchById(students, 1));
    System.out.println(searchById(students, 2));
    System.out.println(searchById(students, 3));
    // 8e
    ArrayList<Student> studentsA = new ArrayList<>();
    for (Student s : students) {
      if (s.getName().startsWith("A")) {
        studentsA.add(s);
      }
    }
    for (Student s : studentsA) {
      System.out.println("8e: " + s.getName());
    }
    System.out.println();


    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.
    System.out.println("Q9)");
    // 9a
    HashSet<Student> std1 = new HashSet<>();
    std1.add(new Student(1, "Alice"));
    std1.add(new Student(2, "Bob"));
    std1.add(new Student(3, "Charlie"));
    HashSet<Student> std2 = new HashSet<>();
    std2.add(new Student(2, "Bob"));
    std2.add(new Student(3, "Charlie"));
    std2.add(new Student(4, "David"));
    // 9b
    HashSet<Student> commonStudents = new HashSet<>();
    for (Student s1 : std1) {
      for (Student s2 : std2) {
        if (s1.getName().equals(s2.getName())) {
          commonStudents.add(s1);
        }
      }
    }

    // 9c
    for (Student student : commonStudents) {
      System.out.println(student.getName());
    }
        
  }
    public static String searchById(ArrayList<Student> students, int id) {
      for (Student student : students) {
        if (student.getId() == id) {
          return student.getName();
        }
      }
      return "Student not found";
    }
    
    public static class Student {
    private int id;
    private String name;
    // Constructor
    // getter, setter, etc.
    public Student(int id, String name) {
      this.id = id;
      this.name = name;
    }
    public int getId() {
      return id;
    }
    public String getName() {
      return name;
    }
    public void setId(int id) {
      this.id = id;
    }
    public void setName(String name) {
      this.name = name;
    }
    
    @Override
    public boolean equals(Object obj){
      if (this == obj)
        return true;
      if (!(obj instanceof Student))
        return false;
        Student s = (Student) obj;
        return Objects.equals(this.name, s.getName());
    } 

  }
}