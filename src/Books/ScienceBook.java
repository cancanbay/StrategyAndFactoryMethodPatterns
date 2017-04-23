package Books;

import Books.Book;
import Strategy.DefaultSellingType;
import Strategy.IBookSellingTypeBehavior;
import Strategy.Loanable;

/**
 * Created by canbay on 21.04.2017.
 */
public class ScienceBook extends Book {

    public ScienceBook(){
        name = "Default Science Book Name";
        author = "Default Science Book Author";
        price = 0.0;
        behavior = new DefaultSellingType();
    }

    public ScienceBook(String name, String author, Double price) {
        super(name, author, price);
        behavior = new Loanable();
    }

    @Override
    String sayBookType() {
        return "Science Book!";
    }
}
