import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(ArrayList<Book> books, int capacity){
        this.books = books;
        this.capacity = capacity;
    }

    public int getBooksCount(){
        return books.size();
    }

    public void addBook(Book book){
        if (this.capacity > getBooksCount())
        this.books.add(book);
    }

    public Book removeBook(){
        return this.books.remove(0);
    }

    public  Book removeSpecificBook(Book book){
        this.books.remove(book);
        return book;
    }



}
