package BookStores;

import Books.Book;
import Strategy.IBookSellingTypeBehavior;
import Strategy.Loanable;
import Strategy.Saleable;

/**
 * Created by canbay on 21.04.2017.
 */
public abstract class BookStore {


     public abstract void sayHelloAndSell(Book book);

     public void sellBookNew(Book book){

          if(book.behavior.getClass().getSimpleName().equals("Saleable")){
               System.out.println("You selled a book named "+book.getName() + " with author "+book.getAuthor() + " with the price" +
                       " of "+ book.getPrice()+"$");
          }
          else if(book.behavior.getClass().getSimpleName().equals("Loanable")){
               System.out.println("You loaned a book named "+ book.getName() + " with author "+book.getAuthor() + " with the price" +
                       " of "+ book.getPrice()+"$");
          }
          else{
               System.out.println("You are trying to transact with default book");
          }
     }

     public abstract Book createBook(String name, String author, Double price);

}
