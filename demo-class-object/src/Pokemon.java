public class Pokemon {
  
  private String name;
  private boolean isLegendary;
  private int level;
  private boolean hasGender;
  private double height;
  private String type;
  private String weakness;
  
  public Pokemon(String name, boolean isLegendary, int level, boolean hasGender,double height,  String type, String weakness) {
    this.name = name;
    this.isLegendary = isLegendary;
    this.level = level;
    this.hasGender = hasGender;
    this.height = height;
    this.type = type;
    this.weakness = weakness;
  }
  // Getters
  public String getName() {
    return this.name;
  }
  public boolean getIsLegendary() {
    return this.isLegendary;
  }
  public boolean getHasGender() {
    return this.hasGender;
  }
  // constance
  public boolean canReproduce() {
    if (this.name.equals("Ditto") != true){
    return this.hasGender ? true : false;
    }else return true;
  }
  public int getLevel() {
    return this.level;
  }
  public double getHeight() {
    return this.height;
  }
  public String getType() {
    return this.type;
  }
  public String getWeakness() {
    return this.weakness;
  }
  // Setters
  public void setName(String name) {
    this.name = name;
  }
  public void setIsLegendary(boolean isLegendary) {
    this.isLegendary = isLegendary;
  }
  public void setLevel(int level) {
    this.level = level;
  }
  public void setHeight(double height) {
    this.height = height;
  }
  public void setType(String type) {
    this.type = type;
  }
  public void setWeakness(String weakness) {
    this.weakness = weakness;
  }


  public static void main(String[] args){

  Pokemon Pikachu = new Pokemon("Pikachu", false, 5, true, 0.4, "Electric", "Ground");
  Pokemon Squirtle = new Pokemon("Squirtle", false, 10, true,0.5, "Water", "Grass, Electricity");
  Pokemon Rayquaza = new Pokemon("Rayquaza",true, 70, false, 7, "Dragon, Flying", "Ice, Dragon, Fairy, Rock");
  Pokemon 騎拉帝納 = new Pokemon("騎拉帝納",true, 70, false, 4.5, "Dragon, Ghost", "Ice, Dragon, Fairy, Ghost, Dark");
  Pokemon Ditto = new Pokemon("Ditto",false, 0, false, 0.5, "Normal", "Fighting");

  Pokemon[] pokemons = new Pokemon[] {Pikachu, Squirtle, Rayquaza, 騎拉帝納, Ditto};

  for (Pokemon pokemon : pokemons){
    System.out.println(
    "Name: "          + pokemon.getName() + ", " +
    "Is Legendary: "  + pokemon.getIsLegendary() + ", " +
    "Level: "         + pokemon.getLevel() + ", " +
    "Can reproduce? " + pokemon.canReproduce() + ", " +
    "Height: "        + pokemon.getHeight() + " Meter(s), " +
    "Type: "          + pokemon.getType() + ", " +
    "Weakness: "      + pokemon.getWeakness());
  }

  } 
}
