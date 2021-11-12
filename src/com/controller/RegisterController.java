package com.controller;


import com.helper.AccountDatabaseHelper;
import com.view.Navigator;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class RegisterController implements Initializable {

  ScaleTransition scaleTransition1;
  @FXML
  private TextField txtEmail;

  @FXML
  private TextField txtPhone;

  @FXML
  private TextField txtUsername;

  @FXML
  private TextField show_tf;

  @FXML
  private PasswordField txtPassword;

  @FXML
  private PasswordField txtConfirmPassword;

  @FXML
  private Button btnCreate;

  @FXML
  private TextField txtAddress;

  @FXML
  private RadioButton rdShowPass;

  String written_text;

  @Override
  public void initialize(URL url, ResourceBundle rb) {

  }

  @FXML
  void createUserAccount(ActionEvent event) throws IOException {
    if (txtPassword.getText().equalsIgnoreCase(txtConfirmPassword.getText())) {
      AccountDatabaseHelper.insertAccount(txtUsername.getText(), txtEmail.getText(), txtPassword.getText(), "USER", txtAddress.getText(), txtPhone.getText());
      Navigator.getInstance().goToLogin();
    }
  }

  @FXML
  void show_Password() {
    if (rdShowPass.isSelected() == true) {
      written_text = txtPassword.getText();
      txtPassword.setVisible(false);
      show_tf.setVisible(true);
      show_tf.setText(written_text);
    } else {
      written_text = show_tf.getText();
      show_tf.setVisible(false);
      txtPassword.setVisible(true);

      txtPassword.setText(written_text);
    }

  }

  @FXML
  private void handleOnMouseEntered(MouseEvent event) {
    Node source = (Node) event.getSource();

    scaleTransition1 = new ScaleTransition(Duration.millis(200), source);
    scaleTransition1.setCycleCount(1);
    scaleTransition1.setToX(1.2);
    scaleTransition1.setToY(1.2);
    scaleTransition1.playFromStart();
  }

  @FXML
  private void handleOnMouseExited(MouseEvent event) {
    Node source = (Node) event.getSource();

    scaleTransition1 = new ScaleTransition(Duration.millis(200), source);
    scaleTransition1.setCycleCount(1);
    scaleTransition1.setToX(1);
    scaleTransition1.setToY(1);

    scaleTransition1.playFromStart();
  }
}
