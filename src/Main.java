import BookStores.BookStore;
import BookStores.ComicBookStore;
import BookStores.MathBookStore;
import BookStores.ScienceBookStore;
import Books.Book;
import Books.ComicBook;
import Strategy.Loanable;
import Strategy.Saleable;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         boolean bool=true;
        /* COMIC BOOKS HAS LOANABLE STRATEGY
         * MATH BOOKS HAS SALEABLE STRATEGY
         * SCICENCE BOOKS HAS LOANABLE STRATEGY
         */
        BookStore comicstore = new ComicBookStore();
        BookStore mathstore = new MathBookStore();
        BookStore sciencestore = new ScienceBookStore();
        BookStore sciencestore2 = new ScienceBookStore();

        Book comicstoreBook = comicstore.createBook("The Flash","John Broome",199.95);
        Book mathstoreBook = mathstore.createBook("Calculus Made Easy","Silvanus P. Thompson",15.0);
        Book sciencestoreBook = sciencestore.createBook("Zamanın Kısa Tarihi: Büyük Patlamadan Karadeliklere","Stephen Hawking",100.0);
        Book sciencestoreBook2 = sciencestore.createBook("Türlerin Kökeni","Charles Darwin",150.5);


        ArrayList<Book> books = new ArrayList<>();
        books.add(comicstoreBook);
        books.add(mathstoreBook);
        books.add(sciencestoreBook);
        books.add(sciencestoreBook2);

        ArrayList<BookStore> stores = new ArrayList<>();
        stores.add(comicstore);
        stores.add(mathstore);
        stores.add(sciencestore);
        stores.add(sciencestore2);

        while(bool == true) {
            System.out.println("NAME   -   AUTHOR    -   PRICE    -  SALE-TYPE     -    BOOK-TYPE");
            int ind = 0;
            for(Book book :books){
                int storeindex = stores.get(ind).getClass().getSimpleName().indexOf("Store");
                String a = (String)stores.get(ind).getClass().getSimpleName().subSequence(0,storeindex);
                String complex = a.subSequence(0,a.length()-4) + " "+ a.subSequence(a.length()-4,a.length());
                System.out.println(book.getName() + " - " + book.getAuthor() + " - " + book.getPrice() + " - " + book.sayBehaviorType() +" - "
                        +  complex + " \n");
                ind++;
            }
            System.out.println("Please give the name of the book you'd like to transact about.");
            Scanner scan = new Scanner(System.in);
            String type = scan.nextLine();

            int idx=0;
            for(Book book : books){

                if(book.getName().toLowerCase().contains(type.toLowerCase())){
                    stores.get(idx).sayHelloAndSell(book);
                }
                idx++;
            }
            System.out.println("Would you like to buy any other books? Please type Yes or No");
            Scanner scan2 = new Scanner(System.in);
            String yesorno = scan2.nextLine();
            if(yesorno.toLowerCase().contains("no")){
                bool = false;
                System.out.println("Good Bye!");
            }
        }

    }
}
