package lab_14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static lab_14.BookController.BOOK_DB_LOCATION;

public class DataFactory {

    public static List<Book> getBookListFrom(String filePath){

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
        } catch(Exception e){
                e.printStackTrace();
            }
        return result;
    }

    public static void saveBookList(List<Book> bookList, String filePath){

        try(FileOutputStream fileOutputStream = new FileOutputStream(BOOK_DB_LOCATION);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        ){
            for (Book book : bookList) {
                int bookISBN = book.getIsbn();
                String bookAuthor = book.getAuthor();
                String bookTitle = book.getTitle();
                String bookYear = book.getYear();
                String dataLine;
                dataLine = String.valueOf(bookISBN).concat(";").concat(bookAuthor).concat(";").concat(bookTitle).concat(";").concat(bookYear);
                bufferedWriter.write(dataLine);
                bufferedWriter.newLine();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}