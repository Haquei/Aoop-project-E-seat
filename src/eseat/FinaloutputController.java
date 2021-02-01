
package eseat;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class FinaloutputController implements Initializable {

    
    
       @FXML
    void back(ActionEvent event) throws IOException {
        
        FileWriter fw = new FileWriter("shatoldata.txt");
            BufferedWriter writer = new BufferedWriter(fw);
            writer.write("");
            writer.close();
        
         Parent login = FXMLLoader.load(getClass().getResource("shatolBus.fxml"));
        
        Scene Mainwindow = new Scene(login);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    
        window.setScene(Mainwindow);
        window.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
    }    
    
   
    
}
