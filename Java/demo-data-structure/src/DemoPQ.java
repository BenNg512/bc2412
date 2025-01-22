import java.util.Comparator;
import java.util.PriorityQueue;

public class DemoPQ {

    public static class Person implements Comparator<Person>{
    private int age;

    public Person(int age){
      this.age = age;
    }
    public int getAge(){
      return this.age;
    }
    @Override
    public int compare(DemoPQ.Person o1, DemoPQ.Person o2) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'compare'");
    }

  }
  

  public static void main(String[] args){
    PriorityQueue<String> pq = new PriorityQueue<>();
    pq.add("Vincent");
    System.out.println(pq);
    pq.add("Oscar");
    System.out.println(pq);
    pq.add("Lucas");
    System.out.println(pq);
    //! add will not make change -> not in order
    // poll: removed by ascending order
    System.out.println(pq.poll()); 
    System.out.println(pq.poll());
    System.out.println(pq.poll());

    // PQ<> x = new PQ<> (sort method())
    // the order of poll() will follow the sort method
    PriorityQueue<Person> pq2 = new PriorityQueue<>(new SortByAge());
    pq2.add(new Person(19));
    pq2.add(new Person(21));
    pq2.add(new Person(9));
    pq2.add(new Person(99));
    pq2.add(new Person(55));
    System.out.println(pq2.poll().getAge());
    System.out.println(pq2.poll().getAge());
    System.out.println(pq2.poll().getAge());
    System.out.println(pq2.poll().getAge());
    System.out.println(pq2.poll().getAge());


  }
  
}
