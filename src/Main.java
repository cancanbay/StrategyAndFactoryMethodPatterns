import BookStores.BookStore;
import BookStores.ComicBookStore;
import BookStores.MathBookStore;
import BookStores.ScienceBookStore;
import Books.Book;
import Books.ComicBook;
import Strategy.Loanable;
import Strategy.Saleable;

public class Main {

    public static void main(String[] args) {

        /* COMIC BOOKS HAS LOANABLE STRATEGY
         * MATH BOOKS HAS SALEABLE STRATEGY
         * SCICENCE BOOKS HAS LOANABLE STRATEGY
         */
        BookStore comicstore = new ComicBookStore();
        BookStore mathstore = new MathBookStore();
        BookStore sciencestore = new ScienceBookStore();

        Book withcomicStore = comicstore.createBook("The Flash","John Broome",199.95);
        comicstore.sayHelloAndSell(withcomicStore);
        System.out.println("-----------------------------------------------------------------------------------");
        Book withmathstore = mathstore.createBook("Calculus Made Easy","Silvanus P. Thompson",15.0);
        mathstore.sayHelloAndSell(withmathstore);
        System.out.println("-----------------------------------------------------------------------------------");
        Book withsciencestore = sciencestore.createBook("Zamanın Kısa Tarihi: Büyük Patlamadan Karadeliklere","Stephen Hawking",100.0);
        sciencestore.sayHelloAndSell(withsciencestore);
    }
}
