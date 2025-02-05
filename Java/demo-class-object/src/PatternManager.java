public class PatternManager {
  private Card[] cards = new Card[5];

  public PatternManager(Card[] cards) {
    if (cards.length != 5) {
      throw new IllegalArgumentException("PatternManager must have 5 cards");
    }
    if ( cards[0] == null 
      || cards[1] == null 
      || cards[2] == null
      || cards[3] == null
      || cards[4] == null) {
      throw new IllegalArgumentException("PatternManager must have 5 cards");
    }
    this.cards = cards;
  }

  public boolean isStraightFlush() {
    return this.cards[0].getSuite() == this.cards[1].getSuite()
    && this.cards[1].getSuite() == this.cards[2].getSuite()
    && this.cards[2].getSuite() == this.cards[3].getSuite()
    && this.cards[3].getSuite() == this.cards[4].getSuite();
  }

  public boolean hasPair() {
    return this.cards[0].getRank() == this.cards[1].getRank()
    || this.cards[1].getRank() == this.cards[2].getRank()
    || this.cards[2].getRank() == this.cards[3].getRank()
    || this.cards[3].getRank() == this.cards[4].getRank();
  }

  public boolean isFullHouse(){
    return this.cards[0].getRank() == this.cards[1].getRank()
    && this.cards[2].getRank() == this.cards[3].getRank()
    && this.cards[3].getRank() == this.cards[4].getRank();
  }

  public boolean hasThreeKind() {
    return this.cards[0].getRank() == this.cards[1].getRank()
    && this.cards[1].getRank() == this.cards[2].getRank()
    || this.cards[1].getRank() == this.cards[2].getRank()
    && this.cards[2].getRank() == this.cards[3].getRank()
    || this.cards[2].getRank() == this.cards[3].getRank()
    && this.cards[3].getRank() == this.cards[4].getRank();
  }
  public boolean isFlush() {
    int maxSuite = this.cards[0].getSuite();
    int minSuite = this.cards[0].getSuite();
    for (int i = 1; i < this.cards.length; i++) {
      if (this.cards[i].getSuite() > maxSuite) {
        maxSuite = this.cards[i].getSuite();
      }
      if (this.cards[i].getSuite() < minSuite) {
        minSuite = this.cards[i].getSuite();
      }
    }
    return (maxSuite + minSuite) * 5/2 == (maxSuite - minSuite);
  }

  
}
