import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.text.*;
import javafx.scene.control.*;

public class StoreController {
    private Store store = new Store();
    @FXML private Button sellBtn;
    @FXML private Text stockTxt;
    @FXML private Text priceTxt;
    @FXML private TextField amountTf;
    @FXML private Text cashTxt;
    
    public final Store getStore() { 
        return store; 
    }
    
    @FXML private void initialize() {
        amountTf.textProperty().addListener((event, oldTxt, newTxt) -> sellBtn.setDisable(!newTxt.matches("^0*(?:[1-9][0-9]?|200)$")));
    }
    
    private final int getStock() { 
        return Integer.parseInt(stockTxt.getText()); 
    }
    
    private final void setStock(int stock) {
        stockTxt.setText("" + stock); 
    }
    
    private final double getPrice() { 
        return Double.parseDouble(priceTxt.getText()); 
    }
    
    private final void setPrice(int price) {
        priceTxt.setText("" + price); 
    }
    
    private final int getAmount() { 
        return Integer.parseInt(amountTf.getText()); 
    }
    
    private final void setAmount(int amount) {
        amountTf.setText("" + amount); 
    }
    
    private final double getCash() { 
        return Double.parseDouble(cashTxt.getText()); 
    }
    
    private final void setCash(double cash) {
        cashTxt.setText("" + cash); 
    }
    
    @FXML private void handleSell(ActionEvent event) {
        Product product = getStore().getProduct();
        int amount = getAmount();
        if (product.has(amount))
            product.sell(amount);
        setAmount(0);
    }
}
