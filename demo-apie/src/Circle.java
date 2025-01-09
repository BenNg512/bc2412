import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape {
  private double radius;
    private String color;
  
    public Circle(String color, double radius) {
      super();
      this.radius = radius;
    }
  
    public double getRadius() {
        return this.radius;
    }
    public double getDiameter() {
      return BigDecimal.valueOf(this.radius)
      .multiply(BigDecimal.valueOf(2))
      .setScale(2, RoundingMode.HALF_UP)
      .doubleValue();
    }
    public double area() {
        return BigDecimal.valueOf(Math.PI)
        .multiply(BigDecimal.valueOf(this.radius))
        .multiply(BigDecimal.valueOf(this.radius))
        .setScale(2, RoundingMode.HALF_UP)
        .doubleValue(); 
    }
  
    public double getCircumference() {
      return BigDecimal.valueOf(Math.PI)
      .multiply(BigDecimal.valueOf(this.radius))
      .multiply(BigDecimal.valueOf(2))
      .setScale(2, RoundingMode.HALF_UP)
      .doubleValue();
    }
  
    public void getDetails() {
      System.out.println("Radius:        " + this.radius);
      System.out.println("Color:         " + this.color);
    System.out.println("Diameter:      " + this.getDiameter());
    System.out.println("Area:          " + this.area());
    System.out.println("Circumference: " + this.getCircumference());
  }

  public static void main(String[] args) {
      Circle circle = new Circle("red", 10);
      circle.getDetails();
  }
  
  
}
