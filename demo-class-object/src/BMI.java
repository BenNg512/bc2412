import java.math.BigDecimal;
import java.math.RoundingMode;

public class BMI {
  String name;
  double height;
  double weight;
  
  BMI(String name, double height, double weight){
    this.name = name;
    this.height = height;
    this.weight = weight;
  }
  String getName(){
    return this.name;
  }
  double getHeight(){
    return this.height;
  }
  double getWeight(){
    return this.weight;
  }
  public double bmi(){
    return BigDecimal.valueOf(this.weight)
    //! setScale(2, RoundingMode.HALF_DOWN) while dividing
    .divide(BigDecimal.valueOf(Math.pow(this.height,2.0)), 2, RoundingMode.HALF_UP)
    .doubleValue();

    //.divide(BigDecimal.valueOf(this.height).multiply(BigDecimal.valueOf(this.height)))
    //.setScale(2, RoundingMode.HALF_UP)
    //.doubleValue();
  }

  // instance method
  // able to call object & instance method
  public String bmiStatus(){
    double bmi = this.bmi();
    if (bmi < 18.5){
      return "Underweight";
    } else if (bmi < 25){
      return "Normal";
    } else if (bmi < 30){
      return "Overweight";
    } else {
      return "Obese";
    }
  }

  // Static method: user import 
  public static double bmi(double weight, double height){
  //! the method name can be the "bmi" since static method != instance method
    return BigDecimal.valueOf(weight)
    .divide(BigDecimal.valueOf(Math.pow(height,2.0)), 2, RoundingMode.HALF_UP)
    .doubleValue();
  }



  public void setName(String name){
    this.name = name;
  }
  public void setHeight(double height){
    this.height = height;
  }
  public void setWeight(double weight){
    this.weight = weight;
  }

  public static void main(String[] args){
    BMI p1 = new BMI("Ben", 1.81, 72.55555);
    BMI p2 = new BMI("John", 1.71, 70.0);
    BMI p3 = new BMI("Fat Boy", 1.60, 180.4);

    BMI[] people = new BMI[]{p1, p2, p3};

    for (BMI p : people){

      System.out.println(
        "Name: " + p.getName() + ", " + 
        "Height: " + p.getHeight() + ", " +
        "Weight: " + p.getWeight() + ", " +
        "BMI: " + p.bmi() + ", " +
        "BMI Status: "+ p.bmiStatus()
      );
    }

  }

  
  
}
