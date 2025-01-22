import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoDeque {

  public static void main(String[] args) {
    Deque<String> strings = new LinkedList<>();
    strings.add("Lucas"); // addLast
    strings.add("Vincent");
    strings.add("Oscar");
    strings.addFirst("Jenny");

    System.out.println(strings);
    strings.poll();
    strings.pollLast();
    System.out.println(strings);
    System.out.println(strings.peekFirst());
    System.out.println(strings.peekLast());

    Queue<String> ss3 = null;
    int x = 3;
    if( x > 2){
      ss3 = new ArrayDeque<>();
    }else{
      ss3 = new LinkedList<>();
    }

    ss3.poll();

    Deque<String> ss2 = new ArrayDeque<>();
    ss2 = new LinkedList<>();
    

  }
}
