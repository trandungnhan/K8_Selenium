package lab_14;

import java.util.Scanner;

public class TestBook{

    public static void main(String[] args) {

        boolean isContinue = true;
        while (isContinue) {
            System.out.println("\n======= Book Management Program (CRUD)============\n" +
                    "1. New book\n" +
                    "2. Find a book(ISBN)\n" +
                    "3. Update a book\n" +
                    "4. Delete a book\n" +
                    "5. Print the book list\n" +
                    "0. Exit");
            System.out.print("\n Please select option: ");
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();

            switch (userInput) {
                case 1:
                    Scanner case1Scanner = new Scanner(System.in);
                    System.out.println("\n ---Add a new book---");

                    System.out.print("\n Please input ISBN: ");
                    String isbn = case1Scanner.nextLine();

                    System.out.print("\n Please input Title: ");
                    String title = case1Scanner.nextLine();

                    System.out.print("\n Please input Author: ");
                    String author = case1Scanner.nextLine();

                    System.out.print("\n Please input Year: ");
                    String year = case1Scanner.nextLine();

                    Book newBook = new Book(Integer.parseInt(isbn), title, author, year);
                    BookController.addBook(newBook);
                    break;
                case 2:
                    Scanner case2Scanner = new Scanner(System.in);
                    System.out.print("\n Please input ISBN to find the book: ");
                    String isbn2 = case2Scanner.nextLine();

                    Book bookToFind = null;
                    try {
                        bookToFind = BookController.findBook(Integer.parseInt(isbn2));

                    }catch (RuntimeException e){
                    }
                    if(bookToFind == null)
                        System.out.println("Book not found!");
                    break;
                case 3:
                    Scanner case3Scanner = new Scanner(System.in);
                    System.out.print("\n Please input ISBN to update the book: ");
                    String isbn3 = case3Scanner.nextLine();

                    if (BookController.findBook(Integer.parseInt(isbn3))==null){
                        System.out.println("Book not found!");
                        break;
                    }

                    System.out.println("\n ---Add a new book---");

                    System.out.print("\n Please input ISBN: ");
                    String isbnToUpdate = case3Scanner.nextLine();

                    System.out.print("\n Please input Title: ");
                    String titleToUpdate = case3Scanner.nextLine();

                    System.out.print("\n Please input Author: ");
                    String authorToUpdate = case3Scanner.nextLine();

                    System.out.print("\n Please input Year: ");
                    String yearToUpdate = case3Scanner.nextLine();

                    Book updateBook = new Book(Integer.parseInt(isbnToUpdate), titleToUpdate, authorToUpdate, yearToUpdate);

                    Book bookToUpdate = null;
                    try {
                        bookToUpdate = BookController.updateBook(Integer.parseInt(isbn3),updateBook);

                    }catch (RuntimeException e){
                    }
                    if(bookToUpdate == null)
                        System.out.println("Book not found!");
                    break;
                case 4:
                    Scanner case4Scanner = new Scanner(System.in);
                    System.out.print("\n Please input ISBN to delete the book: ");
                    String isbn4 = case4Scanner.nextLine();

                    Book book = null;
                    try {
                        book = BookController.deleteBook(Integer.parseInt(isbn4));

                    }catch (RuntimeException e){
                    }
                    if(book == null)
                        System.out.println("Book not found!");
                    break;
                case 5:
                    System.out.println("The list of book is: ");
                    BookController.printBookList();
                    break;
                case 0:
                    System.out.println("Exit!!!");
                    isContinue = false;
            }
        }
    }
}
