import java.math.BigDecimal;
import java.math.RoundingMode;

public class LoanCalculator {
  private double principle;
  private double annualInterestRate;
  private int numberOfYears;
  
  public LoanCalculator(double principle, double annualInterestRate, int numberOfYears) {
    this.principle = principle;
    this.annualInterestRate = annualInterestRate;
    this.numberOfYears = numberOfYears;
}
  public double totalInterestAfterYears() {// compound interest
    // principle * ((1 + annualInterestRate)^numberOfYears - 1)
    return BigDecimal.valueOf(this.principle)
    .multiply(BigDecimal.valueOf(Math.pow(1 + this.annualInterestRate, this.numberOfYears)))
    .subtract(BigDecimal.valueOf(this.principle))
    .setScale(2, RoundingMode.HALF_UP)
    .doubleValue();

  }

  public static void main (String[] args) {
    LoanCalculator loan1 = new LoanCalculator(10000, 0.05, 1);
    LoanCalculator loan2 = new LoanCalculator(10000, 0.05, 2);
    LoanCalculator loan3 = new LoanCalculator(10000, 0.05, 10);
    
    //! this one will not be stored, but can also call method
    new LoanCalculator(10000, 0.05, 2).totalInterestAfterYears(); 
    
    //! obsoleted object after created
    new LoanCalculator(10000, 0.05, 2); 

    System.out.println(loan1.totalInterestAfterYears());
    System.out.println(loan2.totalInterestAfterYears());
    System.out.println(loan3.totalInterestAfterYears());
    System.out.println(new LoanCalculator(10000, 0.05, 2).totalInterestAfterYears());



  }
}