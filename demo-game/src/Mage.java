public class Mage extends Hero {
  private static int countMage = 0;

  public Mage(String name) {
    super();
    this.name = name;
    this.role = Role.Mage.getDesc();
    this.mageId = ++countMage;
    //
    this.lv = 1;
    this.hpMax = 100;
    this.hp = this.hpMax;
    this.mpMax = 200;
    this.mp = this.mpMax;
    this.PA = 10; // Physical Attack
    this.PD = 20; // Physical Defense
    this.MA = 50; // Magic Attack
    this.MD = 40; // Magic Defense
    this.AG = 5; // Agility
    this.CC = 0.01; // Critical Chance
    this.CD = 3; // Critical Damage
  }

  @Override
  public void levelUp() {
    if (this.lv >= 99) {
      System.out.println(this.role + " has reached the maximum level.");
      return;
    }else{
      System.out.println(this.role + " has leveled up!");
    this.lv += 1;
    this.hpMax += 2;
    this.mpMax += 5;
    this.PA += 1; // Physical Attack
    this.PD += 1; // Physical Defense
    this.MA += 5; // Magic Attack
    this.MD += 5; // Magic Defense
    this.AG += 2;
    this.hp = this.hpMax; // restore hp
    this.mp = this.mpMax; // restore mp
    }
  }
  public void heal(){
    this.mp -= 10;
    //
    this.hp += 50;
    if (this.hp > this.hpMax) // Max healing: hpMax-this.hp
    this.hp = this.hpMax; 
  }
}
