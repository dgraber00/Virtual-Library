/*
 * Cam Thomson
 * The VirtualLibrary class manages user accounts and available books, facilitating book checkouts, returns, and providing displays of available books and user accounts in a virtual library system.
 */
import java.util.ArrayList;
import java.util.List;

public class VirtualLibrary {
    private List<LibraryUserAccount> userAccounts;

    public VirtualLibrary() {
        this.userAccounts = new ArrayList<>();
    }

    public void addUserAccount(LibraryUserAccount userAccount) {
        userAccounts.add(userAccount);
    }

    public void displayUserAccounts() {
        System.out.println("User Accounts:");
        for (LibraryUserAccount userAccount : userAccounts) {
            System.out.println(userAccount.getName() + " - Account Number: " + userAccount.getAccountNumber());
        }
    }
    
    // Additional methods for managing available books, checkouts, returns, etc.
}
