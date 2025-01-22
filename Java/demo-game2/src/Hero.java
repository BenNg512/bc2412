import java.math.BigDecimal;

public abstract class Hero implements HeroInterface { 
// abstract here so cannot new Hero
  private int lastId = 0;
  public String name; // Name
  public String role; // Warrior, Archer, Mage
  public Weapon weapon;
  public int heroId;
  public int warriorId;
  public int archerId;
  public int mageId;
  public int lv; // level
  public int hp; // heroHP
  public int hpMax; // Max Health Point
  public int mp; // Magic Point
  public int mpMax; // Max Magic Point
  public int PA; // Physical Attack
  public int PD; // Physical Defense
  public int MA; // Magic Attack
  public int MD; // Magic Defense
  public int AG; // Agility
  public double CC; // Critical Chance
  public double CD; // Critical Damage
  
  public Hero() {
      this.heroId = ++lastId; // Assign a new unique ID
      this.weapon = new BareHands(); // default weapon is not null
  }

  public String getName() {
    return this.name;
  }
  public String getRole() {
    return this.role;
  }
  public int getHeroId(){
    return this.heroId;
  }
  public int getLv() {
    return this.lv;
  }
  public int getHp() {
    return this.hp;
  }
  public int getHpMax() {
    return this.hpMax;
  }
  public int getMp() {
    return this.mp;
  }
  public int getMpMax() {
    return this.mpMax;
  }
  public int getPA() {
    return this.PA + this.weapon.PA;
  }
  public int getPD() {
    return this.PD;
  }
  public int getMA() {
    return this.MA + this.weapon.MA;
  }
  public int getMD() {
    return this.MD;
  }
  public int getAG() {
    return this.AG;
  }
  public double getCC() {
    // return this.CC + this.weapon.CC;
    BigDecimal Total = BigDecimal.valueOf(this.CC).add(BigDecimal.valueOf(this.weapon.CC));
    return Total.doubleValue();
  }
  public double getCD() {
    return this.CD;
  }

  boolean isAlive(){
    return this.hp > 0 ? true : false;
  }

  boolean isDead(){
    return this.hp <= 0 ? true : false;
  }

  public String setName(String name) {
    return this.name = name;
  }
  // public final String setRole(String role) { // change of role is not allowed
  // return this.role;
  // }
  public int setLv(int lv) { // 1-99 only
    this.lv = Math.max(1, Math.min(lv, 99));
    return this.lv;
  }
  public int setHp(int hp) { // 0 - hpMax
    this.hp = Math.max(0, Math.min(hp, this.hpMax));
    return this.hp;
  }
  public int setHpMax(int hpMax) { // 100-9999
    this.hpMax = Math.max(100, Math.min(hpMax, 9999));
    return this.hpMax;
  }
  public int setMp(int mp) { // 0 - mpMax
    this.mp = Math.max(0, Math.min(mp, this.mpMax));
    return this.mp;
  }
  public int setMpMax(int mpMax) { // 0-999
    this.mpMax = Math.max(0, Math.min(mpMax, 999));
    return this.mpMax;
  }
  public int setPA(int PA) {
    this.PA = Math.max(0, Math.min(PA, 999));
    return this.PA;
  }
  public int setPD(int PD) {
    this.PD = Math.max(0, Math.min(PD, 999));
    return this.PD;
  }
  public int setMA(int MA) {
    this.MA = Math.max(0, Math.min(MA, 999));
    return this.MA;
  }
  public int setMD(int MD) {
    this.MD = Math.max(0, Math.min(MD, 999));
    return this.MD;
  }
  public int setAG(int AG) {
    this.AG = Math.max(0, Math.min(AG, 999));
    return this.AG;
  }
  public double setCC(double CC) { // 0-1
    this.CC = Math.max(0, Math.min(CC, 1));
    return this.CC;
  }
  public double setCD(double CD) { // 1.5-10
    this.CD = Math.max(1.5, Math.min(CD, 10));
    return this.CD;
  }

