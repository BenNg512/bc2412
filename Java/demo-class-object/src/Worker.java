public class Worker {
  private static int workerCount = 0; //! static variable
  private Supermarket supermarket;
  
  public Worker(Supermarket supermarket){
      this.supermarket = supermarket;
      Worker.workerCount++;
  }
  // if read private static variable, must use static keyword
  public static int getWorkerCount(){
    return Worker.workerCount;
  }

  public void moveIn(int quantity){
    supermarket.setAvailavleStock(supermarket.getAvailableStock() + quantity);
  }

  public void moveOut(int quantity){
    supermarket.setAvailavleStock(supermarket.getAvailableStock() - quantity);
  }
}
