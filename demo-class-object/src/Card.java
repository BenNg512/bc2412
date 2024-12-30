public class Card {
  // static (shared values between all objects)
  // final: cannot be changed after initialization
  // static and final will be together
  // static final -> Constant
  // Constant naming convention eg. pi = PI; e = E;
  public static final char[] RANKS = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
  public static final char[] SUITES = {'D', 'C', 'H', 'S'};

  // Attributes
  private char rank; // 2,3,4,5,6,7,8,9,T,J,Q,K,A, //! assign new char to 10
  private char suite; // Diamonds, Clubs, Hearts, Spades: D,C,H,S
  public Card(char suite, char rank) {
    this.suite = suite;
    this.rank = rank;
  }
  public char getRank() {
    return this.rank;
  }
  public char getSuite() {
    return this.suite;
  }
  public String getColor(){
    if (this.suite == 'H' || this.suite == 'D'){
      return "Red";
    } else {
      return "Black";
    }
  }




  
}
