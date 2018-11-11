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
 *
 * @author Karen
 */
public class PrivyFXMLController implements Initializable {
    
    @FXML
    private Button login_button;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TelasClientes.fxml"));
            Parent parent = loader.load();
            ((Stage)login_button.getScene().getWindow()).setScene(new Scene(parent));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }
    
    
}
