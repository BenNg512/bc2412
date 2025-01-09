public abstract class Hero implements Actions { 
// abstract here so cannot new Hero
  private static int lastId = 0;
  public String name; // Name
  public String role; // Warrior, Archer, Mage
  public int heroId;
  public int warriorId;
  public int archerId;
  public int mageId;
  public int lv; // level
  public int hp; // Health Point
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
  }

  public String getId(){ 
    return "HERO" + this.heroId + "W" + this.warriorId + "A" + this.archerId + "M" + this.mageId;
  }

  public void getDetails(){
    System.out.println("            Name : " + this.getName());
    System.out.println("              ID : " + this.getId());
    System.out.println("            Role : " + this.getRole());
    System.out.println("              Lv : " + this.getLv());
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
    return this.PA;
  }
  public int getPD() {
    return this.PD;
  }
  public int getMA() {
    return this.MA;
  }
  public int getMD() {
    return this.MD;
  }
  public int getAG() {
    return this.AG;
  }
  public double getCC() {
    return this.CC;
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

}