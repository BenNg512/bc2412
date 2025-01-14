import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
  public static void main(String[] args) {
    LinkedList<String> strings = new LinkedList<>();
    strings.add("ABC"); // add() belongs to Collection Family
    strings.add("IJK");
    strings.add("ABC");
    
    System.out.println(strings.size()); // 3
    System.out.println(strings);
    strings.remove(0); // can input index
    System.out.println(strings.size()); // 2
    System.out.println(strings);
    strings.remove("ABC");
    System.out.println(strings.size()); // 1
    System.out.println(strings);
    strings.add("Oscar");
    strings.add("Jenny");
    strings.remove(); // remove the 1st element
    System.out.println(strings.size());
    System.out.println(strings);
    System.out.println(strings.contains("Jenny")); // true
    System.out.println(strings.contains("Vincent")); // false

    // contains(), add(), remove(), size() etc are common methods for ArrayList and LinkedList
    
    System.out.println(strings.isEmpty());
    strings.clear();
    System.out.println(strings.size());

    // LinkedList advantage: store these data : head, this.object, tail
    // add/remove at the head/tail


    // ArrayList advantage: point the object directly if you know the position
    // Find Person.class(name)

    // Polymorphism
    // List<Integer> numbers = new ArrayList<>();
    //! Array
    List<Integer> ss = new LinkedList<>();
    System.out.println();
    ss.add(100);
    ss.add(1000);
    // ss.remove(); // Nok OK, List Interface does not have this method
    
    // because of Interface List, ss object can invoke add(), remove(), size() at compile time
    // during runtime, we would find that object is LinkedList, the add() method will be the LinkedList version
    
    LinkedList<Integer> ss2 = (LinkedList<Integer>) ss; //! force casting ss List to LinkedList
    ss2.remove(); // remove head
    System.out.println(ss2.contains(100));
    System.out.println(ss2.contains(1000));
    System.out.println();

    //List<Animal> animals = new LinkedList<>();
    //animals.add(new Panda());
    //animals.add(new Tiger());
    //for (Animal animal : animals) {
    //  System.out.println(animal.run());
    //}

    //List<Weapon> weapons = new LinkedList<>();
    //weapons.add(new Sword());
    //weapons.add(new Bow());

  }  
}
