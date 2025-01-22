import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Ball implements Comparable<Ball>{
  private Color color;
  private int value;

  public Ball(Color color, int value){
    this.color = color;
    this.value = value;
  }

  public Color getColor(){
    return this.color;
  }
  public int getValue(){
    return this.value;
  }
  public void setColor(Color color){
    this.color = color;
  }
  public void setValue(int value){
    this.value = value;
  }

  public static enum Color{
    RED, 
    YELLOW, 
    BLUE,
    ;
  }
  @Override
  public String toString() {
    return this.color + " " + this.value;
  }



  

  @Override
  public int compareTo(Ball ball) {
    // Compare 2 balls
    // this.ball(-1), ball(1)
    // lower value return first
    // if (this.value > ball.getValue())
    // return -1;
    // return 1;
    //
    // sort by color: RED, BLUE, YELLOW
    // same color, lower value rank first
    // Approach 1: Comparable<Ball> (Disadvantage: can only sort by 1 rule)
    if (this.color.equals(ball.getColor())){
      if (this.value < ball.getValue()){
        return -1;
      } else 
      if (this.color == Color.RED // && ball.getColor() != Color.RED
            || this.color == Color.BLUE && ball.getColor() == Color.YELLOW ){
        return -1;
      } 
    }return 1;
    }
      public static void main(String[] args) {
    List<Ball> balls = new LinkedList<Ball>();
    balls.add(new Ball(Ball.Color.RED, 1)); 
    // Color enum is inside the Ball class so you can ignore Ball when calling Color
    balls.add(new Ball(Color.YELLOW, 9));
    balls.add(new Ball(Color.BLUE, 7));
    balls.add(new Ball(Color.YELLOW, 3));
    balls.add(new Ball(Color.RED, 8));
    System.out.println(balls);

    // Sort by values
    Collections.sort(balls);
    System.out.println(balls);
  
    // 
    // Approach 2: Comparator
    Comparator<Ball> sortFormula;
    int x = 1;
    if (x > 2) {
      sortFormula = new SortByColor();
    } else {
      sortFormula = new SortByValue();
    }
    Collections.sort(balls, sortFormula);
    System.out.println("ANS" + balls);
  }
}

