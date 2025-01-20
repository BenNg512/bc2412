import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExercise {
  private static class Student{
    private String name;
    private int score;

    public Student(String name, int score){
      this.name = name;
      this.score = score;
    }
    public String getName(){
      return this.name;
    }
    public int getScore(){
      return this.score;
    }
  }
  private static class Employee{
    private String name;
    private int salary;

    public Employee(String name, int salary){
      this.name = name;
      this.salary = salary;
    }
    public String getName(){
      return this.name;
    }
    public int getSalary(){
      return this.salary;
    }
  }
  private static class Person{
    private String name;
    private int age;

    public Person(String name, int age){
      this.name = name;
      this.age = age;
    }
    public String getName(){
      return this.name;
    }
    public int getAge(){
      return this.age;
    }
    @Override
    public String toString() {
      return "Person(name=" + this.name + ", age=" + this.age + ")";
    }
  }

  private enum Gender{
    MALE, 
    FEMALE,
    ;
  }

  private static class Staff{
    private String name;
    private Gender gender;

    public Staff(String name, Gender gender){
      this.name = name;
      this.gender = gender;
    }
    public String getName(){
      return this.name;
    }
    public Gender getGender(){
      return this.gender;
    }
  }

  private static class Product{
    private String name;
    private int price;

    public Product(String name, int price){
      this.name = name;
      this.price = price;
    }
    public String getName(){
      return this.name;
    }
    public int getPrice(){
      return this.price;
    }
  }
  private static class Worker{
    private String name;
    private String department;

    public Worker(String name, String department){
      this.name = name;
      this.department = department;
    }
    public String getName(){
      return this.name;
    }
    public String getDepartment(){
      return this.department;
    }
  }
  private static class Children{
    private String name;
    private int score;

    public Children(String name, int score){
      this.name = name;
      this.score = score;
    }
    public String getName(){
      return this.name;
    }
    public int getScore(){
      return this.score;
    }
    
  }


  public static void main(String[] args) {
    // 1. Basic Stream Operations
    // Task: Given a list of integers, use a stream to find all the even numbers, square them, and then
    // sort the result in descending order.
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Output: [100, 64, 36, 16, 4]
    List<Integer> evenNumbersProducts = numbers.stream()
        .filter(e -> e % 2 == 0)
        .map(e -> e * e)
        .sorted((a, b) -> b > a? 1 : -1) //! or use sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());
    System.out.println(evenNumbersProducts);



    // 2. Filtering and Collecting
    // Task: Given a list of names, filter the names that start with "A" and collect them into a list.
    List<String> names =
        Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
    // Output: [Alice, Annie, Alex]
    List<String> filteredNames = names.stream()
        .filter(e -> e.startsWith("A"))
        .collect(Collectors.toList());
    System.out.println(filteredNames);


    // 3. Finding Maximum and Minimum
    // Task: Given a list of integers, find the maximum and minimum values using Streams.
    List<Integer> numbers2 = Arrays.asList(5, 10, 15, 20, 25, 30);
    // Output: Max: 30
    // Output: Min: 5
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    if (numbers2.size() > 0){
    max = numbers2.stream()
      .max((a, b) -> a > b ? 1 : -1)
      .get();
    min = numbers2.stream()
      .min((a, b) -> a > b ? 1 : -1)
      .get();
    }
    System.out.println("Max: " + max);
    System.out.println("Min: " + min);


    // 4. Mapping to a List of Lengths
    // Task: Given a list of strings, map each string to its length and collect the lengths into a
    // List<Integer>
    List<String> words = Arrays.asList("apple", "banana", "pear");
    // Output: [5, 6, 4] (List)
    List<Integer> lengths = words.stream()
      .map(e -> e.length())
      .collect(Collectors.toList());
    System.out.println(lengths);

    // 5. Counting Elements
    // Task: Given a list of strings, count how many strings have a length greater than 3.
    // List<String> words2 = Arrays.asList("hi", "hello", "world", "java", "stream");
    // Output: 4
    List<String> countList = Arrays.asList("hi", "hello", "world", "java", "stream").stream()
      .filter(e -> e.length() > 3)
      .collect(Collectors.toList());
    System.out.println(countList.size());

    //int count = 0;
    //int count2 = Arrays.asList("hi", "hello", "world", "java", "stream").stream()
    //  .filter(e -> e.length() > 3)
    //  .map(e -> 1)
    //  .get();
    //  ;
    //System.out.println(count2);


    // Here are more advanced exercises focused on using filter, map, and collect to transform data into
    // different data structures:
    // 6. Filtering and Collecting to a Set
    // Task: Given a list of numbers, filter out all numbers greater than 10 and collect them into a
    // Set.
    List<Integer> numbers3 = Arrays.asList(5, 10, 15, 20, 10, 5);
    // Output: [15, 20]
    Set<Integer> filteredNumbers = numbers3.stream()
      .filter(e -> e > 10)
      //.sorted((i1, i2) -> i1 < i2 ? 1 : -1)
      .collect(Collectors.toSet());
    System.out.println(filteredNumbers);

    // 7. Mapping to a Map (Key-Value Pairs)
    // Task: Given a list of students with their names and scores, map them to a Map<String, Integer>,
    // where the key is the student's name and the value is their score.

    // Create Student Class
    // new Student("Alice", 85)
    // new Student("Bob", 75)
    // Java 9: List.of(): You can read the object but you cannot add / modify / remove
    // It is an immutable List Object
    List<Student> students = List.of(new Student("Alice", 85), new Student("Bob", 75));
    // students.set(0, new Student("Alice", 95)); // Compile error
    // students.get(0).setScore(95); // OK
    // the List (two existing student Objects) cannot be removed or added new
    // you can still change the existing attributes (name and score)

    Map<String, Integer> studentMap = students.stream()
      .collect(Collectors.toMap(stu -> stu.getName(), stu -> stu.getScore()));
    System.out.println(studentMap);


    // Output: {Alice=85, Bob=75}

    // 8. Filtering and Mapping to a List of Objects
    // Task: Given a list of Employee objects, filter out employees with a salary less than 50,000 and
    // map them to a list of their names.

    // Create Employee Class
    // new Employee("John", 65000)
    // new Employee("Jane", 55000)
    // new Employee("Doe", 40000)
    List<Employee> employees = Arrays.asList( 
      new Employee("John", 65000), 
      new Employee("Jane", 55000), 
      new Employee("Doe", 40000));

    List<String> employeeNames = employees.stream()
      .filter(e -> e.getSalary() > 50000)
      .map(e -> e.getName())
      .collect(Collectors.toList());
    System.out.println(employeeNames);

    // Output: [John, Jane]

    // 9. Grouping and Collecting to a Map (Group by Age)
    // Task: Given a list of people with their names and ages, group them by age and collect the result
    // into a Map<Integer, List<String>> where the key is the age and the value is a list of names.

    // Create Person Class
    // new Person("Alice", 30),
    // new Person("Bob", 25),
    // new Person("Charlie", 30)
    List<Person> people = Arrays.asList(
      new Person("Alice", 30),
      new Person("Bob", 25),
      new Person("Charlie", 30)
    );

    Map<Integer, List<String>> groupedPeople = people.stream()
      .collect(Collectors.groupingBy(e -> e.getAge(), // Group by age
                Collectors.mapping(e -> e.getName(),
                Collectors.toList()))); // Collect names and return List
    System.out.println("Q9:");
    System.out.println(groupedPeople);

    // // Output: {30=[Alice, Charlie], 25=[Bob]} (Map)

    // 10. Partitioning and Collecting to a Map (Partition by Gender)
    // Task: Given a list of Staff with their names and genders, partition them into two groups: male
    // and female, and collect the result into a Map<Boolean, List<Person>>.

    // Create Staff Class
    // new Staff("Alice", Gender.Female)
    // new Staff("Bob", Gender.Male)
    // new Staff("Charlie", Gender.Male)
    List<Staff> staff = Arrays.asList(
      new Staff("Alice", Gender.FEMALE),
      new Staff("Bob", Gender.MALE),
      new Staff("Charlie", Gender.MALE)
    );

    Map<Boolean, List<String>> partitionedStaff = staff.stream()
      .collect(Collectors.partitioningBy(e -> e.getGender() == Gender.MALE,
                Collectors.mapping(e -> e.getName(),
                Collectors.toList())));
    System.out.println("Q10:");
    System.out.println(partitionedStaff);

    // // Output: {false=[Alice], true=[Bob, Charlie]} (Map)

    // 11. Filtering, Mapping, and Collecting to a List
    // Task: Given a list of integers, filter out numbers less than 10, multiply the remaining numbers
    // by 2, and collect the result into a List.

    List<Integer> numbers4 = Arrays.asList(5, 15, 20, 7, 30);
    // Output: [30, 40, 60]

    List<Integer> filteredNumbers4 = numbers4.stream()
      .filter(num -> num > 10)
      .map(num -> num * 2)
      .collect(Collectors.toList());
    System.out.println("Q11:");
    System.out.println(filteredNumbers4);

    //! 12. Mapping to a Custom Object and Collecting to a List
    // Task: Given a list of names and a constant default value, map each name to a Person object (name
    // and default value for age) and collect the result into a list.

    List<String> names12 = Arrays.asList("Alice", "Bob", "Charlie");
    int defaultAge = 30;
    
    // Output: [Person(name=Alice, age=30), Person(name=Bob, age=30), Person(name=Charlie, age=30)]

    List<Person> people12 = names12.stream()
      .map(name -> new Person(name, defaultAge))
      .map(person -> new StreamExercise.Person(person.getName(), person.getAge()))
      .collect(Collectors.toList());
      System.out.println("Q12:");
    System.out.println(people12.toString());

    // 13. Mapping and Collecting to a Deque
    // Task: Given a list of words, map each word to its uppercase form and collect the result into a
    // Deque.

    List<String> words13 = Arrays.asList("hello", "world", "java");
    // Output: [HELLO, WORLD, JAVA] (Deque)

    Deque<String> uppercaseWords13 = words13.stream()
      .map(word -> word.toUpperCase())
      .collect(Collectors.toCollection(LinkedList::new)); // Collect to LinkedList
      System.out.println("Q13:");
      System.out.println(uppercaseWords13);

    // 14. Transforming and Collecting to an Array
    // Task: Given a list of integers, square each number and collect the result into an array.

    List<Integer> numbers14 = Arrays.asList(1, 2, 3, 4);
    // Output: [1, 4, 9, 16]

    List<Integer> squaredNumbers14 = numbers14.stream()
      .map(num -> num * num)
      .collect(Collectors.toList());
      System.out.println("Q14:");
    System.out.println(squaredNumbers14);

    // 15. Map and Reduce
    // Task: Given a list of products with their prices, use the map and reduce methods to calculate the
    // total price of all products.

    // Create Product Class
    // new Product("Book", 10)
    // new Product("Pen", 5)
    // new Product("Notebook", 7)
    List<Product> products15 = Arrays.asList(
      new Product("Book", 10),
      new Product("Pen", 5),
      new Product("Notebook", 7)
    );

    int totalPrice15 = products15.stream()
      .map(product -> product.getPrice())
      .reduce(0, (a, b) -> a + b); // 0 is the initial value, for loop:(index1 , index2) -> index1 + index2 
      System.out.println("Q15:");
      System.out.println(totalPrice15);

    

    // Output: 22

    // 16. Grouping
    // Task: Given a list of employees with their department names, use groupingBy method to group the
    // employees by department.

    // Create Worker Class
    // new Worker("Alice", "HR")
    // new Worker("Bob", "IT")
    // new Worker("Charlie", "HR")
    // new Worker("David", "IT")

    List<Worker> workers16 = Arrays.asList(
      new Worker("Alice", "HR"),
      new Worker("Bob", "IT"),
      new Worker("Charlie", "HR"),
      new Worker("David", "IT")
    );

    Map<String, List<String>> groupedWorkers16 = workers16.stream()
      .collect(Collectors.groupingBy(e -> e.getDepartment(),
                Collectors.mapping(e -> e.getName(),
                Collectors.toList())));
    System.out.println("Q16:");
    System.out.println(groupedWorkers16);

    // Output: {HR=[Alice, Charlie], IT=[Bob, David]}



    // 17. Parallel Streams
    // Task: Given a list of numbers, use a parallel stream to calculate the sum of all elements.
    List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // Output: 55

    int sum5 = numbers5.stream()
      .reduce(0, (a, b) -> a + b);
      System.out.println("Q17:");
    System.out.println(sum5);


    // 18. FlatMap
    // Task: Given a list of lists of numbers, flatten them into a single list and filter only the
    // numbers greater than 5.

    List<List<Integer>> listOfIntegers = Arrays.asList( //
        Arrays.asList(1, 2, 3), //
        Arrays.asList(4, 5, 6), //
        Arrays.asList(7, 8, 9) //
    );
    // Output: [6, 7, 8, 9]

    List<Integer> flatListOfIntegers = listOfIntegers.stream()
      .flatMap(List::stream)
      .filter(e -> e > 5)
      .collect(Collectors.toList());
      System.out.println("Q18:");
      System.out.println(flatListOfIntegers);

    // 19. Distinct and Sorting
    // Task: Given a list of strings with some duplicates, remove the duplicates and return the result
    // in alphabetical order.

    List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
    // Output: [apple, banana, grape, orange]

    List<String> distinctFruits = fruits.stream()
      .distinct()// remove duplicate
      .sorted()
      .collect(Collectors.toList());
      System.out.println("Q19:");
      System.out.println(distinctFruits);
    
    // 20. Partitioning By
    // Task: Given a list of Children with their scores, partition the Children into passing and failing
    // groups (pass if score >= 50).
    // Create Student first.
    
    // Create Children Class
    // new Children("Alice", 45)
    // new Children("Bob", 55)
    // new Children("Charlie", 40)
    // new Children("David", 70)

    List<Children> children = Arrays.asList(
      new Children("Alice", 45),
      new Children("Bob", 55),
      new Children("Charlie", 40),
      new Children("David", 70)
    );
    Map<Boolean, List<String>> passingFailingChildren = children.stream()
      .collect(Collectors.groupingBy(e -> e.getScore() >= 50,
                Collectors.mapping(e -> e.getName(),          
                Collectors.toList())));
      System.out.println("Q20:");
      System.out.println(passingFailingChildren);
    
    // Output: {false=[Alice, Charlie], true=[Bob, David]}

    // 21. Joining Strings
    // Task: Given a list of words, join them into a single string separated by commas.
    
    List<String> languages = Arrays.asList("Java", "Python", "Rust", "R", "Go");
    // Output: "Java, Python, Rust, R, Go"
    
    String joinedLanguages = languages.stream()
      .collect(Collectors.joining(", "));
      System.out.println("Q21:");
      System.out.println(joinedLanguages);
    

    // 22. Find First and Any
    // Task: Given a list of integers, find the first number that is divisible by 3.
    List<Integer> ages = Arrays.asList(4, 7, 9, 12, 16, 21);
    
    Integer firstDivisibleByThree = ages.stream()
      .anyMatch(e -> e % 3 == 0) ? 
      ages.stream().filter(e -> e % 3 == 0)
      .findFirst().get()
      : null;

      System.out.println("Q22:");
      System.out.println(firstDivisibleByThree);
    
    // Output: 9

    // 23. Limit and Skip
    // Task: Given a list of numbers, skip the first 3 elements and return the next 5 elements.
    
    List<Integer> elements = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // Output: [4, 5, 6, 7, 8]

    List<Integer> limitedElements = elements.stream()
      .skip(3)
      .limit(5)
      .collect(Collectors.toList());
      System.out.println("Q23:");
      System.out.println(limitedElements);
    
    // 24. Peek
    // Task: Given a list of integers, double each element and use the peek method to log the
    // intermediate results to the console.
    
    List<Integer> amounts = Arrays.asList(1, 2, 3, 4);
    // Intermediate output: 2, 4, 6, 8
    // Final Output: [2, 4, 6, 8]
    System.out.println("Q24:");
    List<Integer> doubledAmounts = amounts.stream()
      .map(e -> e * 2)
      .peek(e -> e *= 2)
      .collect(Collectors.toList());
    System.out.println(doubledAmounts);
      

    // 25. Optional and Streams
    // Task: Given a list of strings, use Streams to find the first string longer than 4 characters.
    // Handle the case where no such string exists using Optional.
    
    List<String> animals = Arrays.asList("cat", "tiger", "panda", "dog");
    // Output: Optional[tiger]
    Optional<String> firstLongAnimal = animals.stream()
      .filter(e -> e.length() > 4)
      .findFirst();
      System.out.println("Q25:");
      if (firstLongAnimal.isPresent() != true) {
        firstLongAnimal = Optional.of("null");
      }
      System.out.println(firstLongAnimal);

    List<String> animals2 = Arrays.asList("cat", "dog", "bird");
    // Output: Optional[null]
    Optional<String> firstLongAnimal2 = animals2.stream()
      .filter(e -> e.length() > 4)
      .findFirst();
      //if (firstLongAnimal2.isPresent() != true) {
      //  firstLongAnimal2 = Optional.of("null");
      //}
      
      System.out.println(firstLongAnimal2);
      
    // 26. Custom Collector
    // Task: Create a custom collector that collects the elements of a stream and remove all duplicates
    
    List<Integer> duplicates = Arrays.asList(2, 1, 2, 3, 4, 3, 5, 5, 6);
    // Output: [1, 2, 3, 4, 5, 6] (Set)
    
    Set<Integer> uniqueElements = duplicates.stream()
      .collect(Collectors.toSet());
      System.out.println("Q26:");
      System.out.println(uniqueElements);

    // 27. String Length Calculation
    // Task: Given a list of strings, calculate the total number of characters in all the strings
    // combined.
    
    List<String> keywords = Arrays.asList("stream", "filter", "map", "sorted", "collect");
    // Output: 28
    
    int totalCharacters = keywords.stream()
      .map(e -> e.length())
      .reduce(0, (a, b) -> a + b);
      System.out.println("Q27:");
      System.out.println(totalCharacters);
  }
}