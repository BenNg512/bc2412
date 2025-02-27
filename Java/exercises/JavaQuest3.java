import java.util.Scanner;
public class JavaQuest3 {
  /**
   * Expected Output:
   * 
   * Example 1: Input a month number: 2 Input a year: 2016
   * 
   * February 2016 has 29 days
   * 
   * Example 2: Input a month number: 12 Input a year: 2014
   * 
   * December 2014 has 31 days
   */

  // Program the number of days that the month of a year has.

  public static void main(String[] strings) {

    Scanner input = new Scanner(System.in);

    int numberOfDaysInMonth = 0;
    String monthOfName = "Unknown";


    System.out.print("Input a month number: ");
    int month = input.nextInt(); // assume 1 - 12
    //  switch(month){
    //  case 1: monthOfName = "January";
    //  break;
    //  case 2: monthOfName = "February";
    //  break;
    //  case 3: monthOfName = "March";
    //  break;
    //  case 4: monthOfName = "April";
    //  break;
    //  case 5: monthOfName = "May";
    //  break;
    //  case 6: monthOfName = "June";
    //  break;
    //  case 7: monthOfName = "July";
    //  break;
    //  case 8: monthOfName = "August";
    //  break;
    //  case 9: monthOfName = "September";
    //  break;
    //  case 10: monthOfName = "October";
    //  break;
    //  case 11: monthOfName = "November";
    //  break;
    //  case 12: monthOfName = "December";
    //  break;
    //  default: monthOfName = "Month number is error"; 
    //  }

    System.out.print("Input a year: ");
    int year = input.nextInt(); // > 0

    // The February has 29 days: (Every 4 years and the year cannot divded by
    // 100) or The year can divided by 400
    // otherwise the February should have 28 days only
    
    if (month == 1){
      monthOfName = "January";
      numberOfDaysInMonth = 31; 
    } else if (month == 2 && year % 4 == 0 && year % 100 > 0 || year % 400 == 0 ){
      monthOfName = "February";
      numberOfDaysInMonth = 29;
    } else if (month == 2){
      monthOfName = "February";
      numberOfDaysInMonth = 28;
    } else if (month == 3){
      monthOfName = "March";
      numberOfDaysInMonth = 31;
    } else if (month == 4){
      monthOfName = "April";
      numberOfDaysInMonth = 30;
    } else if (month == 5){
      monthOfName = "May";
      numberOfDaysInMonth = 31;
    } else if (month == 6){
      monthOfName = "June";
      numberOfDaysInMonth = 30;
    } else if (month == 7){
      monthOfName = "July";
      numberOfDaysInMonth = 31;
    } else if (month == 8){
      monthOfName = "August";
      numberOfDaysInMonth = 31;
    } else if (month == 9){
      monthOfName = "September";
      numberOfDaysInMonth = 30;
    } else if (month == 10){
      monthOfName = "October";
      numberOfDaysInMonth = 31;
    } else if (month == 11){
      monthOfName = "November";
      numberOfDaysInMonth = 30;
    } else if (month == 12){
      monthOfName = "December";
      numberOfDaysInMonth = 31;
    } else {
      monthOfName = "Inappropriate month number";
      numberOfDaysInMonth = 9999999;
    }

    if (month > 0 && month < 13 ){
    System.out.println(monthOfName + " " + year + " has " + numberOfDaysInMonth + " days");
  } else {
    System.out.println("month is not a valid month number");
  }
}
}