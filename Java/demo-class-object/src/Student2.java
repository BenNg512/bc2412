public class Student2 {
    // Question 2:
    // Candy class has attribute color (RED, BLUE, GREEN)
    // Student2.class to store his own candies
    // Every round of distribute candies, 80-> RED, 60-79 -> BLUE, 0-59 -> YELLOW
    // Expected outcome: system.out student[] student should have Candy attribute
  private String name;
  private int score;
  private Candy2[] candies;
  
  public Student2(String name, int score) {
    this.name = name;
    this.score = score;
    this.candies = new Candy2[0];
  }

  public String getName() {
    return name;
  }

  public int getScore() {
    return this.score;
  }

  public Candy2[] getCandies() {
    return this.candies;
  }

  public String getCandyInfo(){
    String info = "[";
    for (Candy2 candy : this.candies) {
      info += candy.getColor() + " , ";
    }
    return info.substring(0, info.length() - 1) + "]";
  }

  public int getCandyCount() {
    return this.candies.length;
  }

  public void receiveCandy(Candy2 candies) {
    Candy2[] newCandies = new Candy2[this.candies.length + 1];
    for (int i = 0; i < this.candies.length; i++) {
      this.candies[i] = newCandies[i];
    } 
    newCandies[newCandies.length - 1] = candies;
    this.candies = newCandies;
  }

  
}
