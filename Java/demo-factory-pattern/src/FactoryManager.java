import factory.ArtDecoFactory;
import factory.FurnitureFactory;
import factory.ModernFactory;
import factory.Style;
import factory.VictorianFactory;

public class FactoryManager {

  public static FurnitureFactory createFactory(Style style) {
    switch (style) {
      case MODERN:
        return new ModernFactory();
      case VICTORIAN:
        return new VictorianFactory();
      case ART_DECO:
        return new ArtDecoFactory();
      default:
        return null;
    }
  }

}
