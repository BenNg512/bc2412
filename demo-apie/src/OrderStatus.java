public enum OrderStatus {
  PAID(1),
  SHIPPED(2),
  DELIVERING(3),
  DELIVERED(4),
  ;

  private final int value;

  OrderStatus(int value) {
    this.value = value;
  }

  public OrderStatus next() {
    for (OrderStatus status : values()) {
      if (status.value == this.value + 1) {
        return status;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    System.out.println(OrderStatus.PAID.next());
    System.out.println(OrderStatus.PAID.next());
    System.out.println(OrderStatus.DELIVERED.next());
  }
}
