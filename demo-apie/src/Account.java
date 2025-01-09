public abstract class Account {
  private Currency currency;
  private double balance;

  public Account(Currency currency, double balance) {
    this.currency = currency;
    this.balance = balance;
  }

  public static void main(String[] args) {
    System.out.println(Currency.getDescription(Currency.HKD));
  }

  
}
