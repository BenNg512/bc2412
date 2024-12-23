import java.util.Arrays;

public class Testing {
  public static void main(String[] args){
    int[] dataset = new int[] { 2, 7, 11, 15 };
    int target = 18;
    int a = -1;
    int b = -1;
    for (int i = 0; i < dataset.length; i++) {
      for (int j = 0; j < dataset.length; j++) {
        if (dataset[j] + dataset[i] == target) {
          a = j;
          b = i;
          
        }
      }
    }
    int[] output = new int[] {a, b};
    System.out.println(Arrays.toString(output));



  }
}
