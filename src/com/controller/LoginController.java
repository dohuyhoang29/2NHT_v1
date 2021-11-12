/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;



import com.helper.AccountDatabaseHelper;
import com.model.Account;
import com.sun.glass.ui.Window;
import com.view.Navigator;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author KIYA
 */
public class LoginController implements Initializable {

    /**
     * Initializes the controller class.
     */
    ScaleTransition scaleTransition1;
    @FXML
    
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private RadioButton show_password_btn;
    @FXML
    private TextField texfield11;
    
    String written_text;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void goToDashBoard() throws IOException {
        Account account = AccountDatabaseHelper.getAccountByUsernameOrEmail(username.getText());
        if (username.getText().equalsIgnoreCase(account.getUsername()) || username.getText().equalsIgnoreCase(account.getEmail())) {
            if (password.getText().equalsIgnoreCase(account.getPassword())) {
                Navigator.getInstance().goToDashboard();
            }
        }
    }
    
    @FXML
    void show_Password(){
        if(show_password_btn.isSelected()==true){
            written_text= password.getText();
            password.setVisible(false);
            texfield11.setVisible(true);
            texfield11.setText(written_text);
        }
        else {
            written_text=texfield11.getText();
            texfield11.setVisible(false);
            password.setVisible(true);
            
            password.setText(written_text);
        }
        
    }
    
    @FXML
    void goToRegister() throws IOException {
        Navigator.getInstance().goToRegister();
    }
    @FXML
    private void handleOnMouseEntered(MouseEvent event)
    {
        Node source=(Node)event.getSource();
       
        scaleTransition1 = new ScaleTransition(Duration.millis(200),source);
        scaleTransition1.setCycleCount(1);
        scaleTransition1.setToX(1.2);
        scaleTransition1.setToY(1.2);
        scaleTransition1.playFromStart();
    }
   @FXML
    private void handleOnMouseExited(MouseEvent event)
    {
        Node source=(Node)event.getSource();
        
       scaleTransition1 = new ScaleTransition(Duration.millis(200),source);
        scaleTransition1.setCycleCount(1);
        scaleTransition1.setToX(1);
        scaleTransition1.setToY(1);
        
        scaleTransition1.playFromStart();
    }
}
