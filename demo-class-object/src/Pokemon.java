public class Pokemon {
  
  private String name;
  private boolean isLegendary;
  private int level;
  private double height;
  private String type;
  private String weakness;
  
  public Pokemon(String name, boolean isLegendary, int level, double height,  String type, String weakness) {
    this.name = name;
    this.isLegendary = isLegendary;
    this.level = level;
    this.height = height;
    this.type = type;
    this.weakness = weakness;
  }

  public String getName() {
    return this.name;
  }
  public boolean getIsLegendary() {
    return this.isLegendary;
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

  public static void main(String[] args){

  Pokemon Pikachu = new Pokemon("Pikachu", false, 5, 0.4, "Electric", "Ground");
  Pokemon Squirtle = new Pokemon("Squirtle", false, 10, 0.5, "Water", "Grass, Electricity");
  Pokemon Rayquaza = new Pokemon("Rayquaza",true, 70, 7, "Dragon, Flying", "Ice, Dragon, Fairy, Rock");
  Pokemon 騎拉帝納 = new Pokemon("騎拉帝納",true, 70, 4.5, "Dragon, Ghost", "Ice, Dragon, Fairy, Ghost, Dark");

  Pokemon[] pokemons = new Pokemon[] {Pikachu, Squirtle, Rayquaza, 騎拉帝納};

  for (Pokemon pokemon : pokemons){
    System.out.println(
    "Name: " + pokemon.getName() +
    ", Is Legendary: " + pokemon.getIsLegendary() +
    ", Level: " + pokemon.getLevel() +
    ", Height: " + pokemon.getHeight() + "M"+
    ", Type: " + pokemon.getType() +
    ", Weakness: " + pokemon.getWeakness());
  }

  } 
}
