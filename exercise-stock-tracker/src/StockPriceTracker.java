import java.time.LocalDate;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class StockPriceTracker {
  // code here: Design your PQ, so that it always poll the highest price first.
  private final Queue<Double> maxPricePQ = new PriorityQueue<>(Comparator.reverseOrder());

  private final Map<LocalDate, Double> tradeRecords = new HashMap<>();
  private final Deque<LocalDate> tradeDates = new LinkedList<>();

  public void addRecord(LocalDate date, double price) {
    // code here ...
    // 1. Add the trade record to the hashMap
    tradeRecords.put(date, price);
    // 2. Add the price to PQ
    maxPricePQ.add(price);
    // 3. Add the trade date to Deque
    tradeDates.add(date);
    System.out.println("Recorded: " + date + " -> $" + price);
  }

  public double getLatestPrice() {
    // code here ...
    // Tips: use tradeDates & tradeRecords

    // get last trade date and return its price
    // date = tradeDates.getLast();
    // trade record get price by date
    return tradeRecords.get(tradeDates.getLast());
  }

  public double getHighestPrice() {
    // code here ...
    // Tips: use maxPricePQ
    
    // PQ sort highest price & poll
    return maxPricePQ.poll();
  }

  public static void main(String[] args) {
    StockPriceTracker tracker = new StockPriceTracker();
    tracker.addRecord(LocalDate.of(2024, 1, 1), 100.50);
    tracker.addRecord(LocalDate.of(2024, 1, 2), 200.75);
    tracker.addRecord(LocalDate.of(2024, 1, 3), 150.25);
    System.out.println("Latest price: $" + tracker.getLatestPrice()); // Output: 150.25
    System.out.println("Highest price: $" + tracker.getHighestPrice()); // Output: 200.75
  }

}