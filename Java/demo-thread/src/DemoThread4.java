import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class DemoThread4 {
  private Vector<Integer> arr;// non thread-safe

  public DemoThread4(){
    // this.arr = new Vector<>();
    this.arr = new Stack<>();
  }

  // public synchronized boolean add(Integer integer){
  public boolean add(Integer integer){
    return this.arr.add(integer);
  }

  public void addInteger(int newInt) {
    arr.add(newInt);
  }

  public int size(){
    return this.arr.size();
  }

  public static void main(String[] args) {
    DemoThread4 integers = new DemoThread4();
  Runnable addInt = () -> {
    for(int i = 0; i < 10; i++){
    integers.addInteger(i);
    }
  };

  Thread workerB = new Thread(addInt);
    workerB.start();

  Thread workerC = new Thread(addInt);
    workerC.start();
    System.out.println(integers.arr.size());
    System.out.println(integers.arr.size());

    try{
      workerB.join();
      workerC.join();
    } catch(InterruptedException e){
    };
    System.out.println(integers.arr.size());
    System.out.println(integers.arr.size());
  
  
  }
}
