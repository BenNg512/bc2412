import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Testing {
  public static void main(String[] args){
    int[][] rectangles = {
      {4, 8},
      {3, 6},
      {10, 20},
      {15, 30},
    };
    double[] ratios = new double[rectangles.length];
        Map<Double, Integer> ratioCount = new HashMap<>();
        int count = 0;
        for (int[] rectangle : rectangles) {
            double ratio = (double) rectangle[0] / rectangle[1];
            ratioCount.put(ratio, ratioCount.getOrDefault(ratio, 0) + 1);
        }

        for (int c : ratioCount.values()) {
            if (c > 1) {
                count += (long) c * (c - 1) / 2;
          }
        }
    System.out.println(count);
  }
}
