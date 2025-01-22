import factory.ArtDecoFactory;
import factory.FurnitureFactory;
import factory.ModernFactory;
import factory.Style;
import furniture.Chair;

public class Customer {
  public static void main(String[] args) {
    FurnitureFactory factory = new ModernFactory();
    FurnitureFactory factory2 = FactoryManager.createFactory(Style.MODERN);
    Chair chair1 = factory.createChair();

    Chair chair = Chair.create(new ModernFactory());
    Chair chair2 = factory2.createChair();
  }
  
}
