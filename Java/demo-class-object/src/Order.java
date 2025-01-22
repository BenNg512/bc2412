import java.math.BigDecimal;

public class Order {
  private long id;
  private Item[] items; // address/ reference -> Item[] array
  
    public Order(long id) {
    this.id = id;
      this.items = new Item[0];
    }
    public long getId() {
      return this.id;
    }
    public Item[] getItems() {
      return this.items;
    }
    public void addItem(Item item) {
      Item[] newItems = new Item[this.items.length + 1];
      for (int i = 0; i < this.items.length; i++) {
        newItems[i] = this.items[i];
      }
      newItems[newItems.length - 1] = item;
      this.items = newItems;
    }
    public void removeItem(Item item) {
      Item[] newItems = new Item[this.items.length - 1]; // resize array
      int idx = 0; 
      for (int i = 0; i < this.items.length; i++) {
        if (this.items[i].equals(item) == false){ // if (this.items[i]equals(item)){continue;}
        newItems[idx++] = this.items[i]; // copy
        }
      }
      this.items = newItems;
    }

    public double totalAmount(){
      BigDecimal total = BigDecimal.valueOf(0.0);
      for (Item item : this.items){
        total = total.add(BigDecimal.valueOf(item.totalAmount()));//
      }
      return total.doubleValue();
    }
}