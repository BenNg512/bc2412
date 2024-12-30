public class Supermarket {
  private int availableStock;
  private Worker[] workers;

  public Supermarket(int availableStock) {
    this.availableStock = availableStock;
  }
  
  public int getAvailableStock() {
    return this.availableStock;
  }

  public void moveIn(int numOfStock) {
    availableStock += numOfStock;
  }
  public void moveOut(int numOfStock) {
    availableStock -= numOfStock;
  }

  public static void move(Supermarket from, Supermarket to, Worker worker, int numOfStock, boolean isMoveIn) {
    
  }
  public static void main(String[] args) {
    Supermarket s1 = new Supermarket(0);
    s1.moveIn(10);
    s1.moveIn(13);
    s1.moveOut(4);

    Worker worker1 = new Worker(s1);
    Worker worker2 = new Worker(s1);
    worker1.moveIn(30);
    worker2.moveOut(4);
    System.out.println(Worker.getWorkerCount());

  }

  public void setAvailavleStock(int i) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setAvailavleStock'");
  }
}
