package furniture;
public class VictorianChair implements Chair{
  
  @Override
  public boolean hasLegs() {
    return true;
  }
  
  @Override
  public boolean sitOn() {
    return true;
  }
  
}
