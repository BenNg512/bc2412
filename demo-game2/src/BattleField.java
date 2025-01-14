public class BattleField {
  public static void main(String[] args) {
    Hero h1 = new Warrior("Galen");
    Warrior w2 = new Warrior("Galen2");
    System.out.println(h1.getWeaponName());
    Sword s1 = new Sword_Doran();
    Sword s2 = new Sword_Hexdrinker();
    Stave wd1 = new Stave_Archangel();
    Bow b1 = new Bow_Recurve();
    h1.getFinalDetails();
    h1.setWeapon(s1);

    Hero h2 = new Archer("Ashe");
    h2.setWeapon(b1);
    Hero h3 = new Mage("Gandalf");

    while (h1.hp > 0 && h2.hp > 0){
      if (h1.AG > h2.AG) {
        h1.phyAttack(h2);
        h2.phyAttack(h1);
      } else {
        h2.phyAttack(h1);
        h1.phyAttack(h2);
      }
    }
    

    h1.getFinalDetails();
    h2.getFinalDetails();
    h2.phyAttack(h1);
    h1.phyAttack(h2);




  }
}