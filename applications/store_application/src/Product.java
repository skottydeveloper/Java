import java.util.*;
import javafx.beans.property.*;

public class Product {     
    private LinkedList<ProductObserver> observers = new LinkedList<ProductObserver>();
     
    private String name;     
    private IntegerProperty stock = new SimpleIntegerProperty();
    private DoubleProperty price = new SimpleDoubleProperty();
    private DoubleProperty cash = new SimpleDoubleProperty();
    
    public Product(String name) { 
        this.name = name;
        stock.set(200);
        price.set(2.99);
        cash.set(0.00);
    }
    
    public final String getName() { 
        return name; 
    }
    
    public final int getStock() {
        return stock.get();
    }
    
    public ReadOnlyIntegerProperty stockProperty() {
        return stock; 
    }
    
    public final double getPrice() { 
        return price.get(); 
    }
    
    public ReadOnlyDoubleProperty priceProperty() {
        return price; 
    }
    
    public final double getCash() { 
        return cash.get();
    }
    
    public ReadOnlyDoubleProperty cashProperty() {
        return cash;
    } 
    
    public void sell(int n) { 
        stock.set(getStock() - n);
        double money = n * getPrice();
        for (ProductObserver observer : observers) {
            observer.handleSale(money);
        }    
    }     
    
    public void restock(int n) { 
        stock.set(stock.get() - n);
    } 
    
    public boolean has(int n) {
        return stock.get() >= n;     
    }     
    
    public void addProductObserver(ProductObserver observer) { 
        observers.add(observer);     
    }     
    
    @Override     
    public String toString() { 
        return stock + " " + name + " at $" + price;     
    }
} 
