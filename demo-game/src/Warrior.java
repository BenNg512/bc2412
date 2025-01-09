public class Warrior extends Hero{
  private static int countWarrior = 0;

  public Warrior(String name) { // set name and all default values here
    super();
    this.name = name;
    this.role = Role.Warrior.getDesc();
    this.warriorId = ++countWarrior;
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
    this.AG = 10; // Agility //! who act first
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
    this.hpMax += 5;
    this.mpMax += 1;
    this.PA += 5; // Physical Attack
    this.PD += 2; // Physical Defense
    this.MA += 1; // Magic Attack
    this.MD += 2; // Magic Defense
    this.AG += 1;
    this.hp = this.hpMax; // restore hp
    this.mp = this.mpMax; // restore mp
    }
  }
}
