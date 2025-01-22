public class DemoThread3 {
  private String x = "";
  public String getX(){
    return this.x;
  }
  public synchronized void addA(){
    this.x += "A";
  }

  public static void main(String[] args) {
    DemoThread3 central = new DemoThread3();
    Runnable concatA = () -> {
      for (int i = 0; i < 100000; i++){
        central.addA();
      }
    };

    Thread workerB = new Thread(concatA);
    workerB.start();
    Thread workerC = new Thread(concatA);
    workerC.start();
    System.out.println(central.getX().length());

    try{
      // if B and C reach here at the same time, only one can run at a time
      workerB.join();
      workerC.join();
    }catch(InterruptedException e){
      //e.printStackTrace();
    };

    System.out.println(central.getX().length());
  
  }
}
