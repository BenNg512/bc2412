public class ArrayList1<T> {
  private T[] values;
  
  public ArrayList1() {
    this.values = (T[]) new Object[0];
  }

  public void add(T value) {
    T[] newValues = (T[]) new Object[this.values.length + 1];
    for (int i = 0; i < this.values.length; i++) {
      newValues[i] = this.values[i];
    }
    newValues[this.values.length] = value;
    this.values = newValues;
  }

  public int size() {
    return this.values.length;
  }

  public static void main(String[] args) {
    ArrayList1<String> books = new ArrayList1<>();
    books.add("ABC");
    books.add("IJK");
    books.size(); // 2
  }
}
