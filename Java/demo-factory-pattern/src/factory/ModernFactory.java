package factory;
import furniture.Chair;
import furniture.CoffeeTable;
import furniture.ModernChair;
import furniture.ModernCoffeeTable;
import furniture.ModernSofa;
import furniture.Sofa;

public class ModernFactory implements FurnitureFactory {
  @Override
  public Chair createChair() {
    System.out.println("Creating Modern Chair");
    return new ModernChair();
  }
  @Override
  public CoffeeTable createCoffeeTable() {
    System.out.println("Creating Modern Coffee Table");
    return new ModernCoffeeTable();
  }
  @Override
  public Sofa createSofa() {
    System.out.println("Creating Modern Sofa");
    return new ModernSofa();
  }
}
