public class SuperHero<T extends Hero, U extends Weapon>{
  private T hero;
  private U weapon;

  SuperHero(){
    this.weapon = (U) new BareHands();
  }
  public void setHero(T hero) {
    this.hero = hero;
  }
  public void setWeapon(U weapon) {
    this.weapon = weapon;
  }
  
  public int totalPA() {
    return this.hero.PA + this.weapon.PA;
  }
  public int totalPD() {
    return this.hero.PD + this.weapon.PD;
  }


  //! need to update her atkHero to atkSuperHero
  //! update the data type of atkHero: PD to totalPD
  public void phyAttack(Hero atkHero){
    int damage = 0;
    if (atkHero.hp == 0) {
      System.out.println(atkHero.getName() + " is dead already. Respect! Don't hit the dead body la.");
    } else {
      damage = this.totalPA() - atkHero.PD;
      if(damage <= 0){ // return 0 damage if hero phy defense > this phy attack
        damage = 0;
      }
      atkHero.hp -= damage;
        if (atkHero.hp <= 0) { //return 0 if hp <= 0
          atkHero.hp = 0;
        }
      System.out.println(this.hero.getName() + " attacks " + atkHero.getName() + " with "+ this.weapon.getName());
      System.out.println(atkHero.getName() + " takes " + damage + " damage");
      System.out.println(atkHero.getName() + " has " + atkHero.getHp() + " hp left");

    if (atkHero.hp <= 0) { //return dead 
      atkHero.hp = 0;
      System.out.println(atkHero.getName() + " is dead.");
      System.out.println();
    }
    }
  }

  public static void main(String[] args) {
    Hero h1 = new Warrior("Galen");

    SuperHero<Hero, Weapon> s = new SuperHero<>();
    s.setHero(h1);
    s.phyAttack(s.hero);
    s.setWeapon(new Wand());
    h1.getDetails();
    s.setWeapon(new Sword());
    System.out.println(s.totalPA());
    h1.getDetails();
    s.phyAttack(s.hero);
    s.phyAttack(s.hero);
    s.phyAttack(s.hero);
    s.phyAttack(s.hero);

  }
  
}
