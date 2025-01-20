import java.util.ArrayList;

public class DemoThread4 {
  private ArrayList<Integer> arr = new ArrayList<>();

  public void addInteger(int newInt) {
    arr.add(newInt);
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
  
    System.out.println(integers.arr.toString());
  
  }
}
