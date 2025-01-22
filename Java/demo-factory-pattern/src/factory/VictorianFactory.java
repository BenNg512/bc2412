package factory;
import furniture.Chair;
import furniture.CoffeeTable;
import furniture.Sofa;
import furniture.VictorianChair;
import furniture.VictorianCoffeeTable;
import furniture.VictorianSofa;

public class VictorianFactory implements FurnitureFactory {
  @Override
  public Chair createChair() {
    System.out.println("Creating Victorian Chair");
    return new VictorianChair();
  }
  @Override
  public CoffeeTable createCoffeeTable() {
    System.out.println("Creating Victorian Coffee Table");
    return new VictorianCoffeeTable();
  }
  @Override
  public Sofa createSofa() {
    System.out.println("Creating Victorian Chair");
    return new VictorianSofa();
  }

}
