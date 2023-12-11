
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dalton Graber
 */
public class booksForLibrary {
    private String nameOfBook;
    private String authorOfBook;

    public booksForLibrary(String nameOfBook, String authorOfBook) {
        this.nameOfBook = nameOfBook;
        this.authorOfBook = authorOfBook;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public String getAuthorOfBook() {
        return authorOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public void setAuthorOfBook(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }

    public Boolean equalsBooks (String book1){
        Boolean flag = false;
        if (book1.equalsIgnoreCase(nameOfBook)){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }
    
    public Boolean equalsAuthor (String author1){
        Boolean flag = false;
        if (author1.equalsIgnoreCase(authorOfBook)){
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }
}
