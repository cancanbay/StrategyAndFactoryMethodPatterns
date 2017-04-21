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

        Loanable loanablestrategy = new Loanable();
        Saleable saleablestrategy = new Saleable();
        BookStore comicstore = new ComicBookStore();
        BookStore mathstore = new MathBookStore();
        BookStore sciencestore = new ScienceBookStore();
        Book withcomicStore = comicstore.createBook("The Flash","John Broome",199.95,saleablestrategy);
        comicstore.sellBook(withcomicStore);
        System.out.println("-----------------------------------------------------------------------------------");
        Book withmathstore = mathstore.createBook("Calculus Made Easy","Silvanus P. Thompson",15.0,loanablestrategy);
        mathstore.sellBook(withmathstore);
        System.out.println("-----------------------------------------------------------------------------------");
        Book withsciencestore = sciencestore.createBook("Zamanın Kısa Tarihi: Büyük Patlamadan Karadeliklere","Stephen Hawking",100.0,loanablestrategy);

    }
}
