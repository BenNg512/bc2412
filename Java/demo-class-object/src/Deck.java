import java.util.Arrays;
import java.util.List;

public class Deck {
  // 52 cards
  private Card[] cards;
  public Deck() {
    
    this.cards = new Card[Card.RANKS.length * Card.SUITES.length];
    for (int i = 0; i < Card.SUITES.length; i++) {
      for (int j = 0; j < Card.RANKS.length; j++) {
        this.cards[i * 13 + j] = new Card(Card.SUITES[i],Card.RANKS[j]);
      }
    }
    // int idx = 0;
    // for (char rank : suites) {
    //   for (char suite : ranks) {
    //     this.cards[idx++] = new Card(rank, suite);
    //   }
    // }
    }

    public List<Card> getCards() {
      return Arrays.asList(this.cards);
    }
  
  public static void main(String[] args) {
    Deck deck = new Deck();
  
  for (Card cards : deck.cards) {
    System.out.println(cards.getSuite() +""+ cards.getRank());
  }
}

}
