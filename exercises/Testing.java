import java.util.Arrays;

public class Testing {
  public static void main(String[] args) {
    int[] nums = {8,10,4,5,0,8,1,3,2,6,4,9,7};
        int[] digits = new int[11];
        int[] count = new int[11];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = i;
            count[i] = 0;
            for (int j = 0; j < nums.length; j++) {
              if (digits[i] == nums[j]) {
                count[i]++;
            }
          }
          System.out.println(digits[i] + count[i]);
        }
        int[] output = new int[count.length];
        int idx = 0;
        for (int i = 0; i < digits.length; i++) {
          if (count[i] > 0) {
            output[idx] = digits[i];
            idx++;
            }
          }
        output = Arrays.copyOf(digits, idx);
        System.out.println(Arrays.toString(output));


  }
}
