import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> books;

    public Borrower(){
        this.books = new ArrayList<>();
    }

    public int getBooksCount(){
        return this.books.size();
    }



    public void borrowBookFromLibrary(Library library, Book favBook){
        Book book = library.removeSpecificBook(favBook);
        this.books.add(book);
    }
}
