package com.bootcamp.junit;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;


//! Mockito  
@ExtendWith(MockitoExtension.class)
public class OrderServiceTest {
  //! Mock is independent if put inside each test case
  @Mock
  PaymentService paymentService;
  @Mock
  InventoryService inventoryService;

  @Test 
  void testOrder_whenStockCountIsNotZero(){
    //! for this scenario, how do we perform the test
    // Mock the conditions, then perform the test
    // Order service -> InventoryService -> PaymentService
    Mockito.when(inventoryService.checkAvailableStock()).thenReturn(10);
    Mockito.when(inventoryService.deductStock()).thenReturn(true);
    Mockito.when(paymentService.pay()).thenReturn(true);

    OrderService os = 
        new OrderService(this.paymentService, this.inventoryService); // use the mock data here
    boolean orderResult = os.order();
    assertEquals(true, orderResult);

    //! Expected to pass all processes
    verify(this.inventoryService, times(1)).checkAvailableStock();
    verify(this.inventoryService, times(1)).deductStock();
    verify(this.paymentService, times(1)).pay();

    assertDoesNotThrow(() -> os.order());
  }

  // assertThrow
  @Test
  void testOrder_whenStockCountIsZero() {
    Mockito.when(inventoryService.checkAvailableStock()).thenReturn(0);
    //Mockito.when(inventoryService.deductStock()).thenReturn(true);
    //Mockito.when(paymentService.pay()).thenReturn(true);
    
      OrderService os = 
        new OrderService(this.paymentService, this.inventoryService); // use the mock data here
    
    //! Expected to fail at checkAvailableStock
    verify(this.inventoryService, times(0)).checkAvailableStock();
    // verify(this.inventoryService, times(9)).deductStock();
    // verify(this.paymentService, times(1)).pay();
    assertThrows(IllegalStateException.class, () -> {os.order();
  });
  }

  @Test
  void testOrder_whenDeductStockIsFalse() {
    Mockito.when(inventoryService.checkAvailableStock()).thenReturn(1);
    Mockito.when(inventoryService.deductStock()).thenReturn(true);
    Mockito.when(paymentService.pay()).thenReturn(false);
    
      OrderService os = 
        new OrderService(this.paymentService, this.inventoryService); // use the mock data here
    
    //! Expected to fail at checkAvailableStock
    verify(this.inventoryService, times(1)).checkAvailableStock();
    verify(this.inventoryService, times(1)).deductStock();
    verify(this.paymentService, times(0)).pay();
    assertThrows(IllegalStateException.class, () -> {os.order();
  });

  }
  
}
