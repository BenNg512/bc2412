public abstract class Weapon {
  public int weaponId;
  public String name;
  // Additional Stat
  public int addOnHpMax; // Max Health Point += this weapon hpMax
  public int addOnMpMax; // Max Magic Point += this weapon mpMax
  public int PA; // Physical Attack
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
