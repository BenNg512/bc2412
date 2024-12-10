public class Exercise20241210 {
  public static void main(String[] args ){
    double priceForApple = 7.3;
    double priceForOrange = 6.5;
    int quantityOfApple = 3;
    int quantityOfOrange = 4;

    // int * double is double
    double totalAmount = priceForApple * quantityOfApple + priceForOrange * quantityOfOrange;
    System.out.println(totalAmount);

    int mathScore = 73;
    int englishScore = 60;
    int historyScore = 61;

    // change average number to double
    // output is double
    double averageScore = (mathScore + englishScore + historyScore) / 3.0;  
    System.out.println(averageScore);//64.66
  }
}
