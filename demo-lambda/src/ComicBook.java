public class ComicBook{
  private String name;
  private String author;
  private int year;

  public static Builder builder() {
    return new Builder();
  }
  
  public ComicBook(String name, String author, int year) {
    this.name = name;
    this.author = author;
    this.year = year;
  }
  
  public String getName() {
    return this.name;
  }
  
  public String getAuthor() {
    return this.author;
  }
  
  public int getYear() {
    return this.year;
  }

  public void getDetails(){
    System.out.println("Name: " + this.name);
    System.out.println("Author: " + this.author);
    System.out.println("Year: " + this.year);
  }

  public void setName(String name) {
    this.name = name;
  }
  
  public void setAuthor(String author) {
    this.author = author;
  }
  
  public void setYear(int year) {
    this.year = year;
  }

    public static class Builder{
      private String name;
      private String author;
      private int year;

      public Builder name(String name){
        this.name = name;
        return this;
      }
      public Builder author(String author){
        this.author = author;
        return this;
      }
      public Builder year(int year){
        this.year = year;
        return this;
      }
      public ComicBook build(){
        return new ComicBook(name, author, year);
      }
    }

    public static void main(String[] args) {
      ComicBook comicBook = ComicBook.builder()
        .name("The Incredible Hulk")
        .author("Stan Lee")
        .year(1962)
        .build();
      comicBook.getDetails();
    }

}
  
  
