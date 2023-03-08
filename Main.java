
import java.util.*;
import java.util.Map.Entry;
public class Main {
/*
    public static void main(String[] args) {
        Stock stock = new Stock("ABC", 20);

        Stock stockA = new Stock("DEF", 50);

        BuyStock buyOrderStock = new BuyStock(stock);

        SellStock sellOrderStock = new SellStock(stockA);

        Broker broker = new Broker();

        broker.takeOrder(buyOrderStock);
        broker.takeOrder(sellOrderStock);

        broker.placeOrders();
    } */


    public static void main(String[] args) {

        BookRecords br = new BookRecords();

        System.out.println("=====ADD=====");
        br.AddBook("For1");
        br.AddBook("For2");
        br.AddBook("For3");
        br.AddBook("For4");
        System.out.println("====REMOVE====");
        br.RemoveBook(1);
        System.out.println("=====VIEW=====");
        br.ViewBook();
        System.out.println("=====ADD=====");
        br.AddBook("For1");
        br.AddBook("For5");
        System.out.println("=====VIEW=====");
        br.ViewBook();
        System.out.println("====REMOVE====");
        br.RemoveBook(3);
        br.RemoveBook(4);
        System.out.println("=====VIEW=====");
        br.ViewBook();
        System.out.println("=====ADD=====");
        br.AddBook("Added1");
        br.AddBook("Added2");
        System.out.println("=====VIEW=====");
        br.ViewBook();



    }


}
