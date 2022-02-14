package StoreExercise;
import java.text.*;

public class Product {
    private String name;
    private int stock;
    private double price;

    public Product(String name, int stock, double price) {
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public boolean hasName(String name) {
        return this.name.equals(name);
    }

    public String getName() {
        return name;
    }

    public boolean isEmpty() {
        return stock == 0;
    }

    public boolean has(int n) {
        return stock >= n;
    }

    public double sell(int n) {
        if (n <= stock) {
            stock -= n;
        } else {
            System.out.println("Not enough stock");
        }
        return price * n; 
    }

    public void restock(int n) {
        stock += n;
    }

    @Override
    public String toString() {
        return name + " - " + stock + " at $" + formatted(price); 
    }

    private String formatted(double money) {
        return new DecimalFormat("###,##0.00").format(money);
    }
}