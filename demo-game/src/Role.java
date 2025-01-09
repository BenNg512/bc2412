public enum Role {
  Warrior("Warrior"),
  Archer("Archer"),
  Mage("Mage"),
  ;

  private final String description;
  Role(String description){
    this.description = description;
  }
  public String getDesc() {
    return this.description;
  }

}
