import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class TestLibrary {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;

    @Before
    public void before(){
        book1 = new Book("Life", "classic", "Mina");
        book2 = new Book("Love", "drama", "Jojo");
        book3 = new Book("Advanture", "non-fiction", "Uzma");
        book4 = new Book("About Me", "fiction", "Zora");
//        Book[] books = {book1, book2, book3};
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        library = new Library(books, 100);

    }

    @Test
    public void getBooksCount(){
        assertEquals(3, library.getBooksCount());
    }

    @Test
    public void addBook(){
        library.addBook(book4);
        assertEquals(4, library.getBooksCount());
    }

//    @Test
//    public void removeBook(){
//        library.removeBook();
//        assertEquals(3, library.getBooksCount());
//    }

    @Test
    public void removeSpecificBook(){
        Book book5 = new Book("About us", "fiction", "Zora");
        library.addBook(book4);
        library.removeSpecificBook(book5);
        assertEquals(4, library.getBooksCount());
    }
}
