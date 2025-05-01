public class Library {
    Book[] books;
    int bookCount = 0;

    public Library(int size) {
        books = new Book[size];
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
            System.out.println("Kitab əlavə edildi.");
        } else {
            System.out.println("Kitabxana doludur!");
        }
    }

    public void removeBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(book)) {
                books[i] = null;
                bookCount--;

            }
        }
    }

    public void updateBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(book)) {
                books[i] = null;
                bookCount--;
                break;

            }
        }
    }

    public void showBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
            }
        }
    }

    public void showAvailableBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);

            }
        }
    }

    public void updateBook(String updateTitle, double newPrice, boolean availability) {
    }
}


