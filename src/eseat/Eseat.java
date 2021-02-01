package eseat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Eseat extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("E-Seat UIU");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
