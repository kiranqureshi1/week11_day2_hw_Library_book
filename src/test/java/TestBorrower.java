import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class TestBorrower {

  Borrower borrower;
  Book book1;
  Book book2;
  Library library;

  @Before
    public void before(){
      book1 = new Book("About Me", "fiction", "Zora");
      book2 = new Book("Life", "classic", "Mina");
      borrower = new Borrower();
      ArrayList<Book> books = new ArrayList<>();
      books.add(book1);
      books.add(book2);
      library = new Library(books, 100);
  }

  @Test
  public void getBooksCount(){
      assertEquals(0, borrower.getBooksCount());
  }


  @Test
    public void BorrowBookFromLibrary(){
      borrower.borrowBookFromLibrary(library, book1);
      assertEquals(1, borrower.getBooksCount());
  }

}
