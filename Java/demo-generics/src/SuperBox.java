public class SuperBox<T extends Animal, U extends Hero, V extends Weapon> {
  private T animal;
  private U hero;
  private V weapon;

  public void setAnimal(T animal) {
    this.animal = animal;  
  }
  public void setHero(U hero) {
    this.hero = hero;
  }
  public void setWeapon(V weapon) {
    this.weapon = weapon;
  }
  public T getAnimal() {
    return this.animal;
  }
  public U getHero() {
    return this.hero;
  }
  public V getWeapon() {
    return this.weapon;
  }

  public int totalAttack(){
    return this.animal.run() + this.hero.attack() + this.weapon.onTopAttack();
  }
    
  public static void main (String[] args) {
    SuperBox<Tiger, Hero, Weapon> s1 = new SuperBox<>();
    s1.setAnimal(new Tiger());
    s1.setHero(new Mage());
    s1.setWeapon(new Bow());
    
    System.out.println(s1.getAnimal());
    System.out.println(s1.getHero());
    System.out.println(s1.getWeapon());
    System.out.println(s1.totalAttack());
    //s1.setAnimal(new Panda());
    s1.setWeapon(new Sword());
    System.out.println(s1.totalAttack());





  
  }
}
