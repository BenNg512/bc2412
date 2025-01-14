import java.util.Objects;

public class Book {
  private String name;

  public Book(String name){
    this.name = name;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  @Override
  public boolean equals(Object obj){
    if (this == obj)
      return true;
    if (!(obj instanceof Book))
      return false;
    Book book = (Book) obj;
    return Objects.equals(this.name, book.getName());
  }

  public String printString(){
    return "this is " + this.name.toString();
  }

}