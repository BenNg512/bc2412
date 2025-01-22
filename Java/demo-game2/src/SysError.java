public enum SysError {
  INVALID_WEAPON("Invalid Weapon."),
  INVALID_HERO("Invalid Hero."),
  ;
  private String desc;

  private SysError(String desc) {
  this.desc = desc;
}

  public String getDesc(){
    return this.desc;
  };
}
