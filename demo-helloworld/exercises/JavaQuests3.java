import java.util.Scanner;
public class JavaQuests3 {
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
    if (month == 1){
      monthOfName = "January";  
    } else if (month == 2){
      monthOfName = "February";
    } else if (month == 3){
      monthOfName = "March";
    } else if (month == 4){
      monthOfName = "April";
    } else if (month == 5){
      monthOfName = "May";
    } else if (month == 6){
      monthOfName = "June";
    } else if (month == 7){
      monthOfName = "July";
    } else if (month == 8){
      monthOfName = "August";
    } else if (month == 9){
      monthOfName = "September";
    } else if (month == 10){
      monthOfName = "October";
    } else if (month == 11){
      monthOfName = "November";
    } else if (month == 12){
      monthOfName = "December";
    } else 
      monthOfName = "Error";
    System.out.print("Input a year: ");
    int year = input.nextInt(); // > 0

    // The February has 29 days: (Every 4 years and the year cannot divded by
    // 100) or The year can divided by 400
    // otherwise the February should have 28 days only
    if (month == 2 && year % 4 == 0 && year % 100 > 0 || year % 400 == 0 ){
      numberOfDaysInMonth = 29;
    } else if (month == 1){
      numberOfDaysInMonth = 31;
    } else if (month == 2){
      numberOfDaysInMonth = 28;
    } else if (month == 3){
      numberOfDaysInMonth = 31;
    } else if (month == 4){
      numberOfDaysInMonth = 30;
    } else if (month == 5){
      numberOfDaysInMonth = 31;
    } else if (month == 6){
      numberOfDaysInMonth = 30;
    } else if (month == 7){
      numberOfDaysInMonth = 31;
    } else if (month == 8){
      numberOfDaysInMonth = 31;
    } else if (month == 9){
      numberOfDaysInMonth = 30;
    } else if (month == 10){
      numberOfDaysInMonth = 31;
    } else if (month == 11){
      numberOfDaysInMonth = 30;
    } else if (month == 12){
      numberOfDaysInMonth = 31;
    } else {
      numberOfDaysInMonth = 0;
    }

    if (month > 0 && month < 13 ){
    System.out.println(monthOfName + " " + year + " has " + numberOfDaysInMonth + " days");
  } else {
    System.out.println("month is not a valid month number");
  }
}
}