package furniture;
import factory.FurnitureFactory;

public interface Sofa {
  boolean isSingleSeat();

  public static Sofa createSofa(FurnitureFactory factory) {
    return factory.createSofa();
  }
}
