package Books;

import Strategy.IBookSellingTypeBehavior;

/**
 * Created by canbay on 21.04.2017.
 */
public abstract class Book {

    public IBookSellingTypeBehavior behavior;
    public String name;
    public String author;
    public double price;

    public Book(){

    }
    public Book(String name, String author, Double price, IBookSellingTypeBehavior behavior){
        this.name = name;
        this.author = author;
        this.price = price;
        this.behavior = behavior;
    }

    public String sayBehaviorType() {
       return behavior.saySellingType();
    }

    public void setSellingBehavior(IBookSellingTypeBehavior behavior) {
        this.behavior =  behavior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract String sayBookType();
}