  public String getId(){ 
    return "HERO" + this.heroId + "W" + this.warriorId + "A" + this.archerId + "M" + this.mageId;
  }

  public void getFinalDetails(){
    System.out.println("            Name : " + this.getName());
    System.out.println("              ID : " + this.getId());
    System.out.println("            Role : " + this.getRole());
    System.out.println("              Lv : " + this.getLv());
    System.out.println("          Weapon : " + this.weapon.getWeaponName() + " LV" + this.weapon.getWeaponLevel());
    System.out.println("              Hp : " + this.getHp() + " / " + this.getHpMax());
    System.out.println("              Mp : " + this.getMp() + " / " + this.getMpMax());
    System.out.println("Physical Attack  : " + this.getPA());
    System.out.println("Physical Defense : " + this.getPD());
    System.out.println("Magical Attack   : " + this.getMA());
    System.out.println("Magical Defense  : " + this.getMD());
    System.out.println("Agility          : " + this.getAG());
    System.out.println("Critical Chance  : " + this.getCC());
    System.out.println("Critical Damage  : " + this.getCD());
    System.out.println("Is Alive?        : " + this.isAlive());
    System.out.println();
  }

  public String getWeaponName(){
    return this.weapon.getWeaponName();
  }

  public void validateAvailableWeapon() {
    if ("Warrior".equals(this.role) && !(weapon instanceof Sword)
      || "Archer".equals(this.role) && !(weapon instanceof Bow)
      || "Mage".equals(this.role) && !(weapon instanceof Stave)){
      throw BusinessRuntimeException.of(SysError.INVALID_WEAPON);
      }
    }
  public void setWeapon(Weapon weapon){
    try{
      validateAvailableWeapon();
      this.weapon = weapon;
    }finally{
      System.out.println("Set Weapon Done!");
    }
  }

  protected void setWeapon(Sword sword) {
    if ("Warrior".equals(this.role)) {
      this.weapon = sword;
      System.out.println(this.name + " is equipped with " + this.weapon.getWeaponName());
    } else {
      System.out.println(this.name + " cannot equip" + this.weapon.getWeaponName());
    }
  }
  protected void setWeapon(Bow bow) {
    if ("Archer".equals(this.role)) {
      this.weapon = bow;
      System.out.println(this.name + " is equipped with " + this.weapon.getWeaponName());
    } else {
      System.out.println(this.name + " cannot equip a bow");
    }
  }
  protected void setWeapon(Stave stave) {
    if ("Mage".equals(this.role)) {
      this.weapon = stave;
      System.out.println(this.name + " is equipped with " + this.weapon.getWeaponName());
    } else {
      System.out.println(this.name +" cannot equip a wand");
    }
  }
  
  public void removeWeapon(){
    this.weapon = new BareHands();
  }

  public void phyAttack(Hero atkHero){
    int phyDamage = 0;
    if (this.hp == 0) {
      System.out.println(this.getName() + " cannot attack because is dead already.");
    } else if (atkHero.hp == 0) {
      System.out.println(atkHero.getName() + " is dead already. Respect! Don't hit the dead body la.");
      System.out.println();
    } else {
      phyDamage = this.getPA() - atkHero.getPD();
        if(phyDamage <= 0){ // return 0 damage if total phy defense > this phy attack
          phyDamage = 0;
        }
          atkHero.hp -= phyDamage;
        if (atkHero.hp <= 0) { //return 0 if hp <= 0
          atkHero.hp = 0;
        }
      System.out.println(this.getName() + " attacks " + atkHero.getName() + " with "+ this.getWeaponName());
      System.out.println(atkHero.getName() + " takes " + phyDamage + " physical damages");
      System.out.println(atkHero.getName() + " has " + atkHero.getHp() + " hp left");
      System.out.println();

    if (atkHero.hp <= 0) { //return dead 
      atkHero.hp = 0;
      System.out.println(atkHero.getName() + " is dead.");
      System.out.println();
    }
    }
  }

}