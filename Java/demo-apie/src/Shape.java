public abstract class Shape { 
  // abstract class vs class
  // 1. CANNOT create object for abstract class
  // 2. they are both with common attribute for child class
  // 3. abstract class's constructor is for child class to "super"
    public String color;

    public Shape(String color) {
        this.color = color;
    }
    public Square createSquare(String color, double length){
        return new Square("none", length);
    }
    public Circle createCircle(String color, double radius){
        return new Circle("none", radius);
    }

    public String getColor() {
        return color;
    }

  // implicitly public for abstract method
  // Implication: 
  // 1. If the child class cannot provide area implementation, then it is not a shape.
  // 2. The child class must provide the implementation of abstract method
    abstract double area();

    public static Shape create(String ref){
    if(ref.equals("circle")){
        return new Circle("R", 10);
    }else if(ref.equals("square")){
        return new Square("G", 10);
    }else if(ref.equals("triangle")){
        return new Triangle("yellow", 10, 10);
    }else{
        return null;
    }
    }

    public static Circle createCircle(char color, double radius){
        return new Circle("none", radius);
    }

    public void setColor(String color) {
        this.color = color;
    }
    public static void main(String[] args) {
      Shape.create("circle");
      Circle c2 = Shape.createCircle('C', 10);
}
}   