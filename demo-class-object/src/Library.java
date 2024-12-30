import java.util.Arrays;

public class Library {
  // A library has many books
  // A book has attributes, title & author
  // a library has functions, 
    // 1. add book, return void.
    // 2. removeByTitle, return Book.
    // 3. searchByTitle, return Book[]
  private Book[] books;

  public Library(){
    this.books = new Book[0];
  }

  public void addBook(Book book){
    Book [] newBooks = new Book[this.books.length + 1];
    for (int i = 0; i < books.length; i++){
      newBooks[i] = books[i];
    } newBooks[newBooks.length - 1] = book;
    this.books = newBooks;
  }
  public void removeBook(Book book){
    int idx = 0;
    Book [] newBooks = new Book[this.books.length - 1];
    for (int i = 0; i < this.books.length; i++){
      if (this.books[i].getTitle().equals(book.getTitle()) == false){
        newBooks[idx++] = this.books[i];
      }
    }this.books = newBooks;
  }
  // removeByTitle, assume remove 1st book only
  public Book removeByTitle(String title) {
    int idx = 0;
    Book removedBook = null;
    for (int i = 0; i < this.books.length; i++) {
      if (this.books[i].getTitle().equals(title)) {
        removedBook = this.books[i];
        break; // find the first book only
      }
    }
    if (removedBook == null) {
      return null;
    }
    Book[] newBooks = new Book[this.books.length - 1];
      for (int i = 0; i < this.books.length; i++) {
        if (!this.books[i].getTitle().equals(title)) {
            newBooks[idx++] = this.books[i];
        }
      }
      this.books = newBooks;
      return removedBook;
    }
  // search substring
  public Book[] searchByTitle(String searchString) {
    int count = 0;
    for (int i = 0; i < this.books.length; i++) {
        if (this.books[i].getTitle().contains(searchString)) {
            count++;
        }
    }
    Book[] searchedBooks = new Book[count]; 
    int idx = 0;
    for (int i = 0; i < this.books.length; i++) {
        if (this.books[i].getTitle().contains(searchString)) {
            searchedBooks[idx++] = this.books[i];
        }
    }
    return searchedBooks;
  }
  // Librarian (add book, remove book, search book)


  public static void main(String[] args) {
    Library library = new Library();
    Book book = new Book("The Lord of the Rings", "J.R.R. Tolkien");
    library.addBook(book);
    library.removeByTitle("The Lord of the Rings");
    library.searchByTitle("The Lord of the Rings");
    System.out.println(library.searchByTitle("The Lord of the Rings"));
  }  
}
