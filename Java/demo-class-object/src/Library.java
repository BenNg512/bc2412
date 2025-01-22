public class Library {
  // A library has many books
  // A book has attributes, title & author
  // a library has functions, 
    // 1. add book, return void.
    // 2. removeByTitle, return Book.
    // 3. searchByTitle, return Book[]
  private Book[] books;
  private Librarian[] librarians;

  public Library(){
    this.books = new Book[0];
  }
  public Book[] getBooks(){
    return this.books;
  }
  public Book[] setBooks(Book[] books){
    return this.books;
  }

  // public void addBook(Book book){
  //  Book [] newBooks = new Book[this.books.length + 1];
  //  for (int i = 0; i < books.length; i++){
  //    newBooks[i] = books[i];
  //  } newBooks[newBooks.length - 1] = book;
  //  this.books = newBooks;
  //}

  // removeByTitle, assume remove 1st book only // same title 
  // public Book removeByTitle(String title) {
  //  int idx = 0;
  //  Book removeBook = null;
  //  Book[] newBooks = new Book[this.books.length - 1];
  //  for (int i = 0; i < this.books.length; i++) {
  //    if (this.books[i].getTitle().equals(title)) {
  //      removeBook = this.books[i];
  //      break; // find the first book only, so stop here
  //    }
  //  }
  //  if (removeBook == null) {
  //    return null;
  //  }
  //  for (int i = 0; i < this.books.length; i++) {
  //    if (!this.books[i].getTitle().equals(title)) {
  //      newBooks[idx++] = this.books[i];
  //      }
  //    }
  //    this.books = newBooks;
  //    return removeBook;
  //  }
  // search substring
  public Book[] searchByTitle(String searchString) {
    int count = 0;
    for (int i = 0; i < this.books.length; i++) {
        if (this.books[i].getTitle().contains(searchString)) {
            count++;
        }
    }
    if (count == 0) {
      return new Book[0];
    }
    Book[] searchedBooks = new Book[count]; // found no. of books now and print it out
    int idx = 0;
    for (int i = 0; i < this.books.length; i++) {
        if (this.books[i].getTitle().contains(searchString)) {
            searchedBooks[idx++] = this.books[i];
        }
    }
    return searchedBooks; // return the array
  }

  public int size(){
    return this.books.length;
  }
  // Librarian (add book, remove book, search book)

  public static void main(String[] args) {
    Library libra1 = new Library();
    Librarian L1 = new Librarian(libra1);
    Book book1 = new Book("Harry Potter 1", "JK Rowling");
    L1.addBook(book1);
    L1.addBook(new Book("Harry Potter 2", "JK Rowling"));
    L1.addBook(new Book("Harry Potter 3", "JK Rowling"));
    L1.addBook(new Book("Fantastic Beast 1", "JK Rowling"));
    L1.addBook(new Book("Fantastic Beast 2", "JK Rowling"));
    L1.removeByTitle("Harry Potter");

    Book book2 = new Book("The Lord of the Rings", "J.R.R. Tolkien");
    Library libra2 = new Library();
    Librarian L2 = new Librarian(libra2);
    L2.addBook(book2);
    libra2.searchByTitle("The Lord of the Rings");
    L2.removeByTitle("The Lord of the Rings x Hobbits");
    L2.addBook(new Book("Fantastic Beast 2", "JK Rowling"));


    System.out.println("Library 1 books count: " + libra1.size());
    System.out.println("Library 1 books list:");
    for (Book book : libra1.books) {
      System.out.println(book.getTitle() + " by " + book.getAuthor());
    }
    System.out.println();

    String searchKeyWord = "1";
    System.out.println("Library 1 Search result: " + searchKeyWord);
    for (Book book : libra1.searchByTitle(searchKeyWord)){
      System.out.println(book.getTitle() + " by " + book.getAuthor());
    }
    System.out.println();

    System.out.println("Library 2 book list:");
    for (Book book : libra2.books) {
      System.out.println(book.getTitle() + " by " + book.getAuthor());
    }

    Library lb1 = new Library();
    Librarian lbn = new Librarian(lb1);
    lbn.addBook(new Book("ABC", "Tommy"));
  }
}
