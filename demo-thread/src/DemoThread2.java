import java.util.concurrent.atomic.AtomicInteger;

public class DemoThread2 {
  // private int x; // Primitive non-thread-safe
  private AtomicInteger x = new AtomicInteger(0); // AtomicInteger is thread-safe, 
  // need to assign initial value since its an Object, -> int default value is 0

  public int getX(){
    // return this.x;
    return this.x.get();
  }
  public void addOne(){
    //this.x++;
    this.x.incrementAndGet();
  }

  public static void main(String[] args) {
    DemoThread2 place = new DemoThread2();
    // place.addOne();
    // System.out.println(place.getX()); //1

    DemoThread2 central = new DemoThread2();
    Runnable placeAddOneTask = () -> central.addOne();

    Runnable placeAddMillionTask = () -> {
      for(int i = 0; i < 1000000; i++){
        place.addOne();
      }
    };

    Thread workerB = new Thread(placeAddMillionTask);
    workerB.start();

    Thread workerC = new Thread(placeAddMillionTask);
    workerC.start();
    
    try{
      // if B and C reach here at the same time, only one can run at a time
      workerB.join();
      workerC.join();
    }catch(InterruptedException e){
      //e.printStackTrace();
    }

    System.out.println(place.getX());
    System.out.println(central.getX()); // 1000000-2000000
  }
}
