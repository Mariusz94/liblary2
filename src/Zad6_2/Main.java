package Zad6_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.booksInLiblary();
        main.menu();



    }
    public void booksInLiblary(){
        Library library = new Library();
        library.addBook(new Book("igrzyska", "ktoś", 130, "yes"));
        library.addBook(new Book("potter", "ktoś", 100,"yes"));
        library.addBook(new Book("puchatek", "ktoś", 30,"no"));
        library.addBook(new Book("gumisie", "ktoś", 40,"yes"));
        library.addBook(new Book("kot  w butach", "ktoś", 1050, "no"));
    }

    public void menu() {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        String numberMenu = " ";
        while (!numberMenu.equals("0")) {
            System.out.println("1 Wyświetlenie dostępnych książek");
            System.out.println("2 Wyświetlenie wypożyczonych książek");
            System.out.println("3 Wypożycz książkę");
            System.out.println("4 Oddaj książkę");
            System.out.println("0 Koniec programu");
            numberMenu = scanner.nextLine();
            switch (numberMenu) {
                case "1":
                    library.showAllAvailableBooks();
                    break;
                case "2":
                    library.showAllBorrowBooks();
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "0":
                    break;
            }
        }
    }
}
