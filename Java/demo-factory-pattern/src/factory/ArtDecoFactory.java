package factory;
import furniture.ArtDecoChair;
import furniture.ArtDecoCoffeeTable;
import furniture.ArtDecoSofa;
import furniture.Chair;
import furniture.CoffeeTable;
import furniture.Sofa;

public class ArtDecoFactory implements FurnitureFactory {
  @Override
  public Chair createChair() {
    System.out.println("Creating Art Deco Chair");
    return new ArtDecoChair();
  }
  @Override
  public CoffeeTable createCoffeeTable() {
    System.out.println("Creating Art CoffeeTable");
    return new ArtDecoCoffeeTable();
  }
  @Override
  public Sofa createSofa() {
    System.out.println("Creating Art Deco Sofa");
    return new ArtDecoSofa();
  }

}
