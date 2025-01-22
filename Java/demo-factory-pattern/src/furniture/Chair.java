package furniture;
import factory.FurnitureFactory;

public interface Chair {
  abstract boolean hasLegs(); 
  // can add abstract or not, depends on the implementation method : 
  // extend parent class -> abstract
  // implement interface -> no need add abstract
  abstract boolean sitOn();
  
  public static Chair create(FurnitureFactory factory) {
    return factory.createChair();
  };
}