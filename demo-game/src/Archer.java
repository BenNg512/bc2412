public class Archer extends Hero{
  private static int countArcher = 0;

  public Archer(String name) {
    super();
    this.name = name;
    this.role = Role.Archer.getDesc();
    this.archerId = ++countArcher;
    //
    this.lv = 1;
    this.hpMax = 200;
    this.hp = this.hpMax;
    this.mpMax = 80;
    this.mp = this.mpMax;
    this.PA = 50; // Physical Attack
    this.PD = 30; // Physical Defense
    this.MA = 10; // Magic Attack
    this.MD = 15; // Magic Defense
    this.AG = 10; // Agility
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
    this.hpMax += 3;
    this.mpMax += 2;
    this.PA += 3; // Physical Attack
    this.PD += 1; // Physical Defense
    this.MA += 2; // Magic Attack
    this.MD += 1; // Magic Defense
    this.AG += 5;
    this.hp = this.hpMax; // restore hp
    this.mp = this.mpMax; // restore mp
    }
  }
}
