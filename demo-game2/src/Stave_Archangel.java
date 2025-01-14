import java.math.BigDecimal;
import java.math.RoundingMode;

public class Stave_Archangel extends Stave {
  public Stave_Archangel(){
    super();
    this.weaponName = "Wand Archangel";
    this.PA = 5;
    this.MA = 15;
    this.CC = 0.01;
  }

  @Override
  public int levelUp(){
    if (this.lv >= 3) {
      System.out.println(this.weaponName + " has reached the maximum level.");
      return this.lv = 3;
    }else{
      System.out.println(this.weaponName + " has leveled up!");
      this.PA += 1;
      this.MA += 5;
      BigDecimal newCC = BigDecimal.valueOf(this.CC).add(BigDecimal.valueOf(0.01));
      this.CC = newCC
              .setScale(2, RoundingMode.HALF_UP)
              .doubleValue();
      return this.lv++;
    }
  }

}