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
  // removeByTitle assume remove 1st book only
  // Title substring includes keywords
  // abcde contains ab, abc, abcd
  public Book removeByTitle(String title){
    int idx = 0;
    Book [] newBooks = new Book[this.books.length - 1];
    for (int i = 0; i < this.books.length; i++){
      if (this.books[i].getTitle().contains(title) == false){

      }
    }Book[] newBooks;
        this.books = newBooks;
  }
  // search substring
  // if getTitle contains searchString, get that book, return new array
  public void searchByTitle(String searchString){
    int idx = 0;
    Book [] searchBooks = new Book[this.books.length - 1];
    for (int i = 0; i < this.books.length; i++){
      if (this.books[i].getTitle().contains(searchString) == true){
        searchBooks[idx++] = this.books[i];
      }
    }this.books = searchBooks;
  }
  // Librarian (add book, remove book, search book)


  public static void main(String[] args) {
    
  }  
}
