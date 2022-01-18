public class Store {     
    private CashRegister cashRegister;     
    private Product product;     
    
    public Store() { 
        cashRegister = new CashRegister(); 
        product = new Product("Sticky tape"); 
        product.addProductObserver(cashRegister);     
    }
    
    public final Product getProduct() {
        return product;
    }
} 
