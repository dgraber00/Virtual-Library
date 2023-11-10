/*
 * Dalton Graber
 */
public class libraryUserAccount {
	private int numberOfBooks;
	private String name;
	private int accountNumber;
	
	public libraryUserAccount(int numberOfBooks, String name, int accountNumber) {
		this.numberOfBooks = numberOfBooks;
		this.name = name;
		this.accountNumber = accountNumber;
	}

	public int getNumberOfBooks() {
		return numberOfBooks;
	}

	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public void releasedBooks (int numberOfBooks) {
		if (numberOfBooks == 8) {
			System.out.println("Cannot check out anymore books");
		}else {
			numberOfBooks++;
		}
	}
}
