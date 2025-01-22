import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class DemoQueue {
  public static void main(String[] args) {
    // FIFO
    // Queue (parent) -> LinkedList (child)
    Queue<String> strings = new LinkedList<>(); // remove() last element of LinkedList is blocked
    strings.add("Oscar"); // addLast
    strings.add("Lucas"); // addLast
    strings.add("Vincent"); // addLast
    System.out.println(strings); // [Oscar, Jenny, Vincent]
    System.out.println(strings.peek()); // check the head element: Oscar
    
    //! remove() is similar  poll() ; poll() return null if empty, remove() may throw exception
    System.out.println(strings.poll()); // Head: return 1st element: Oscar & remove it
    System.out.println(strings); // [Jenny, Vincent]

    // strings.removeLast(); is blocked but can call if force cast to LinkedList 
    System.out.println(strings.contains("Lucas"));

    strings.offer("Jenny");

    Queue<String> qq = new ArrayBlockingQueue<>(3); // set qq.length (max 3 elements)
    System.out.println(qq.offer("ABC")); // true
    System.out.println(qq.offer("DEF")); // true
    System.out.println(qq.offer("IJK")); // true
    System.out.println(qq.offer("XYZ")); // false, this queue is full

    for (String s : strings) {
      System.out.println(s);
    }

    System.out.println(strings.addAll(strings));

  }  
}
