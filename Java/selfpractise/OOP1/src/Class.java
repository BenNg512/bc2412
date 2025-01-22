public class Class {
  private String className;
  private Student[] students;

  public Class(String className) {
    this.className = className;
    this.students = new Student[0];
  }

  public String getClassName(){
    return this.className;
  }
  public Student[] getStudents(){
    return this.students;
  }
  public int getNumberOfStudents(){
    return this.students.length;
  }

  public void setClassName(String className){
    this.className = className;
  }

  public void addStudent(Student student){
    Student[] temp = new Student[this.students.length + 1];
    for (int i = 0; i < this.students.length; i++) {
      temp[i] = this.students[i];
    }
    temp[this.students.length] = student;
    this.students = temp;
  }

  public void removeStudent(Student student){
    Student[] temp = new Student[this.students.length - 1];
    int idx = 0;
    for (int i = 0; i < this.students.length; i++) {
      if (this.students[i].getName().equals(student.getName()) == false) {
      temp[idx++] = this.students[i];
      }
    }
    this.students = temp;
  }

  public static void main(String[] args) {
    Class class1 = new Class("Class 12F");  
    //
    Student s1 = new Student("John", 1001, 20, 'M');
    s1.addCourse(new Course("MATH1010", 40, 70));
    class1.addStudent(s1);
    
    Student s2 = new Student("Jane", 1002, 21, 'F');
    s2.addCourse(new Course("Math1011", 20, 30));
    class1.addStudent(s2);


    class1.addStudent(new Student("Bob", 1003, 22, 'X'));

    System.out.println(class1.getClassName());
    System.out.println(class1.getNumberOfStudents());
    System.out.println(class1.getStudents()[0].getCourses()[0].getCourseName());
    System.out.println(class1.getStudents()[2].getGender());
    System.out.println(class1.getStudents()[1].getName());
    System.out.println(class1.getStudents()[2].getName());

  }


  
  
}
