import java.math.BigDecimal;
import java.math.RoundingMode;

public class Stave_Liandry extends Stave{
  public Stave_Liandry(){
    super();
    this.weaponName = "Wand Archangel";
    this.PA = 10;
    this.MA = 30;
    this.CC = 0.05;
  }

  @Override
  public int levelUp(){
    if (this.lv >= 3) {
      System.out.println(this.weaponName + " has reached the maximum level.");
      return this.lv = 3;
    }else{
      System.out.println(this.weaponName + " has leveled up!");
      this.PA += 5;
      this.MA += 15;
      BigDecimal newCC = BigDecimal.valueOf(this.CC).add(BigDecimal.valueOf(0.05));
      this.CC = newCC
              .setScale(2, RoundingMode.HALF_UP)
              .doubleValue();
      return this.lv++;
    }
  }
  
}
