
package eseat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;


public class MainSceneController implements Initializable{

      @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    
      //login2
      @FXML private Label WrongIDPass;
      @FXML private TextField userID;
      @FXML private PasswordField password;
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
 
     
      
       WrongIDPass.setText("");
        
        
    } 
    
     @FXML
    void logout(ActionEvent event) throws IOException {
        
        
        
         Parent login = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
        
        Scene Mainwindow = new Scene(login);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    
        window.setScene(Mainwindow);
        window.show();
    }
    

    
     @FXML
    void login2(ActionEvent event) throws IOException {
        
         FileReader fr = new FileReader("long.txt");
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
        
        
         Parent login = FXMLLoader.load(getClass().getResource("Login2.fxml"));
        
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
     public void wrongIDpass(){
    
        WrongIDPass.setText("Wrong userID/Password");
    }
     
     
      @FXML
    void shatolbus(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("shatolBus.fxml"));
        
         Parent login = loader.load();
         
         //ShatolBusController controller = loader.getController();
       
         
        
        Scene Mainwindow = new Scene(login);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    
        window.setScene(Mainwindow);
        window.show();
    }
}
