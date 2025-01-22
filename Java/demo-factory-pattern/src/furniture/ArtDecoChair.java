package furniture;
public class ArtDecoChair implements Chair {
  @Override
  public boolean hasLegs() {
    return true;
  }
  @Override
  public boolean sitOn() {
    return true;
  }

}
