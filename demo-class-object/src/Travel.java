public class Travel {
  
  private String country;
  private String region;
  private int avgExpense;
  private boolean visaRequired;

  public Travel(String country, String region, int avgExpense, boolean visaRequired) {
    this.country = country;
    this.region = region;
    this.avgExpense = avgExpense;
    this.visaRequired = visaRequired;
  }
  // Getters
  public String getCountry(){
    return this.country;
  }
  public String getRegion(){
    return this.region;
  }
  public int getAvgExpense(){
    return this.avgExpense;
  }
  public boolean isExpensive(){
    return this.avgExpense > 15000 ? true : false;
  }


  public boolean getVisaRequired(){
    return this.visaRequired;
  }
  // Setters
  public void setCountry(String country){
    this.country = country;
  }
  public void setRegion(String region){
    this.region = region;
  }
  public void setAvgExpense(int avgExpense){
    this.avgExpense = avgExpense;
  }
  public void setVisaRequired(boolean visaRequired){
    this.visaRequired = visaRequired;
  }

  public static void main(String[] args){
    
    Travel Japan = new Travel("Japan", "Asia", 20000, false);
    Travel Thailand = new Travel("Thailand", "Asia", 5000, false);
    Travel Australia = new Travel("Australia", "Oceania", 20000, true);
    Travel USA = new Travel("U.S.A", "North America", 30000, true);

  Travel[] countries = new Travel[] {Japan, Thailand, Australia, USA};

  for (Travel country : countries){
    System.out.println(
    "Country: "       + country.getCountry() + ", " +
    "Region: "        + country.getRegion() + ", " +
    "Avg Exp(HKD): "  + country.getAvgExpense() + ", " +
    "Expensive: "     + country.isExpensive() + ", " +
    "VISA required: " + country.getVisaRequired());
  }



}
}
