package oops2;

import java.awt.print.Book;
import java.util.Scanner;
public class BookManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        library library = new library();

        while (true) {
            System.out.println("\nLibrary management system");
            System.out.println("1. Add a Book");
            System.out.println("2. Replace a Book");
            System.out.println("3. Search for a Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Book ID: ");
                    long bookID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.println("Enter Author Name: ");
                    String author = scanner.nextLine();
                    System.out.println("Is the book available (true/fales)? ");
                    boolean isAvailable = scanner.nextBoolean();
                    Books newBook = new Books(bookID, title, author, isAvailable);
                    library.addBook(newBook);
                    break;

                case 2:
                    // Replace a book
                    System.out.print("Enter Book ID to replace: ");
                    int replaceID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter New Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("Enter New Author: ");
                    String newAuthor = scanner.nextLine();
                    library.replaceBook(replaceID, newTitle, newAuthor);
                    break;

                case 3:
                    // Search for a book
                    System.out.print("Enter Book ID to search: ");
                    int searchID = scanner.nextInt();
                    Books foundBook = library.searchBook(searchID);
                    if (foundBook != null) {
                        System.out.println("Book found:");
                        foundBook.displayBook();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:

                    library.displayBook();
                    break;

                case 5:

                    System.out.println("Exiting Library Management System.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}













