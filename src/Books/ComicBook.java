package Books;

import Books.Book;
import Strategy.DefaultSellingType;
import Strategy.IBookSellingTypeBehavior;

/**
 * Created by canbay on 21.04.2017.
 */
public class ComicBook extends Book {

    public ComicBook(){
        name = "Default Comic Books.Book Name";
        author = "Default Comic Books.Book Author";
        price = 0.0;
        behavior = new DefaultSellingType();
    }

    public ComicBook(String name, String author, Double price, IBookSellingTypeBehavior behavior) {
        super(name, author, price, behavior);
    }

    @Override
    String sayBookType() {
        return "Comic Book!";
    }
}
