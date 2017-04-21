package BookStores;

import Books.Book;
import Strategy.IBookSellingTypeBehavior;

/**
 * Created by canbay on 21.04.2017.
 */
public abstract class BookStore {


     public abstract void sellBook(Book book);

     public abstract Book createBook(String name, String author, Double price, IBookSellingTypeBehavior behavior);

}
