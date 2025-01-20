import java.util.LinkedList;

public class MyStack<T> {
  public MyStack(){
    this.linkedList = new LinkedList<>();
  }

  public T pop(){
    return this.linkedList.removeLast();
  }
  private LinkedList<T> linkedList;

  public void push(T data){
    this.linkedList.addLast(data);
  }

  public static void main(String[] args) {
    MyStack<String> myStack = new MyStack<>();
    myStack.push("ABC");
    myStack.push("CDE");
    System.out.println(myStack.pop());
  }


  
}
