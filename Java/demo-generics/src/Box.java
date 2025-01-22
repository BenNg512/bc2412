import java.math.BigDecimal;

public class Box<T extends Shape> {
  private T[] shapes;

  public Box(){
    this.shapes = (T[]) new Shape[2];
  }
  public void addShape(int index, T shape){  
    this.shapes[index] = shape;
  }

  public double totalArea(){
    BigDecimal total = BigDecimal.valueOf(0);
    for (T shape : this.shapes){
      total = BigDecimal.valueOf(shape.area()).add(total);
    }
    return total.doubleValue();
  }

  // Static method here
  public static <T extends Shape> double totalArea2(T[] shapes){
    BigDecimal total = BigDecimal.valueOf(0);
    for (T shape : shapes){
      total = BigDecimal.valueOf(shape.area()).add(total);
    }
    return total.doubleValue();
  }

  public static void main(String[] args) {
    Box<Circle> box1 = new Box<>(); // Can only put circle here
    box1.addShape(0, new Circle(3.0));
    box1.addShape(1, new Circle(2.0));
    System.out.println(box1.totalArea());

  // add Circle to shape[0]
  // add Square to shape[1]
    Box<Shape> box2 = new Box<>(); // Write generic type here: Shape
    box2.addShape(0, new Circle(3.0));
    box2.addShape(1, new Square(3.0));
    System.out.println(box2.totalArea());
  
  }
}
