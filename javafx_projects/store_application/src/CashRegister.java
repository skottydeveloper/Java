import javafx.beans.property.*;
public class CashRegister implements ProductObserver {
    private DoubleProperty cash = new SimpleDoubleProperty();    
        
    public CashRegister() { 
        setCash(0.00);    
    }
    
    public final double getCash() {
        return cash.get(); 
    }
    
    public final void setCash(double cash) {
        this.cash.set(cash);
    }
    
    public ReadOnlyDoubleProperty cashProperty() { 
        return cash; 
    }
        
    @Override     
    public void handleSale(double amount) { 
        setCash(getCash() + amount);    
    } 
}
