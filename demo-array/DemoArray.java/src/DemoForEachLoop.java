public class DemoForEachLoop {
  public static void main(String[] args) {
    int[] arr = new int[] {3, 4, 5};
    // for loop
    for (int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }
    //! for-each 
    //! run all values, 10000 output -> 10000 lines
    for (int integer : arr){
      System.out.println(integer);
    }

    char[] arr2 = new char[] {'p', 't', 'e'};
    String str = "";
    for (char character : arr2){
      str += character;
      
    }System.out.println(str);
    //
    String[] arr3 = new String[] {"abc", "ijk", "def"};
    String target = "ijk";
    boolean found = false;
    
    for (String string : arr3){
      if (string.equals(target)){
        found = true;
      }
    } 
    System.out.println(found);


}
}
