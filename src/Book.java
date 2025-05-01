public class Book {
    public String title;
    public String author;
    public String genre;
    public boolean isAvailable;
    public String pages;
    public String price;
    public Book(String title, String author, String genre, boolean isAvailable, String pages, String price) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.pages = pages;
        this.price = price;
    }

    public Book(String title, String author, String genre, int pages, double price, boolean isAvailable) {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void printBookDetails() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Genre: " + genre);
            System.out.println("IsAvailable: " + isAvailable);
            System.out.println("Pages: " + pages);
            System.out.println("Price: " + price);


        }
    }



