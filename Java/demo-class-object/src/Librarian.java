
public class Librarian {
  private Library library;
  private Book[] books;

  public Librarian(Library library) {
    this.library = library;
  }

  // public void addBook(Book book) {
  //  this.library.addBook(book);
  // }

  public void addBook(Book book) {
    Book[] books = new Book[this.books.length + 1];
    for (int i = 0; i < this.library.size(); i++) {
      books[i] = this.library.getBooks()[i];
    }
    books[books.length - 1] = book;
    this.library.setBooks(books);
  }

  // public void removeBook(String title) {
  //  this.library.removeByTitle(title);
  // }

  public void removeByTitle(String searchString) {
    Book[] books = new Book[this.books.length + -1];
    int idx = 0;
    for (int i = 0; i < this.library.size(); i++) {
      if (this.library.getBooks()[i].getName().contains(searchString)) {
      books[idx++] = this.library.getBooks()[i];
      }
    }
    this.library.setBooks(books); 
  }

  public void add(Book book) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
  }


}
