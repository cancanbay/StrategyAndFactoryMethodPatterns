package BookStores;

import BookStores.BookStore;
import Books.Book;
import Books.MathBook;
import Strategy.IBookSellingTypeBehavior;

/**
 * Created by canbay on 21.04.2017.
 */
public class MathBookStore extends BookStore {


    @Override
    public void sayHelloAndSell(Book book) {
        System.out.println("Welcome to the Mathematic Book Store!");
        sellBookNew(book);
    }
    @Override
    public Book createBook(String name, String author, Double price) {
        return new MathBook(name,author,price);
    }
}
