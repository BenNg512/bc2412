import java.util.Scanner;
// Java Project (load build-in tools, String, Primitives)
// proactively import non-build-in tools (eg Scanner)

public class DemoScanner {
  public static void main(String[] args){
    String s = "abc";
    Scanner scanner = new Scanner (System.in);
    //System.out.println("Please input a number");
    //int num = scanner.nextInt();
    // num = num *2;
    //System.out.println("num = " + num); //String + string = string

    //scanner.nextLine();

    //System.out.println("Please input a string");
    //String str = scanner.nextLine();
    //System.out.println("str = " + str);

    // for (int i = 0; i < num; i++){ //! input counter i
    //  if (num >= i + 1){
    //    int rank = i + 1;
    //    System.out.println(str +" "+ rank);
    //  }
    // }
    // num -> num of days
    // for loop
    System.out.println("Please input day number");
    in days = scanner.nextInt();
    double totalHours = 0;
    double totalMins = 0;
    for (int i = 0; i < days; i++){
      totalHours = totalHours + 24;
      totalMins = totalMins + 1440;
    }
    System.out.println("Total hrs: " + totalHours);
    System.out.println("Total mins: " + totalMins);

  }
  
}
