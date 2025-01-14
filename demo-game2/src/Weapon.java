public abstract class Weapon implements WeaponInterface {
  public int weaponId;
  public String weaponName;
  // Additional Stat
  public int lv;
  public int PA; // Physical Attack
  public int MA; // Magic Attack
  public double CC; // Critical Chance
  
  Weapon(){
    this.weaponName = "bare hands";
    this.lv = 1;
  }
  
  public String getWeaponName(){
    return this.weaponName;
  }
  public void getWeaponDetails(){
    System.out.println("Weapon Name     : " + this.weaponName);
    System.out.println("Weapon Level    : " + this.lv);
    System.out.println("Physical Attack : " + this.PA);
    System.out.println("Magic Attack    : " + this.MA);
    System.out.println("Critical Chance : " + this.CC);
    System.out.println();
  }

  public int getWeaponLevel(){
    return this.lv;
  }
}
