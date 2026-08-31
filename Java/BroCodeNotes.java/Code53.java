// July 30, 2025

public class Code53 {
    public static void main(String[] args) {
    // Aggregation = A "has-a" relationship between objects
        /* One objects has another object as its structre,
            but that object exists independently */
            // For example, a library HAS books

        Book book1 = new Book ("Wonder", 310);
        Book book2 = new Book ("A Long Walk To Water", 128);
        Book book3 = new Book ("Matilda", 240);

        Book[] books = {book1, book2, book3};

        // Library object = aggregation
        Library library = new Library("NYC Public Library", 1897, books);

        library.displayInfo();

    }
}

class Book {
    String title;
    int pages;

    Book (String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    String displayInfo(){
        return this.title + " (" + this.pages + " pages)";
    }
}

class Library {
    String name;
    int year;
    Book[] books;

    Library(String name, int year,Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo() { // Display info
        System.out.println("The " + this.year + " " + this.name);
        System.err.println("Books Available: ");
        for (Book book : books) {
            System.out.println(book.displayInfo());
        }
    }
}