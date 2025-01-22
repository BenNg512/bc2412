package factory;

import furniture.Chair;
import furniture.CoffeeTable;
import furniture.Sofa;

public interface FurnitureFactory {
  Chair createChair();
  CoffeeTable createCoffeeTable();
  Sofa createSofa();

  public static FurnitureFactory create(Style style) throws Exception {
    return switch (style) {
      case MODERN -> 
        new ModernFactory();
      case VICTORIAN -> 
        new VictorianFactory();
      case ART_DECO -> 
        new ArtDecoFactory();
      default -> 
        throw new Exception("Unknown Style"); 
    };
  }
  static FurnitureFactory createFactory(Style style) {
    try {
      return create(style);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
