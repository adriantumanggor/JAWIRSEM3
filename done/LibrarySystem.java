import java.util.ArrayList;

// Class Book
class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void applyDiscount(double discountPercentage) {
        price -= price * (discountPercentage / 100);
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
    }
}

// Class Library
class Library {
    private String name;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}

// Class Librarian
class Librarian {
    private String name;
    private String employeeId;

    public Librarian(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void registerBook(Library library, Book book) {
        library.addBook(book);
    }

    public Book searchBook(Library library, String title) {
        return library.findBookByTitle(title);
    }

    public double calculateSalary() {
        return 3000.00; // Example fixed salary for simplicity
    }
}

// Main class to test the implementation
public class LibrarySystem {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("Java Programming", "John Doe", 100.0);
        Book book2 = new Book("Python Programming", "Jane Doe", 120.0);

        // Create a library
        Library library = new Library("City Library");

        // Create a librarian
        Librarian librarian = new Librarian("Alice", "EMP001");

        // Register books in the library
        librarian.registerBook(library, book1);
        librarian.registerBook(library, book2);

        // Apply discount to a book
        book1.applyDiscount(10.0);

        // Search for a book by title
        Book foundBook = librarian.searchBook(library, "Java Programming");
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found!");
        }

        // Display all books in the library
        System.out.println("Books in the library:");
        for (Book book : library.getBooks()) {
            System.out.println(book);
        }

        // Calculate the librarian's salary
        double salary = librarian.calculateSalary();
        System.out.println("Librarian's salary: $" + salary);
    }
}
