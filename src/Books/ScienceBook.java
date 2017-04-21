package Books;

import Books.Book;
import Strategy.IBookSellingTypeBehavior;

/**
 * Created by canbay on 21.04.2017.
 */
public class ScienceBook extends Book {

    public ScienceBook(){
        name = "Default Science Book Name";
        author = "Default Science Book Author";
        price = 0.0;
    }

    public ScienceBook(String name, String author, Double price, IBookSellingTypeBehavior behavior) {
        super(name, author, price, behavior);
    }

    @Override
    String sayBookType() {
        return "Science Book!";
    }
}
