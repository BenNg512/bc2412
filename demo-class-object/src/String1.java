public class String1 {
  private char[] arr; // use int[] or char[]

  public String1(String str){
    //this.arr = str.toCharArray();
    this.arr = new char[str.length()];
    for (int i = 0; i < str.length(); i++){
      this.arr[i] = str.charAt(i);
    }
  }
  // 
  public char charAt(int index){
    return arr[index];
  }
  public int length(){
    return arr.length;
  }
  public boolean startsWith(char c){
    return arr[0] == c? true : false;
  }
  public boolean endsWith(char c){
    return arr[arr.length-1] == c? true : false;
  }
  //
  public void setCharAt(int index, char c){
    char[] newArr = new char[arr.length];
    for (int i = 0; i < arr.length; i++){
      if (i == index){
        arr[i] = c;
      }
    }
    // this.arr[] = newArr[arr.length];
  }
  public String replaceChar(char x, char y){
    char[] newArr = new char[arr.length];
    for (int i = 0; i < arr.length; i++){
      if (arr[i] != x){
        newArr[i] = arr[i];
      } else {
        newArr[i] = y;
      }
    }
    this.arr = newArr;
    return newArr.toString();
  } 

  public static void main(String[] arg){
    String1 str = new String1("abc");
    System.out.println(str.charAt(1)); // b
    System.out.println(str.length()); // 3
    System.out.println(str.startsWith('a')); // T
    System.out.println(str.endsWith('c')); // T
    // System.out.println(str.setCharAt(1, 'c'));
  }

}
