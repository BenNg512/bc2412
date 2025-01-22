public class Node {
  private Node node; // the next address
  private int value;
  public Node next;
  
  public Node() {

  }
  public Node(Node node, int value) {
    this.node = node;
    this.value = value;
  }
  public Node(Node node) {
    this.node = node;
  }
  public Node(int value) {
    this.value = value;
  }
  //
  public int getValue() {
    return this.value;
  }
  public Node getNode() {
    return this.node;
  }

  // set next node to the current node
  public void setNode(Node node) {
    this.node = node;
  }
  public void setValue(int value) {
    this.value = value;
  }

  public Node next(){
    return this.node;
  }

  public static void main(String[] args) {
    // 3 new -> 3 new objects
  //  Node head = new Node(new Node(new Node(null))); store the 1st Node address only
  Node head = new Node(40);
  Node node2 = new Node(50);
  head.setNode(node2);
  Node node3 = new Node(60);
  node2.setNode(node3);
  node3.setNode(new Node(70)); // lost Node(70) address

  Node temp = head;
  while (temp != null) { // exit when temp is null
    System.out.println(temp.value);
    temp = temp.next(); // node 3 next -> null (this part is similar i++ in array)
  }
  // Array: memory is continuous : 40 is next to 50, 50 is next to 60, 60 is next to 70

  // LinkedList: memory is not continuous : 40 is at 329816492, 50 is at 32916, 60 is at 3463916 
  
  // Array VS LinkedList


  }
}
