/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privyfxml_aasp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Karen
 */
public class TelasClientesController implements Initializable {
    @FXML
    private Button connect0;
    @FXML
    private Button connect1;
    @FXML
    private Button connect2;
    @FXML
    private Button new_channel;
            
     @FXML
    private void connectButtonAction(ActionEvent event) throws IOException {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TelaConversa.fxml"));
            Parent parent = loader.load();
            ((Stage)connect0.getScene().getWindow()).setScene(new Scene(parent));
    }    
    
    @FXML
    private void newChannelButtonAction(ActionEvent event) throws IOException {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(""));
            Parent parent = loader.load();
            ((Stage)new_channel.getScene().getWindow()).setScene(new Scene(parent));
    }
            
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
