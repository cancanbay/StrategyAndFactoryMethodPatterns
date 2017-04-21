package BookStores;

import BookStores.BookStore;
import Books.Book;
import Books.ComicBook;
import Strategy.IBookSellingTypeBehavior;
import Strategy.Loanable;

/**
 * Created by canbay on 21.04.2017.
 */
public class ComicBookStore extends BookStore {


    @Override
    public void sayHelloAndSell(Book book) {
        System.out.println("Welcome to the Comic Book Store!");
        sellBookNew(book);
    }

    @Override
    public Book createBook(String name, String author, Double price) {
        return new ComicBook(name,author,price);
    }


}
