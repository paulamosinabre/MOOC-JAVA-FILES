public class Book {
 
    private String name;
    private int publicationYear;
 
    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }
 
    public String getName() {
        return name;
    }
 
    public int getPublicationYear() {
        return publicationYear;
    }
 
    public boolean equals(Object comparison) {
        
        // if the variables share the same address, they are equal
        if (this == comparison) {
            return true;
        }
 
        // if the compared object is not of type Book, the objects are not equal
        if (!(comparison instanceof Book)) {
            return false;
        }
 
        // cast the Object type comparison object
        // into a Book type comparisonBook object
        Book comparisonBook = (Book) comparison;
 
        return this.name.equals(comparisonBook.name)
                && this.publicationYear == comparisonBook.getPublicationYear();
    }
}
 
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
 
        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
 
            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);
 
            if (books.contains(book)) {
                System.out.println("The book is already on the list. Let's not add the same book again.");
            } else {
                books.add(book);
            }
        }
        
        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}
