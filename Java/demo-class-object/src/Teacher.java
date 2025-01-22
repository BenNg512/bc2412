public class Teacher {
  private Candy2[] candies; //object reference
  private Student2[] students; //object reference

  public Teacher(Candy2[] candies, Student2[] students) { // store address of candies & students
    this.candies = candies;  
    this.students = students;
  }

  public static boolean shouldDistribute(int score, String color) {
    return score >= 80 && color.equals("R") 
    || score >= 60 && color.equals("B") 
    || score < 40 && color.equals("Y");
  }

  public void distribute() {
    int pos = 0;
    while (true){
      for (Candy2 candy : this.candies) {
        for (Student2 student : this.students) {
          if(shouldDistribute(student.getScore(), this.candies[pos].getColor())){
            student.receiveCandy(this.candies[pos]); // student gets teacher's candy
            this.candies[pos] = null; // teacher's candy is removed
            if (++pos >= this.candies.length) {
            return;
            }
          }
        
        }
      }
      }
    }
    public void distribute2() {
        for (Candy2 candy : this.candies) {
          for (Student2 student : this.students) {
            
              }
            }
        }
      

  // Teacher, Candy2, Student2
    // new Candy2('R')
    // Teacher t1 = new Teacher();
    // t1.distribute(new Candy2('R'))  -> s1.getCandy R, s2.getCandy B...
    // output: s1: R,R,R,R ; s2: B,B,B,B...

  public static void main(String[] args) {
    
    Candy2[] candies = new Candy2[]{
      new Candy2("R"), new Candy2("B"), new Candy2("Y"), new Candy2("B"),new Candy2("Y"),
      new Candy2("R"), new Candy2("R"), new Candy2("R"), new Candy2("R"),new Candy2("R"),
      new Candy2("R"), new Candy2("R"), new Candy2("R"), new Candy2("R"),new Candy2("R"),
      new Candy2("R"), new Candy2("B"), new Candy2("Y"), new Candy2("B"),new Candy2("Y"),
    };
    
    Student2[] students = new Student2[]{
      new Student2("A", 67), 
      new Student2("B", 89), 
      new Student2("C", 50), 
      new Student2("D", 99), 
      new Student2("E", 60), 
      new Student2("F", 59)};

    Teacher t1 = new Teacher(candies, students);
    t1.distribute2();

    for (Student2 student : students) {
    System.out.println(student.getName() + ": " + student.getCandies());
    }
    System.out.println("END");
  
  
  
  
  
  }
}