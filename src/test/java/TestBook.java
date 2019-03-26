import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestBook {

    Book book;

    @Before
    public void before(){
        book = new Book("Life", "classic", "Mina");
    }

    @Test
    public void getTitle(){
        assertEquals("Life", book.getTitle());
    }

    @Test
    public void getGenre(){
        assertEquals("classic", book.getGenre());
    }

    @Test
    public void getAuthor(){
        assertEquals("Mina", book.getAuthor());
    }
}
