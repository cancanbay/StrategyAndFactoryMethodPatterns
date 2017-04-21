package Books;

import Books.Book;
import Strategy.IBookSellingTypeBehavior;
import Strategy.Saleable;

/**
 * Created by canbay on 21.04.2017.
 */
public class MathBook extends Book {

    public MathBook(){
        name = "Default Mathematic Book Name";
        author = "Default Mathematic Book Author";
        price = 0.0;
        behavior = new Saleable();
    }

    public MathBook(String name, String author, Double price) {
        super(name, author, price);
        behavior = new Saleable();
    }

    @Override
    String sayBookType() {
        return "Mathematic Book!";
    }
}
