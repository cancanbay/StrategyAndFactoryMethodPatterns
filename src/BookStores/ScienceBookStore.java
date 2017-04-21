package BookStores;

import BookStores.BookStore;
import Books.Book;
import Books.ScienceBook;
import Strategy.IBookSellingTypeBehavior;

/**
 * Created by canbay on 21.04.2017.
 */
public class ScienceBookStore extends BookStore {


    @Override
    public void sayHelloAndSell(Book book) {
        System.out.println("Welcome to the Science Book Store!");
        sellBookNew(book);
    }
    @Override
    public Book createBook(String name, String author, Double price) {
        return new ScienceBook(name,author,price);
    }
}
