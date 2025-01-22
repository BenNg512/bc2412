public class LinkedList1 { // a list of integers
  private Node head;

  public LinkedList1() {
  }

  public void add(int value) { // add to tail
    if (this.head == null) { // assign first head if head is null
      this.head = new Node(value);
      return;
    }
    Node first = head;
    while (first.next() != null) {
      first = first.next(); // move to next
    }
    first.setNode(new Node(value));
  }

  public void remove() { //remove head only
    if (this.head == null) {
      return;
    }
    this.head = this.head.next();
  }
  
  public int size(){
    int count = 0;
    Node first = head;
    while (first != null) {
      first = first.next();
      count++;
    }
    return count;
  }

  @Override
  public String toString() {
    String result = "[";
    Node first = head;
    while (first != null) {
      result += first.getValue() + ", ";
      first = first.next();
    }
    return result.substring(0, result.length() - (result.length()>1? 2 : 0)) + "]";
  }

  public static void main(String[] args) {
    LinkedList1 ll = new LinkedList1();
    ll.add(10);
    ll.add(20);
    System.out.println(ll.size());
    System.out.println(ll.toString());
    ll.remove();
    System.out.println(ll.size());
    System.out.println(ll.toString());
    ll.remove();
    System.out.println(ll.size());
    System.out.println(ll.toString());
    

  }
  
}
