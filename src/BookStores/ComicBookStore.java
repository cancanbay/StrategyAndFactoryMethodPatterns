package BookStores;

import BookStores.BookStore;
import Books.Book;
import Books.ComicBook;
import Strategy.IBookSellingTypeBehavior;

/**
 * Created by canbay on 21.04.2017.
 */
public class ComicBookStore extends BookStore {


    @Override
    public void sellBook(Book book) {
        System.out.println("Welcome to the Comic Book Store!");

        if(book.sayBehaviorType().equals("Saleable Books!")){
            System.out.println("You selled a book named "+book.getName() + " with author "+book.getAuthor() + " with the price" +
                    " of "+ book.getPrice()+"$");
        }
        else if(book.sayBehaviorType().equals("Loanable Books!")){
            System.out.println("You loaned a book named "+ book.getName() + " with author "+book.getAuthor() + " with the price" +
                    " of "+ book.getPrice()+"$");
        }
        else{
            System.out.println("You are trying to transact with default book");
        }
    }

    @Override
    public Book createBook(String name, String author, Double price, IBookSellingTypeBehavior behavior) {
        return new ComicBook(name,author,price,behavior);
    }


}
