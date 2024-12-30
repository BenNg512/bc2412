public class Student {
  private int score;

  public Student(int score){
    this.score = score;
  }
  public int getScore(){
    return this.score;
  }
  public int getCandies(){ // each round 
    if (this.score > 80){
      return 2;
    } else if (this.score >= 60){
      return 1;
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
    Student s1 = new Student(67);
    Student s2 = new Student(89);
    Student s3 = new Student(50);
    Student s4 = new Student(99);
    Student s5 = new Student(60);
    Student s6 = new Student(59);
    Student[] students = new Student[]{s1,s2,s3,s4,s5,s6};
    int[] candiesGet = new int[students.length];

    System.out.println(s2.getCandies());

    int candiesLeft = 20;
    while (candiesLeft > 0){
    for (int i = 0; i < students.length; i++) {
      if (candiesLeft >= students[i].getCandies()) {
        candiesGet[i] += students[i].getCandies();
        candiesLeft -= students[i].getCandies();
      } else {
        candiesGet[i] += 0;
      }
      System.out.println("Student" + (i + 1) +
      " Total: " + candiesGet[i]);
    }
    }
    



  }


}
