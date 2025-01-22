public class DemoString2 {
  public static void main(String[] args){
    String name = "Ben";
    String x = "LOL";
    String y ="Eat Sleep Play Recycle";
    int age = 29;
    int height = 181;
    double salary = 4000;
    char gender = 'M';
    //----------End of raw data-------------
    System.out.println("Name: " + name);
    char nameLastChar = name.charAt(name.length()-1);
    System.out.println("nameLastChar = " + nameLastChar);
    // gender
    boolean isMale = gender == 'M';
    System.out.println("Is Male?:" + isMale);
    // rich or poor
    if (salary > 300_000) {
      System.out.println("Ben is rich");
    } else if (salary > 30000){
      System.out.println("Ben's salary is ok la");
    } else {
      System.out.println("Poor Ben");
    }
    // 6" tall
    boolean height6Inch = (height >= 183.0);//false
    System.out.println("Ben is 6 feet tall? : " + height6Inch);



  }
}
