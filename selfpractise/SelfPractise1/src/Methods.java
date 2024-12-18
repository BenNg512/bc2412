import java.lang.reflect.Method;

public class Methods {
  public int scoreOfString(String s) {
    int sum = 0;
    int value = 0;
      for (int i = 0; i < s.length() - 1; i++){
        value = s.charAt(i) - s.charAt(i+1);
        value = value < 0 ? value * -1 : value;
        sum += value;
        // if (s.charAt(i) > s.charAt(i+1)){
        //   sum += s.charAt(i) - s.charAt(i+1);
        // } else {
        //   sum += s.charAt(i+1) - s.charAt(i);
        // };
      }
    return sum;    
    }
    
    public static void main(String[] args){
      Methods methods = new Methods(); // Create an instance of Methods
      System.out.println("abc");
      System.out.println(methods.scoreOfString("ace"));
    }
}
