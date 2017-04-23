package Books;

import Books.Book;
import Strategy.DefaultSellingType;
import Strategy.IBookSellingTypeBehavior;
import Strategy.Loanable;
import Strategy.Saleable;

/**
 * Created by canbay on 21.04.2017.
 */
public class ComicBook extends Book {

    public ComicBook(){
        name = "Default Comic Book Name";
        author = "Default Comic Book Author";
        price = 0.0;
        behavior = new DefaultSellingType();
    }

    public ComicBook(String name, String author, Double price) {
        super(name, author, price);
        behavior = new Loanable();
    }

    @Override
    String sayBookType() {
        return "Comic Book!";
    }
}
