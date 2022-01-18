import javafx.application.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.fxml.*;

public class StoreApplication extends Application {
    public static void main(String[] args) { launch(args); } 
       
    @Override     
    public void start(Stage stage) throws Exception { 
        FXMLLoader loader = new FXMLLoader(getClass().getResource("store.fxml"));
        Parent root = loader.load();
	stage.setTitle("Store");
	stage.setScene(new Scene(root));
        stage.sizeToScene();
	stage.show();   
    } 
} 