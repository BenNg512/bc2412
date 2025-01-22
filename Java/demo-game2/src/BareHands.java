
public class BareHands extends Weapon {
  
  public BareHands(){
    super();
    this.weaponName = "bare hands";
    this.lv = 1;
  }
  @Override
  public int levelUp(){
    System.out.println("No weapon can level up.");
    return this.lv;
  }
}
