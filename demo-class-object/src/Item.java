import java.math.BigDecimal;

public class Item {
  private String name;
  private double price;
  private int quantity;

  public Item(String name, double price, int quantity) {
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getName() {
    return this.name;
  }

  public double getPrice() {
    return this.price;
  }

  public double getQuantity() {
    return this.quantity;
  }
  public double totalAmount(){
    BigDecimal total = BigDecimal.valueOf(0.0);
      total = total.add(BigDecimal.valueOf(this.price * this.quantity));//
    return total.doubleValue();
    }
  
  public double orderTotalAmount(Item[] items){
    double sum = 0;
      for (Item item: items){
        sum += item.totalAmount();
      }
    return sum;            
}
}
