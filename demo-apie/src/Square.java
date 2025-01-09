import java.math.BigDecimal;
import java.math.RoundingMode;

public class Square extends Shape{
  private double length;
  private String color;

  public Square(String color, double length) {
    super();
    this.length = length;
  }
  public String getColor(){
    return this.color;
  }

  public double getLength() {
    return this.length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public double area() {
    return BigDecimal.valueOf(this.length)
    .multiply(BigDecimal.valueOf(this.length))
    .setScale(2, RoundingMode.HALF_UP)
    .doubleValue();
  }

  public double getPerimeter() {
    return BigDecimal.valueOf(this.length)
    .multiply(BigDecimal.valueOf(4))
    .setScale(2, RoundingMode.HALF_UP)
    .doubleValue();
  }

  public void getDetails(){
    System.out.println("Color:     " + this.getColor());
    System.out.println("Length:    " + this.getLength());
    System.out.println("Area:      " + this.area());
    System.out.println("Perimeter: " + this.getPerimeter());
  }

  public static void main(String[] args) {
    Square square = new Square("red", 1.5);
    square.getDetails();
  }
  
}
