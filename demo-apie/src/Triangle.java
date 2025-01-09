import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle extends Shape {
  private double base;
  private double height;
  private String color;
  
  public Triangle(double base, double height) {
    super();
    this.base = base;
    this.height = height;
  }
  public String getColor() {
    return this.color;
  }
  public double getBase() {
    return base;
  }
  public double getHeight() {
    return height;
  }
  public double area() {
    return BigDecimal.valueOf(this.base)
    .multiply(BigDecimal.valueOf(this.height))
    .divide(BigDecimal.valueOf(2))
    .setScale(2, RoundingMode.HALF_UP)
    .doubleValue();
  }

  public void getDetails(){
    System.out.println("Color:     " + this.getColor());
    System.out.println("Base:      " + this.getBase());
    System.out.println("Height:    " + this.getHeight());
    System.out.println("Area:      " + this.area());
  }

  public static void main(String[] args) {

  }

}
