package StoreExercise;

import java.util.*;

public class Store {
    private CashRegister cashRegister;
    private LinkedList<Product> products = new LinkedList<Product>();

    public static void main(String[] args) {
        new Store().use();
    }

    public Store() {
        products.add(new Product("Whiteboard Marker", 85, 1.50));
        products.add(new Product("Whiteboard Eraser", 45, 5.00));
        products.add(new Product("Black Pen", 100, 1.50));
        products.add(new Product("Red Pen", 100, 1.50));
        products.add(new Product("Blue Pen", 100, 1.50));
        cashRegister = new CashRegister(0.00);
    }

    public void use() {
        char choice;
        while ((choice = readChoice()) != 'x') {
            switch (choice) {
                case 's': sell(); break;
                case 'r': restock(); break;
                case 'v': viewStock(); break;
                case 'c': viewCash(); break;
                case 'p': pruneProducts(); break;
                default: help(); break;
            }
        }
       System.out.println("Done");
    }

    private char readChoice() {
        System.out.print("Choice (s/r/v/c/p/x): ");
        return In.nextChar();
    }

    private LinkedList<Product> products(String name) {
        LinkedList<Product> matches = new LinkedList<>();
        for (Product product : products) {
            if (product.hasName(name)) {
                matches.add(product);
            }
        }
        return matches;
    }

    private void sell() {
        String name = readName().toLowerCase();
        int c = 0;
        int increment = 0;
        boolean stopRep = false;
        
        for (Product product : products) {
            if (product.getName().toLowerCase().equals(name.toLowerCase())) {
                System.out.println("Selling " + product.getName());
                int number = readNumber();
                double amount = product.sell(number);
                cashRegister.add(amount); 
            }
            
            else if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                if (stopRep == false) {
                    System.out.println("Multiple products match:");
                    stopRep = true;
                }
                System.out.println(product.toString());
            } else {
                c++;
                if (products.size() == c) {
                    System.out.println("No such product");
                }
            }
        }
    }    
    
    private void restock() {
        int c = 0;
        int increment = 0;
        String name = readName(); 

        for (Product product : products) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println("Restocking " + product.getName());
                int n = readNumber();
                product.restock(n);
            } else {
                c++;
                if (products.size() == c) {
                    System.out.println("Adding new product");
                    int stock = readNumber();
                    double price = readPrice();
                    products.add(new Product(name, stock, price));
                    break;
                }
            }
        }    
    }

    private void viewStock() {
        products.forEach(System.out::println);
    }

    private void viewCash() {
       System.out.println(cashRegister);
    }

    private LinkedList<Product> prunes() {
        LinkedList<Product> matches = new LinkedList<>();
        for (Product p : products) {
            if (p.isEmpty()) {
                matches.add(p);
            }
        }
        return matches;
    } 

    private void pruneProducts() {
        products.removeAll(prunes());
    }

    private String readName() {
        System.out.print("Name: ");
        return In.nextLine();
    }

    private double readPrice() {
        System.out.print("Price: $");
        return In.nextDouble();
    }

    private int readNumber() {
        System.out.print("Number: ");
        return In.nextInt();
    }

    private void help() {
        System.out.println("Menu options");
        System.out.println("s = sell");
        System.out.println("r = restock");
        System.out.println("v = view stock");
        System.out.println("c = view cash");
        System.out.println("p = prune products");
        System.out.println("x = exit");
    }
}