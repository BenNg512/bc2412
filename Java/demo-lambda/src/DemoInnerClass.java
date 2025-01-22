public class DemoInnerClass {
  private int x;


  public void setX(int x){
    this.x = x;
  }
  public void print(){
    //System.out.println(y);
  
  class Cat{
    private int age;

    public Cat(int age){
      this.age = age;
    }

    public int getAge(){
      return this.age;
    }
    Cat cat = new Cat(10);
  //System.out.print(cat.getAge());
  }
}

  public static class Library{ // static nested class

  }

  public static class Builder{ // static nested class

  }

  public class Student{ // inner class
    private int y;

    public void print(){
      System.out.println(x);
    }
    public void setY(int y){
      this.y = y;
    }
  }

  public static void main(String[] args) {
    DemoInnerClass.Library library = new DemoInnerClass.Library();
    
    // DemoInnerClass.Student student = new DemoInnerClass().new Student();
    DemoInnerClass dic = new DemoInnerClass();
    DemoInnerClass.Student student = dic.new Student();
    
    dic.setX(10);
    student.setY(20);
    System.out.println(dic.x);
    System.out.println(student.y);
    student.print();

    Swimmable person = new Swimmable(){
      int count = 0;
      @Override
      public void swim() {
        this.count++;
        System.out.println("Swimming");
      }
      public int getCount(){
        return this.count;
      }
    };
    // Person.getCount(); Static Polymorphism
    // if you create Person class implements Swimmable, it is called Dynamic Polymorphism
    // 

    Swimmable person2 = () -> System.out.println("Swimming 2");

  };

  public static interface Swimmable{
    void swim();
  }
}
