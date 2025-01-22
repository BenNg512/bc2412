public class SuperHero<T extends Hero, U extends Weapon>{
  private T hero;
  private U weapon;
  
  @SuppressWarnings("unchecked")
  SuperHero() {
    this.weapon = (U) new BareHands(); // default weapon is bare hands for new SuperHero
  }
  
  public T getHero() {
    return this.hero;
  }
  public void setHero(T hero) {
    if (this.hero != null) 
      System.out.println(" You cannot change this hero.");
    else
      this.hero = hero;
  }
  public U getWeapon() {
    return this.weapon;
  }
  public void setWeapon(U weapon) {
    this.weapon = weapon;
    System.out.println(this.hero.name + " is equipped with " + this.weapon.name);
  }
  @SuppressWarnings("unchecked")
  public void removeWeapon() {
    this.weapon = (U) new BareHands();
    System.out.println(this.hero.getName() + " has removed weapon.");
  }


  public String getName() {
    return this.hero.name;
  }
  public String getRole() {
    return this.hero.role;
  }
  public String getId() {
    return this.hero.getId();
  }
  public String getWeaponName() {
    return this.weapon.name;
  }


  public int totalHpMax(){
    return this.hero.hpMax + this.weapon.addOnHpMax;
  }
  public int totalMpMax(){
    return this.hero.mpMax + this.weapon.addOnMpMax;
  }
  //! current HP
  //! current MP
  public int totalPA() {
    return this.hero.PA + this.weapon.PA;
  }
  public int totalPD() {
    return this.hero.PD + this.weapon.PD;
  }
  public int totalMA() {
    return this.hero.MA + this.weapon.MA;
  }
  public int totalMD() {
    return this.hero.MD + this.weapon.MD;
  }
  public void levelUp(){
    this.hero.levelUp();


  }


  //! need to update her atkHero to atkSuperHero
  //! update the data type of atkHero: PD to totalPD
  public void phyAttack(SuperHero<Hero, Weapon> atkHero){
    int damage = 0;
    if (atkHero.hero.hp == 0) {
      System.out.println(atkHero.hero.getName() + " is dead already. Respect! Don't hit the dead body la.");
    } else {
      damage = this.totalPA() - atkHero.totalPD();
        if(damage <= 0){ // return 0 damage if total phy defense > this phy attack
          damage = 0;
        }
          atkHero.hero.hp -= damage;
        if (atkHero.hero.hp <= 0) { //return 0 if hp <= 0
          atkHero.hero.hp = 0;
        }
      System.out.println(this.hero.getName() + " attacks " + atkHero.hero.getName() + " with "+ this.weapon.getName());
      System.out.println(atkHero.hero.getName() + " takes " + damage + " damage");
      System.out.println(atkHero.hero.getName() + " has " + atkHero.hero.getHp() + " hp left");
    if (atkHero.hero.hp <= 0) { //return dead 
      atkHero.hero.hp = 0;
      System.out.println(atkHero.hero.getName() + " is dead.");
      System.out.println();
    }
    }
  }

}
