import java.math.BigDecimal;

public class Circle {

  private double radius;
  private String color;
  
  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  // getter
  public double getRadius(){
    return this.radius;
  }
  public String getColor(){
    return this.color;
  }

  
  public double calculateArea(){
    return BigDecimal.valueOf(this.radius * this.radius)//
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }
  //! Static methods : refer to this.radius
  //! formula : need to input radius
  public double getArea(double radius){
    return BigDecimal.valueOf(this.radius * this.radius)//
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }

  public double calculateDiameter(){
    return this.radius * 2;
  }
  public double calculateCircumference(){
    return 2 * Math.PI * this.radius;
  }

  // setter
  public void setRadius(int radius){
    this.radius = radius;
  }
  public void setString(String color){
    this.color = color;
  }
  //
  public static void main(String[] args){
    Circle c1 = new Circle(3.0, "Red");
    System.out.println(c1.getRadius());
    System.out.println(c1.getColor());
    System.out.println(c1.calculateArea());
    System.out.println(c1.calculateDiameter());
    System.out.println(c1.calculateCircumference());
  }

  
}
