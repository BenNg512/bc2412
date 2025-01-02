public class Student {
  private String name;
  private int score;  
  private int candyCount;

  public Student(String name, int score){ 
    this.name = name;
    this.score = score;
    this.candyCount = 0;
  }

  public String getName(){
    return this.name;
  }
  public int getScore(){
    return this.score;
  }
  public int addCandies(){ // each round 
    if (this.score > 80){
      return + 2;
    } else if (this.score >= 60){
      return + 1;
    } else {
      return 0;
    }
  }
  // expected output:
  // 20 candies -> distribute to students according to their scores
  // each round : >80 -> 2 ; 60-79 -> 1
    // student 1: 67 
    // student 2: 89
    // student 3: 50 
    // student 4: 99
    // student 5: 60
    // student 6: 59

  // if candiesLeft >= getCandies[i] -> distribute the candies to the student
  // student[i].getCandies[] = {1,2,0,2,1,0}
  // student[i].candiesTotal += getCandies
  // candiesLeft -= getCandies

  // expected output:
  // student 1: 1 / 2 / 3 / 4
  // student 2: 2 / 4 / 6 / 6
  // student 3: 0
  // student 4: 2 / 4 / 6 / 6
  // student 5: 1 / 2 / 1 / 4
  // student 6: 0
  public static void main(String[] args) {
    Student[] students = new Student[]{
      new Student("1", 67), 
      new Student("2", 89), 
      new Student("3", 50), 
      new Student("4", 99), 
      new Student("5", 60), 
      new Student("6", 59)};

    int[] candiesGet = new int[students.length];
    int candiesLeft = 20;
    while (candiesLeft > 0){
    for (int i = 0; i < students.length; i++) {
      if (candiesLeft >= students[i].addCandies()) {
        candiesGet[i] += students[i].addCandies();
        candiesLeft -= students[i].addCandies();
      } else {
        candiesGet[i] += 0;
      }
      }
    }

    for (int i = 0; i < students.length; i++) {
    System.out.println("Student " + students[i].getName() + " : " + candiesGet[i]);
    }
  }
}
