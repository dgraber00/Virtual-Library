/*
 * Cam Thomson
 * The VirtualLibrary class manages user accounts and available books, facilitating book checkouts, returns, and providing displays of available books and user accounts in a virtual library system.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class virtualLibrary {
    private Map<Integer, LibraryUserAccount> userAccounts;
    private List<Book> availableBooks;

    public VirtualLibrary() {
        this.userAccounts = new HashMap<>();
        this.availableBooks = new ArrayList<>();
    }

    public void addUserAccount(LibraryUserAccount userAccount) {
        userAccounts.put(userAccount.getAccountNumber(), userAccount);
    }

    public void addBook(Book book) {
        availableBooks.add(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : availableBooks) {
            System.out.println(book);
        }
    }

    public void displayUserAccounts() {
        System.out.println("User Accounts:");
        for (LibraryUserAccount userAccount : userAccounts.values()) {
            System.out.println(userAccount.getName() + " - Account Number: " + userAccount.getAccountNumber());
        }
    }

    public void checkoutBook(int accountNumber, int numberOfBooks) {
        LibraryUserAccount userAccount = userAccounts.get(accountNumber);
        if (userAccount != null) {
            if (numberOfBooks > 0 && numberOfBooks <= userAccount.getNumberOfBooks()) {
                for (int i = 0; i < numberOfBooks; i++) {
                    if (!availableBooks.isEmpty()) {
                        Book book = availableBooks.remove(0);
                        userAccount.returnBooks(1); // Adjust user's book count
                        System.out.println("Book checked out: " + book.getTitle());
                    } else {
                        System.out.println("No available books to check out.");
                        break;
                    }
                }
            } else {
                System.out.println("Invalid number of books to check out.");
            }
        } else {
            System.out.println("User account not found.");
        }
    }

    public void returnBook(int accountNumber, int numberOfBooksReturned) {
        LibraryUserAccount userAccount = userAccounts.get(accountNumber);
        if (userAccount != null) {
            userAccount.checkoutBooks(numberOfBooksReturned); // Adjust user's book count
            System.out.println("Books returned by " + userAccount.getName() + ": " + numberOfBooksReturned);
        } else {
            System.out.println("User account not found.");
        }
    }
}
