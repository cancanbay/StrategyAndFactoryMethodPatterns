package Books;

import Books.Book;
import Strategy.IBookSellingTypeBehavior;

/**
 * Created by canbay on 21.04.2017.
 */
public class MathBook extends Book {

    public MathBook(){
        name = "Default Mathematic Book Name";
        author = "Default Mathematic Book Author";
        price = 0.0;
    }

    public MathBook(String name, String author, Double price, IBookSellingTypeBehavior behavior) {
        super(name, author, price, behavior);
    }

    @Override
    String sayBookType() {
        return "Mathematic Book!";
    }
}
