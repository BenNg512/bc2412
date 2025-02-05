package com.bootcamp.junit;


public class OrderService {
  private PaymentService paymentService;
  private InventoryService inventoryService;

  // Dependency Injection (Spring)
  public OrderService(PaymentService paymentService, 
                      InventoryService inventoryService) {
    this.paymentService = paymentService;
    this.inventoryService = inventoryService;
  }

  public boolean order() {
    if (this.inventoryService.checkAvailableStock() <= 0)
      throw new IllegalStateException("Out of stock");
      return this.paymentService.pay() 
      && this.inventoryService.deductStock();
    }
  
  public void main(String[] args) {
    PaymentService ps = new PaymentService();
    InventoryService is = new InventoryService();
    OrderService os = new OrderService(ps, is);
    os.order();
  }
}
