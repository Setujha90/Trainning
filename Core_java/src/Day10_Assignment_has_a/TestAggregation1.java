package Day10_Assignment_has_a;

class Book {
    String title;

    Book(String title) {
        this.title = title;
    }
}

class Library {
    Book book;

    Library(Book book) {
        this.book = book;
    }

    void show() {
        System.out.println("Library has book: " + book.title);
    }
}

public class TestAggregation1 {
    public static void main(String[] args) {
        Book b = new Book("Java");
        Library l = new Library(b);
        l.show();
    }
}

