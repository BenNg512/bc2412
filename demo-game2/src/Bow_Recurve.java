import java.math.BigDecimal;
import java.math.RoundingMode;

public class Bow_Recurve extends Bow {
  
  public Bow_Recurve(){
    super();
    this.weaponName = "Bow Recurve";
    this.PA = 10;
    this.MA = 10;
    this.CC = 0.1;
  }
  @Override
  public int levelUp(){
    if (this.lv >= 3) {
      System.out.println(this.weaponName + " has reached the maximum level.");
      return this.lv = 3;
    }else{
      System.out.println(this.weaponName + " has leveled up!");
      this.PA += 5;
      this.MA += 5;
      BigDecimal newCC = BigDecimal.valueOf(this.CC).add(BigDecimal.valueOf(0.05));
      this.CC = newCC
              .setScale(2, RoundingMode.HALF_UP)
              .doubleValue();
      return this.lv++;
    }
  }

}
