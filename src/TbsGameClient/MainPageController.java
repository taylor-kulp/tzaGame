/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TbsGameClient;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Taylor
 */
public class MainPageController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void onNewGameClick(ActionEvent event) {
        System.out.println("Starting new game");
        label.setText("New Game Clicked!");
    }
    
    @FXML
    private void onLoadGameClick(ActionEvent event) {
        System.out.println("Loading game");
        label.setText("Load Game Clicked!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
