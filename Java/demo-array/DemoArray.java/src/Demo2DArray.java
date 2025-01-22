import java.util.Arrays;

public class Demo2DArray {
  public static void main(String[] args){
    int arr[] = new int[] {1,2,3};
      for (int i = 0; i < arr.length; i++){
        System.out.println(arr[i]);
      } 
      System.out.println(Arrays.toString(arr));
      String breakLine = "-----------------------------------";
      System.out.println(breakLine);
      //
      // excel (row x column);
      int[] [] arr2d = new int[2][3]; // 2 rows and 3 columns
      // row 0, 1
      // column 0, 1, 2
      arr2d[0][0] = 1;
      arr2d[0][1] = 100;
      arr2d[0][2] = 3;
      // arr2d[1][0] = 99; // zero if not defined
      arr2d[1][1] = 5;
      arr2d[1][2] = 8;
      System.out.println(arr2d[1][0]);
      System.out.println(breakLine);
      //
      for (int i = 0; i < arr2d.length; i++){ // row 
        for (int j = 0; j < arr2d[i].length; j++){ // column
          System.out.print(arr2d[i][j] + ", ");
        }System.out.println();
      }
      System.out.println(breakLine);
      //
      int [] [] arr2d2 = new int[] [] {{100, 0, 0}, {0, 0, 100}};
      System.out.println(Arrays.deepToString(arr2d2));
      System.out.println(breakLine);
      //
      int [] [] arr2d3 = new int[] [] {{100, 7, 9}, {101, -9, 100}};
      // Find the max number in each row, and put it into a new array
      // int rowLength = arr2d3[1].length; // 3
      int[] rowMaxs = new int[arr2d3.length];
      int idx       = 0;
      int max       = Integer.MIN_VALUE;

      for (int i = 0; i < arr2d3.length; i++){ // row 
        max = Integer.MIN_VALUE;
        for (int j = 1; j < arr2d3[i].length-1; j++){ // column
          
        if (arr2d3[i][j] > max){
          arr2d3[i][j] = max;
          System.out.println(arr2d3[i][j]);
        }
      }//System.out.println(Arrays.deepToString(rowMaxs));
      }
      //
      int[][] accounts = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
      //
      int[] sum = new int[accounts.length];
      int max2 = Integer.MIN_VALUE;
      for (int i = 0; i < accounts.length; i++){
          for (int j = 0; j < accounts[i].length; j++){
              sum[i] += accounts[i][j];
          }
          if (sum[i] > max2){
            max2 = sum[i];
          }
      }
      System.out.println(max2);


  }
}
