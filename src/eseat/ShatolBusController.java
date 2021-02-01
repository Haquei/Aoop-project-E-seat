
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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;


public class ShatolBusController implements Initializable {

     @FXML private RadioButton A1;
     @FXML private RadioButton A2;
     @FXML private RadioButton A3;
     @FXML private RadioButton A4; 
     @FXML private RadioButton B1;
     @FXML private RadioButton B2;
     @FXML private RadioButton B3;
     @FXML private RadioButton B4;
     @FXML private RadioButton C1;
     @FXML private RadioButton C2;
     @FXML private RadioButton C3;
     @FXML private RadioButton C4;
     @FXML private RadioButton D1;
     @FXML private RadioButton D2;
     @FXML private RadioButton D3;
     @FXML private RadioButton D4;
     @FXML private RadioButton E1;
     @FXML private RadioButton E2;
     @FXML private RadioButton E3;
     @FXML private RadioButton E4;
     @FXML private RadioButton F1;
     @FXML private RadioButton F2;
     @FXML private RadioButton F3;
     @FXML private RadioButton F4; 
     @FXML private RadioButton G1;
     @FXML private RadioButton G2;
     @FXML private RadioButton G3;
     @FXML private RadioButton G4;
     @FXML private RadioButton H1;
     @FXML private RadioButton H2;
     @FXML private RadioButton H3;
     @FXML private RadioButton H4;
     @FXML private RadioButton I1;
     @FXML private RadioButton I2;
     @FXML private RadioButton I3;
     @FXML private RadioButton I4;
     @FXML private RadioButton I5;
     @FXML private RadioButton I6;
    
       
     private ToggleGroup radiobuttons;
     
      @FXML private ChoiceBox setTime;
      @FXML private Label output;
      @FXML private Label output2;
    
    
    
