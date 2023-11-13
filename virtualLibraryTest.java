public class VirtualLibraryTest {

    public static void main(String[] args) {
        // Initialize the virtual library
        VirtualLibrary myLibrary = new VirtualLibrary();

        // Create user accounts
        LibraryUserAccount userAccount1 = new LibraryUserAccount(0, "Jane Doe", 101);
        LibraryUserAccount userAccount2 = new LibraryUserAccount(1, "John Smith", 102);

        // Add user accounts to the library
        myLibrary.addUserAccount(userAccount1);
        myLibrary.addUserAccount(userAccount2);

        // Display all user accounts
        System.out.println("Displaying all user accounts after adding:");
        myLibrary.displayUserAccounts();

        // Simulate checking out a book for Jane Doe
        userAccount1.setNumberOfBooks(userAccount1.getNumberOfBooks() + 1);
        System.out.println("Jane Doe checks out a book. Total books now: " + userAccount1.getNumberOfBooks());

        // Simulate returning a book for John Smith
        userAccount2.setNumberOfBooks(userAccount2.getNumberOfBooks() - 1);
        System.out.println("John Smith returns a book. Total books now: " + userAccount2.getNumberOfBooks());

        // Display all user accounts after checkout and return
        System.out.println("\nDisplaying all user accounts after checkout and return:");
        myLibrary.displayUserAccounts();

        // Test releasedBooks method for a user reaching the limit
        for (int i = 0; i < 9; i++) {
            userAccount1.releasedBooks(userAccount1.getNumberOfBooks());
        }
        System.out.println("After attempting to checkout multiple books, Jane Doe has: " + userAccount1.getNumberOfBooks() + " books.");
    }
}
