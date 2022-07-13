package lab_14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookController {

    public static final String BOOK_DB_LOCATION = System.getProperty("user.dir").concat("/src/lab_14/ListOfBooks.txt");

    public static Book addBook(Book book) {

        List<Book> bookList = DataFactory.getBookListFrom(BOOK_DB_LOCATION);
        Book newBook = new Book(book.getIsbn(),book.getTitle(),book.getAuthor(), book.getYear());
        bookList.add(newBook);
        DataFactory.saveBookList(bookList,BOOK_DB_LOCATION);
        System.out.println(newBook + " is added!!!");
        BookController.printBookList();
        return newBook;
    }

    public static Book findBook(int isbn) {

        List<Book> bookList = DataFactory.getBookListFrom(BOOK_DB_LOCATION);
        Book foundBook = null;
        for (Book book : bookList) {
            if (book.getIsbn() == isbn) {
                System.out.println(book + " is found");
                foundBook = book;
                break;
            } else if (book.getIsbn() != isbn) {
                continue;
            }
        }
        return foundBook;
    }

    public static Book deleteBook(int isbn) {
        List<Book> currentBookList = DataFactory.getBookListFrom(BOOK_DB_LOCATION);
        Book deleteBook = findBook(isbn);
        for (Book book : currentBookList)
            if (book.getIsbn()==deleteBook.getIsbn()) {
                currentBookList.remove(book);
                DataFactory.saveBookList(currentBookList,BOOK_DB_LOCATION);
                System.out.println(book + " is removed");
                break;
            } else if (book != deleteBook){
                continue;
            }
            BookController.printBookList();
        return deleteBook;
    }

    public static Book updateBook(int isbn, Book bookToUpdate) {
        List<Book> currentBookList = DataFactory.getBookListFrom(BOOK_DB_LOCATION);
        Book findBook = findBook(isbn);
        for (Book book : currentBookList)
            if (book.getIsbn()==findBook.getIsbn()) {
                currentBookList.remove(book);
                DataFactory.saveBookList(currentBookList,BOOK_DB_LOCATION);
                BookController.addBook(bookToUpdate);
                System.out.println(book + " is updated");
                break;
            } else if (book != bookToUpdate){
                continue;
            }
        return bookToUpdate;
    }

    public static void printBookList(){
        List<Book> result = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(BOOK_DB_LOCATION));
        ){
            String dataLine = br.readLine();
            while (dataLine != null) {
                String[] bookElement = dataLine.split(";");
                Book book = new Book(Integer.parseInt(bookElement[0]),bookElement[1],bookElement[2],bookElement[3]);
                result.add(book);
                dataLine = br.readLine();
            }
            System.out.println("List of book is :\n" + result.toString());

        } catch(Exception e){
            e.printStackTrace();
        }
    }
}


