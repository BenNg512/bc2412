public class Drawing {
  public static void main(String[] args){
    for (int i = 0; i < 8; i++){
        for (int k = 0; k < 8; k++){
          for (int l = 0; l < 1; l++){
          System.out.print("      "); //print before k
          }
          if(k == 0){
            System.out.print(" *");
          } else if (k == 1){
            System.out.print("    *");
          } else if (k == 2){
            System.out.print("       *");
          } else if (k == 3){
            System.out.print("         *");
          } else if (k == 4){
            System.out.print("         *");
          } else if (k == 5){
            System.out.print("        *");
          } else if (k == 6){
            System.out.print("      *");
          } else if (k == 7){
            System.out.print("   *");
          } 
          System.out.println("");
      }
    }
    System.out.println("------------------------------ END of 1st ");
    // New
    int row = 10;
    int column = 20;

    for (int i = 0; i < row; i++){
      for (int j = 0; j < column; j++){
        if ( j-i > column / 2 || j+i < column / 2 ){
        System.out.print(" ");
      } else {
        System.out.print("*");
      }
      }
      System.out.println("");
    }
    System.out.println("------------------------------ END of 2nd");
    // new
    int row2 = 10;
    int column2 = 10;
    for (int i = 0; i < row2; i++){
      for (int j = 0; j < column2; j++){
        if ( i >= j){
        System.out.print("*");
      } else {
        System.out.print(" ");
      }
      }
      System.out.println("");
    }
    System.out.println("------------------------------ END of 3rd");
    // new
    for (int i = 0; i < row2; i++){
      for (int j = 0; j < column2; j++){
        if ( j + 1 >= column2 - i){
        System.out.print("*");
      } else {
        System.out.print(" ");
      }
      }
      System.out.println("");
    }
    System.out.println("------------------------------ END of 4rd");
    // new
    for (int i = 0; i < row2; i++){
      for (int j = 0; j < column2; j++){
        if ( i > j){
        System.out.print(" ");
      } else {
        System.out.print("* ");
      }
      }
      System.out.println("");
    }
    System.out.println("------------------------------ END of 5th");
    // new
    for (int i = 0; i < row2; i++){
      for (int j = 0; j < column2; j++){
        if ( i == column2/2 ||  j == row2 / 2){
        System.out.print("* ");
      } else {
        System.out.print(" ");
      }
      }
      System.out.println("");
    }
    System.out.println("------------------------------ END of 6th");

  }
}
