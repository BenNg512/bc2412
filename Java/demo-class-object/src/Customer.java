import java.math.BigDecimal;

public class Customer { // person, has name, age
  private long id;
  private Order[] orders; // reference

  //! 1. Normally customer can be created without any order
  //  public Customer(long id, Order[] orders) {
  //  this.id = id;
  //  this.orders = orders;
  //  }
  public Customer(long id){
    this.id = id;
    this.orders = new Order[0];
  }
  // search order id -> find Item[]
  public Item[] getItems(long orderId){
    for (Order order : this.orders){
      if(order.getId() == orderId){
        return order.getItems();
      }
    }
    // for (int i = 0; i < this.orders.length; i++){ 
    // if(this.orders[i].getId() == orderId){
    // return this.orders[i].getItems();
    // }
    // }
    return new Item[0]; // or return null;    
  }
  // totalOrderAmount by order id
  public double getTotalOrderAmount(long orderId){
    for (Order order : this.orders){
      if(order.getId() == orderId){
        return order.totalAmount();
      }
    }
    // for (int i = 0; i < this.orders.length; i++){
    //   if(this.orders[i].getId() == orderId){
    //     return this.orders[i].totalAmount();
    //   }
    // }
    return -1.0;
  }
  // IsVIP() -> if (totalOrderAmount of all orders > 100_000)
  public boolean isVIP(){
    BigDecimal totalExp = BigDecimal.valueOf(0.0);
      for (Order order : this.orders){
        totalExp = totalExp.add(BigDecimal.valueOf(order.totalAmount()));
      }
    return totalExp.doubleValue() >= 100_000; //"? true : false;
    }
  

  //! 2. Customer can place order after creating the account
  public void placeOrder(Order order){
    Order[] newOrders = new Order[this.orders.length + 1]; 
    // ^ update the order array (create a new box)
    // ^ order No. total +1 in the array if add new order
    for (int i = 0; i < this.orders.length; i++){
      newOrders[i] = this.orders[i]; 
      // ^ get all the old orders and put in the updated array
      // ^ (copy all the old orders and put in the new box)
    } 
    // at this point, the new array contains all the old orders only
    newOrders[newOrders.length-1] = order; // add the new order, 1 order only (place new order to the new box)
    this.orders = newOrders; // return (update orders in customer account)
  } 

  public int orderSize(){
    return this.orders.length;
  }

  public long getId() {
    return this.id;
  }
  public Order[] getOrders() {
    return this.orders;
  }

  public static void main(String[] args){
    //Order[] orders = new Order[3];
    //orders[0] = new Order();
    //orders[1] = new Order();
    //orders[2] = new Order();
    //Customer c1 = new Customer(0000001);
    // Customer c1 = new Customer(0000001, new Order[]{});
    //System.out.println(c1.getId());
    //System.out.println(c1.getOrders());

    Customer c1 = new Customer(1L); // create a new customer object 
    //
    Order o1 = new Order(1L); // basket: not yet placed
    o1.addItem(new Item("ABC", 5.4, 5));
    o1.addItem(new Item("DEF", 1.3, 3));
    c1.placeOrder(o1); //place order here
    //
    Order o2 = new Order(2L);
    o2.addItem(new Item("GHI", 2.3, 2));
    o2.addItem(new Item("JKL", 4.5, 4));
    o2.addItem(new Item("MNO", 6.7, 6));
    c1.placeOrder(o2);
    //
    Order o3 = new Order(3L);
    o3.addItem(new Item("PQR", 8.9, 8));
    o3.addItem(new Item("STU", 0.1, 18));
    c1.placeOrder(o3);

    o3 = o2; //! o3 is redirected to o2; cannot get the original o3 details
    //
    Order o4 = new Order(4L);
    o4.addItem(new Item("AAAAPPLLLEEE", 300.0, 400));
    c1.placeOrder(o4);
    //
    System.out.println(c1.getId());
    System.out.println(c1.getTotalOrderAmount(1L));
    System.out.println(c1.getTotalOrderAmount(2L));
    System.out.println(c1.getTotalOrderAmount(4L));
    System.out.println(c1.getTotalOrderAmount(3L));
    System.out.println(c1.orderSize());//3
    System.out.println(c1.isVIP());
    
    
    double output1 = c1.getOrders()[0].getItems()[1].getQuantity();
    // Customer C1 -> order 1 -> item 2 -> get quantity
    double output2 = c1.getOrders()[0].getItems()[1].getPrice();
    // Customer C1 -> order 1 -> item 2 -> get price
    double output3 = c1.getOrders()[0].totalAmount();
    
    System.out.println(output1);
    System.out.println(output2);
    System.out.println(output3);

    }

}

