public enum Currency {
  // Scenario for enum
  // 1. finite number of values: Days of the week, Month, Countries, Currencies
  // 2. not expected to update very often
  HKD("Hong Kong Dollar"),
  USD("US Dollar"),
  JPY("Japanese Yen"),
  CNY("Chinese Yuan"),
  ;

  private final String description; //! private constructor for enum
  Currency(String description) {
    this.description = description;
  }

  public String getDesc() {
    return this.description;
  }

  public int getValue(){ // return position from 0
    return this.ordinal();
  }

  public static String getDescription(Currency currency) {
    if (currency == Currency.HKD) {
      return "Hong Kong Dollar";
    } else if (currency == Currency.USD) {
      return "US Dollar";
    } else if (currency == Currency.JPY) {
      return "Japanese Yen";
    } else if (currency == Currency.CNY) {
      return "Chinese Yuan";
    } else {
      return "";
    }
  }
    //switch (currency) {
    //  case HKD:
    //    return "Hong Kong Dollar";
    //  case USD:
    //    return "US Dollar";
    //  case JPY:
    //    return "Japanese Yen";
    //  case CNY:
    //    return "Chinese Yuan";
    //  default:
    //    return null;
    public static void main(String[] args) {
      System.out.println(Currency.getDescription(Currency.HKD));
      System.out.println(Currency.HKD.getDesc());
      System.out.println(HKD.getDesc());
      System.out.println(Currency.HKD.getValue());
      System.out.println(HKD.getValue());
    }

}
