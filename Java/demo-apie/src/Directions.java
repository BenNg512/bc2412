public enum Directions {
  E(90, 1), 
  S(180, 2), 
  W(270, -1),
  N(360, -2),
  ; 

  private final int value;
  private final int angle;

  private Directions(int angle, int value) {
    this.angle = angle;
    this.value = value;
  }

  public int getAngle() {
    return this.angle;
  }

  public Directions opposite() {
    for (Directions d : values()) {
      if (d.value == this.value * -1) { //remember to set E = 1, W = -1 if you use this method 
        return d;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    System.out.println(Directions.E.getAngle());
    System.out.println(Directions.E.opposite());
  }
  
}
