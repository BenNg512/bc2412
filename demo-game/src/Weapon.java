public abstract class Weapon {
  public int weaponId;
  public String name;
  public int hpMax; // Max Health Point
  public int mpMax; // Max Magic Point
  public int PA = 0; // Physical Attack
  public int PD; // Physical Defense
  public int MA; // Magic Attack
  public int MD; // Magic Defense
  public int AG; // Agility
  public double CC; // Critical Chance
  public double CD; // Critical Damage
  
  public String getName(){
    return this.name;
  }
}
