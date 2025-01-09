public class ArcherAshe extends Archer {
  public ArcherAshe(String name) {
    super(name);
  }
  public static void main(String[] args) {
    ArcherAshe ashe = new ArcherAshe("Ashe");
    ashe.levelUp();
    ashe.getDetails();
    System.out.println(ashe.getPA());
  }
}