       @FXML
    void shatolbus(ActionEvent event) throws IOException {
        
        
        
         Parent login = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
        
        Scene Mainwindow = new Scene(login);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    
        window.setScene(Mainwindow);
        window.show();
    }
    
      
       @FXML
    void finaloutput(ActionEvent event) throws IOException {
        
        
        
         Parent login = FXMLLoader.load(getClass().getResource("finaloutput.fxml"));
        
        Scene Mainwindow = new Scene(login);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
    
        window.setScene(Mainwindow);
        window.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
         radiobuttons = new ToggleGroup();
       
      this.A1.setToggleGroup(radiobuttons);
      this.A2.setToggleGroup(radiobuttons);
      this.A3.setToggleGroup(radiobuttons);
      this.A4.setToggleGroup(radiobuttons);
      this.B1.setToggleGroup(radiobuttons);
      this.B2.setToggleGroup(radiobuttons);
      this.B3.setToggleGroup(radiobuttons);
      this.B4.setToggleGroup(radiobuttons);
      this.C1.setToggleGroup(radiobuttons);
      this.C2.setToggleGroup(radiobuttons);
      this.C3.setToggleGroup(radiobuttons);
      this.C4.setToggleGroup(radiobuttons);
      this.D1.setToggleGroup(radiobuttons);
      this.D2.setToggleGroup(radiobuttons);
      this.D3.setToggleGroup(radiobuttons);
      this.D4.setToggleGroup(radiobuttons);
      this.E1.setToggleGroup(radiobuttons);
      this.E2.setToggleGroup(radiobuttons);
      this.E3.setToggleGroup(radiobuttons);
      this.E4.setToggleGroup(radiobuttons);
      this.F1.setToggleGroup(radiobuttons);
      this.F2.setToggleGroup(radiobuttons);
      this.F3.setToggleGroup(radiobuttons);
      this.F4.setToggleGroup(radiobuttons);
      this.G1.setToggleGroup(radiobuttons);
      this.G2.setToggleGroup(radiobuttons);
      this.G3.setToggleGroup(radiobuttons);
      this.G4.setToggleGroup(radiobuttons);
      this.H1.setToggleGroup(radiobuttons);
      this.H2.setToggleGroup(radiobuttons);
      this.H3.setToggleGroup(radiobuttons);
      this.H4.setToggleGroup(radiobuttons);
      this.I1.setToggleGroup(radiobuttons);
      this.I2.setToggleGroup(radiobuttons);
      this.I3.setToggleGroup(radiobuttons);
      this.I4.setToggleGroup(radiobuttons);
      this.I5.setToggleGroup(radiobuttons);
      this.I6.setToggleGroup(radiobuttons);
      
      output.setText("");
      output2.setText("");
      setTime.getItems().add("Time:08:30 am");
      setTime.getItems().add("Time:09:30 pm");
      setTime.getItems().add("Time:010:30 pm");
      setTime.getItems().add("Time:01:30 pm");
      setTime.getItems().add("Time:02:30 pm");
      setTime.getItems().add("Time:03:30 pm");
      setTime.getItems().add("Time:04:30 pm");
       
    }  
    
    
     public void reserveSeat(ActionEvent event) throws IOException{
    
              
        output.setText(setTime.getValue().toString());
       
           
        if(this.radiobuttons.getSelectedToggle().equals(this.A1))
        {
            output2.setText("A1");
            FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("A1");
                     writer.newLine();
                    writer.close();
        }              
        
        if(this.radiobuttons.getSelectedToggle().equals(this.A2))
        {
            output2.setText("A2");
         FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("A2");
                     writer.newLine();
                     writer.close();
        
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.A3))
        {
            output2.setText("A3");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("A3");
                     writer.newLine();
                     writer.close();
            
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.A4))
        {
            output2.setText("A4");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("A4");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.B1))
        {
            output2.setText("B1");
             FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("B1");
                     writer.newLine();
                     writer.close();
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.B2))
        {
            output2.setText("B2");
            
            FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("B2");
                     writer.newLine();
                     writer.close(); 
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.B3))
        {
            output2.setText("B3");
            
             FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("B3");
                     writer.newLine();
                     writer.close();
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.B4))
        {
            output2.setText("B4");
         FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("B4");
                     writer.newLine();
                     writer.close();
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.C1))
        {
            output2.setText("C1");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("C1");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.C2))
        {
            output2.setText("C2");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("C2");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.C3))
        {
            output2.setText("C3");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("C3");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.C4))
        {
            output2.setText("C4");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("C4");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.D1))
        {
            output2.setText("D1");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("D1");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.D2))
        {
            output2.setText("D2");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("D2");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.D3))
        {
            output2.setText("D3");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("D3");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.D4))
        {
            output2.setText("D4");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("D4");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.E1))
        {
            output2.setText("E1");
            
             FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("E1");
                     writer.newLine();
                     writer.close();
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.E2))
        {
            output2.setText("E2");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("E2");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.E3))
        {
            output2.setText("E3");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("E3");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.E4))
        {
            output2.setText("E4");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("E4");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.F1))
        {
            output2.setText("F1");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("F1");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.F2))
        {
            output2.setText("F2");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("F2");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.F3))
        {
            output2.setText("F3");
           FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("F3");
                     writer.newLine();
                     writer.close();  
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.F4))
        {
            output2.setText("F4");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("F4");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.G1))
        {
            output2.setText("G1");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("G1");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.G2))
        {
            output2.setText("G2");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("G2");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.G3))
        {
            output2.setText("G3");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("G3");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.G4))
        {
            output2.setText("G4");
           FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("G4");
                     writer.newLine();
                     writer.close();  
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.H1))
        {
            output2.setText("H1");
           FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("H1");
                     writer.newLine();
                     writer.close();  
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.H2))
        {
            output2.setText("H2");
         FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("H2");
                     writer.newLine();
                     writer.close();
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.H3))
        {
            output2.setText("H3");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("H3");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.H4))
        {
            output2.setText("H4");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("H4");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.I1))
        {
            output2.setText("I1");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("I1");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.I2))
        {
            output2.setText("I2");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("I2");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.I3))
        {
            output2.setText("I3");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("I3");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.I4))
        {
            output2.setText("I4");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("I4");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.I5))
        {
            output2.setText("I5");
          FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("I5");
                     writer.newLine();
                     writer.close();   
        }
        if(this.radiobuttons.getSelectedToggle().equals(this.I6))
        {
            output2.setText("I6");
           FileWriter fw = new FileWriter("shatoldata.txt", true);
                    BufferedWriter writer = new BufferedWriter(fw);
                     writer.append("A2");
                     writer.newLine();
                     writer.close();  
        }
    }
     
   
    
}
