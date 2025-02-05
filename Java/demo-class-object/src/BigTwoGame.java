import java.util.List;

public class BigTwoGame {
  private Deck deck;
  private ShuffleManager shuffleManager;
  private final Players[] players = new Players[4];
  {
  this.players[0] = new Players(1);
  this.players[1] = new Players(2);
  this.players[2] = new Players(3);
  this.players[3] = new Players(4);
  }

  public BigTwoGame() {
    this.shuffleManager = new ShuffleManager(this.deck.getCards());
    
  }
  public void start() {
    this.shuffleManager.shuffle();
  }
  
}
