public class BattleField {
  public static void main(String[] args) {
    Hero h1 = new Warrior("Galen");
    Hero h2 = new Archer("Ashe");

    SuperHero<Hero, Weapon> s1 = new SuperHero<>();
    System.out.println(s1.getHero());
    s1.setHero(h1); 
    s1.setHero(h2); // change h1 to h2 -> nothing happens
    System.out.println(s1.getHero().name);

    SuperHero<Hero, Weapon> s3 = new SuperHero<>();
    s3.setHero(new Mage("Gandalf"));
    s3.getHero().setPA(100);
    s3.setWeapon(new Sword());
    s3.getHero().setMA(100);
    s3.phyAttack(s1); 

    SuperHero<Hero, Weapon> s2 = new SuperHero<>();
    s2.setHero(h2);
    s1.phyAttack(s2);
    s1.setWeapon(new Wand());
    s2.setWeapon(new Sword());
    System.out.println(s1.totalPA());
    h1.getHeroDetails();
    s1.phyAttack(s2);
    s2.phyAttack(s1);
    s1.phyAttack(s2);
    s2.phyAttack(s1);
    s1.phyAttack(s2);
    s1.removeWeapon();
    h1.getHeroDetails();
    h1.getHpMax();
    System.out.println(s1.getName() + " Max HP: " + s1.totalHpMax());
    System.out.println(s2.getName() + " Max HP: " + s2.totalHpMax());




  }
}
