package com.bootcamp.junit;

public class InventoryService {
  private static InventoryService uniqueInstance = new InventoryService();

  private int stockCount;

  private InventoryService(){

  }

  public static int getInventoryStockCount(){
    return uniqueInstance.getStockCount();
  }
  public int getStockCount(){
    return this.stockCount;
  }
  public int checkAvailableStock(){
    return -1;
  }
  public boolean deductStock(){
    this.stockCount -= 1;
    return false;
  }

  public static void main(String[] args) {
    System.out.println(getInventoryStockCount());
  }
}
