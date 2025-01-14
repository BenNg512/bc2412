import java.math.BigDecimal;
import java.math.RoundingMode;

public class Sword_Hexdrinker extends Sword{ 

  public Sword_Hexdrinker(){
    super();
    this.weaponName = "Sword Hexdrinker"; 
    this.PA = 30;
    this.MA = 10;
    this.CC = 0.05;
  }

  @Override
  public int levelUp(){
    if (this.lv >= 3) {
      System.out.println(this.weaponName + " has reached the maximum level.");
      return this.lv = 3;
    }else{
      System.out.println(this.weaponName + " has leveled up!");
      this.PA += 15;
      this.MA += 5;
      BigDecimal newCC = BigDecimal.valueOf(this.CC).add(BigDecimal.valueOf(0.05));
      this.CC = newCC
              .setScale(2, RoundingMode.HALF_UP)
              .doubleValue();
      return this.lv++;
    }
  }
  
}
