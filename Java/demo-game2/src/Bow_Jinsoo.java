import java.math.BigDecimal;
import java.math.RoundingMode;

public class Bow_Jinsoo extends Bow{

  public Bow_Jinsoo(){
    super();
    this.weaponName = "Bow Jinsoo";
    this.PA = 20;
    this.MA = 20;
    this.CC = 0.2;
  }
  @Override
  public int levelUp(){
    if (this.lv >= 3) {
      System.out.println(this.weaponName + " has reached the maximum level.");
      return this.lv = 3;
    }else{
      System.out.println(this.weaponName + " has leveled up!");
      this.PA += 10;
      this.MA += 10;
      BigDecimal newCC = BigDecimal.valueOf(this.CC).add(BigDecimal.valueOf(0.01));
      this.CC = newCC
              .setScale(2, RoundingMode.HALF_UP)
              .doubleValue();
      return this.lv++;
    }
  }
  
}
