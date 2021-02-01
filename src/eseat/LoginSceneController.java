
package eseat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



public class LoginSceneController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    @FXML private Label WrongIDPass;
    
    @FXML private TextField userID;
    @FXML private PasswordField password;

    @FXML
    void login(ActionEvent event) throws IOException {
        
         FileReader fr = new FileReader("shatol.txt");
            BufferedReader reader = new BufferedReader(fr);

            String in1 = userID.getText();
            String in2 = password.getText();
        
            String line = " ";
              String ch = " ";
           
           
            while ((line = reader.readLine()) != null){
                String [] sa = line.split(" ");
                String x1 = sa[0];
                String y = sa[1];
                if((in1.compareTo(sa[0]) == 0) && (in2.compareTo(sa[1]) == 0)){
                  
              Parent login = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
        
              Scene Mainwindow = new Scene(login);
        
              Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    
              window.setScene(Mainwindow);
              window.show();
                    
               break;
                }
                 
            
                 
            }
            reader.close();
        
         if (line == null){
                   wrongIDpass();
                }
        
        
      
    }
    
    
    
     @FXML
    void EXIT(ActionEvent event) throws IOException {
        
        System.exit(0);
    }

    @FXML
    void initialize(URL url, ResourceBundle rb) {

        WrongIDPass.setText("");
        
    }
    
    public void wrongIDpass(){
    
        WrongIDPass.setText("Wrong userID/Password");
    }
}

