public class Pig extends Animal {
  private String color;

  public Pig(String name, String color) {
    super(name);
    this.color = color;
  }

  public Pig(){ // --> public Animal()
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    String temp = this.color;
    this.color = color;
    color = temp;
    System.out.println(this.name + " Pig's color is changed from " + color + " to " + this.color);
  }
  
  public void sleep() {
    System.out.println(this.name + " Pig is sleeping");
  }
  public void eat(String food) {
    System.out.println(this.name + " Pig is eating " + food);
  }

  public static void main(String[] args){
    Pig pig1 = new Pig("Tom", "White");
    pig1.sleep();
    pig1.eat("grass");
    pig1.setColor("Dark Brown");
    pig1.setColor("Pink");

    Pig pig2 = new Pig();
    pig2.setColor("Yellow");
    pig2.sleep();
    
    Pig pig3 = new Pig();
    pig3.setColor("Yellow");
    pig3.sleep();

  }


}

