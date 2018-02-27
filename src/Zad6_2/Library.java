package Zad6_2;

public class Library {
    private Book[] books;

    public Library() {
        this.books = new Book[5];
    }

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
                System.out.println(book.toString());
            }
        }
    }

    public void showAllBorrowBooks() {
        for (Book book : books) {
            if(book.getAvailable().equals("no")){
                System.out.println(book.toString());
            }
        }
    }



}
