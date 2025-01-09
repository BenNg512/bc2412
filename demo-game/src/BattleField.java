public class BattleField {
  public static void main(String[] args) {
  Warrior Galen = new Warrior("Galen"); //ID2
    Galen.getDetails();
    Galen.levelUp();
    Galen.levelUp();
    Galen.levelUp();
    Galen.levelUp();
    Galen.getDetails();

  Hero Ashe = new Archer("Ashe"); //ID2
    Ashe.getDetails();

    Ashe.levelUp();
    Ashe.getDetails();

    Ashe.getDetails();
    Ashe.setLv(98);
    Ashe.getDetails();
    Ashe.levelUp();
    Ashe.levelUp();
    Ashe.levelUp();
    Ashe.getDetails();
    Ashe.setPD(01);

    
  Hero Teemo = new Mage("Teemo"); //ID2
  Teemo.getDetails();
  Hero Gandalf = new Mage("Gandalf");
  Gandalf.setHp(1);
  Gandalf.getDetails();






  }
  
}
