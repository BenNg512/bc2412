import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class RealStockPriceTracker{
  // You should complete StockPriceTracker first.
  
  // In RealStockPriceTracker, we should consider the stock price is by Stock Code & Trade date
  // For example, the stock price of GOOGL on 13 Jan is $191.01

  // Tips: You should still use PriorityQueue, HashMap, Deque
  private final Queue<Double> maxPricePQ = new PriorityQueue<>(Comparator.reverseOrder());
  private final Map<LocalDate, Double> tradeRecords = new HashMap<>();
  private final Deque<LocalDate> tradeDates = new LinkedList<>();
  private final Map<String, Map<LocalDate, Double>> stockCodes = new HashMap<>();

  public void addRecord(String stockCode, LocalDate date, double price) {

    tradeRecords.put(date, price);
    maxPricePQ.add(price);
    tradeDates.add(date);
    System.out.println("Recorded: " + date + " -> $" + price);
  }

  public double getLatestPrice(String stockCode) {
    return tradeRecords.get(tradeDates.getLast());
  }

  public double getHighestPrice(String stockCode) {
    return maxPricePQ.poll();
  }

  // Complete getHighestPrice() and getLatestPrice()

  public static void main(String[] args) {
    RealStockPriceTracker tracker = new RealStockPriceTracker();
    // Should assume that the record are added by Trade date in ascending order 
    tracker.addRecord("GOOGL", LocalDate.of(2024, 1, 1), 100.50);
    tracker.addRecord("GOOGL", LocalDate.of(2024, 1, 2), 200.75);
    tracker.addRecord("GOOGL", LocalDate.of(2024, 1, 3), 150.25);
    tracker.addRecord("DXYZ", LocalDate.of(2024, 1, 1), 50);
    tracker.addRecord("DXYZ", LocalDate.of(2024, 1, 2), 60);
    tracker.addRecord("TSLA", LocalDate.of(2024, 1, 16), 413.6);
    tracker.addRecord("TSLA", LocalDate.of(2024, 1, 15), 396.6);
    tracker.addRecord("TSLA", LocalDate.of(2024, 1, 14), 403.3);

    // code here ... for testing
    System.out.println("Latest price: $" + tracker.getLatestPrice("GOOGL"));
    System.out.println("Highest price: $" + tracker.getHighestPrice("GOOGL"));
  }

}