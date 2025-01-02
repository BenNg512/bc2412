public class Hero {
  private String name;
  private int lv;
  private int hp;
  private int hpMax;
  private int mp;
  private int mpMax;
  
  // hp / mp / atk / def / speed / lv
  // lv upgrade -> max hp max mp increase 
  // Presentation isAlive
  // Actions: Level up
  public Hero(String name, int lv, int hpMax, int mpMax) {
    this.name = name;
    this.lv = lv;
    this.hpMax = hpMax;
    this.mpMax = mpMax;
    
  }
  public void getDetails(){
    System.out.println("Name: " + this.getName());
    System.out.println("Lv: " + this.getLv());
    System.out.println("Max Hp: " + this.getHpMax());
    System.out.println("Max Hp: " + this.getHp());
    System.out.println("Max Mp: " + this.getMpMax());
    System.out.println("Max Hp: " + this.getHp());
    System.out.println("Is Alive: " + this.isAlive());
  }

  public String getName() {
    return name;
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
  public void setName(String name) {
    this.name = name;
  }

  boolean isAlive(){
    return this.hp > 0 ? true : false;
  }

  public void levelUp(){
    this.lv += 1;
    this.hpMax += 10;
    this.mpMax += 5;
    this.hp = this.hpMax; // restore hp
    this.mp = this.mpMax; // restore mp
  }

  public static void main(String[] args) {
    Hero hero = new Hero("Hero", 1, 100, 100);
    hero.getDetails();

    hero.levelUp();
    hero.getDetails();

  }

}
