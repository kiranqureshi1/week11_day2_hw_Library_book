public class Book {
    private String title;
    private String genre;
    private String author;

    public Book(String title, String genre, String author){
        this.title = title;
        this.genre = genre;
        this.author = author;
    }

     public String getTitle(){
        return this.title;
     }

     public String getGenre(){
        return this.genre;
     }

     public String getAuthor(){
        return this.author;
     }



}
