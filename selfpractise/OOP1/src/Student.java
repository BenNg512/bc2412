public class Student {
  private String name;
  private long id;
  private int age;
  private char gender;
  private Course[] courses;

  public Student(String name, long id, int age, char gender) {
    this.name = name;
    this.id = id;
    this.age = age;
    this.gender = gender;
    this.courses = new Course[0];
  }

  public void addCourse(Course course) {
    Course[] temp = new Course[this.courses.length + 1];
    for (int i = 0; i < this.courses.length; i++) {
      temp[i] = this.courses[i];
    }
    temp[this.courses.length] = course;
    this.courses = temp;
  }

  public void removeCourse(Course course) {
    Course[] temp = new Course[this.courses.length - 1];
    int idx = 0;
    for (int i = 0; i < this.courses.length; i++) {
      if (this.courses[i].getCourseName().equals(course.getCourseName()) == false) {
      temp[idx++] = this.courses[i];
      }
    }
    this.courses = temp;
  }
  
  public String getName() {
    return this.name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public long getId() {
    return this.id;
  }
  public void setId(long id) {
    this.id = id;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public char getGender() {
    if(gender != 'M' && gender != 'F'){
      this.gender = 'O';
      }
    return this.gender;
  }
  public void setGender(char gender) {
    if(gender != 'M' && gender != 'F'){
    this.gender = gender;
    }else{
    this.gender = 'O';
    }
  }
  public Course[] getCourses() {
    return this.courses;
  }
  public void setCourses(Course[] courses) {
    this.courses = courses;
  }
  
}
