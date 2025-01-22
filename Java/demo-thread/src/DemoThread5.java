import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DemoThread5 {
  private Map<Integer, String> map;

  public DemoThread5(){
    // HashMap: deadlock may occur
    // can use HashTable / ConcurrentHashMap 
    this.map = new Hashtable<>();
    // this.map = new ConcurrentHashMap<>();
    // this.map = Collections.synchronizedMap(new HashMap<>());
  }

  public Map<Integer, String> getMap(){
    return this.map;
  }

  public void put(Integer key, String value){
    this.map.put(key, value);
  }

  public static void main(String[] args) {
      //put(int key, String value)
    DemoThread5 central = new DemoThread5();
    Runnable putTask1 = () -> {
      for (int i = 0; i < 1000000; i++){
        central.put(i, "abc");
      }
    };
    Runnable putTask2 = () -> {
      for (int i = 0; i < 2000000; i++){
        central.put(i, "abc");
      }
    };
    // For map -> same input -> return 1 output
    // total 300000 inputs -> 200000-300000 outputs
    //! HashTable or synchronize -> return 200000 outputs

    Thread workerB = new Thread(putTask1);
    workerB.start();

    Thread workerC = new Thread(putTask2);
    workerC.start();

    try{
        workerB.join();
        workerC.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(central.getMap().size());

  }
  
}
