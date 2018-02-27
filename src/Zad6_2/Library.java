package Zad6_2;

public class Library {
    private Book[] books = new Book[5];
    private String available;

    public void addBook(Book book){
        for (int i = 0; i< books.length; i++){
            if(books[i] == null){
                books[i] = book;
                break;
            }
        }
    }

    public void bookToBorrow() {

    }

    public void backBorrowBook() {

    }

    public void showAllAvailableBooks() {
        for (Book book : books) {
            if(book.getAvailable().equals("yes")){
                book.toString();
            }
        }
    }

    public void showAllBorrowBooks() {
        for (Book book : books) {
            if(book.getAvailable().equals("no")){
                book.toString();
            }
        }
    }



}
