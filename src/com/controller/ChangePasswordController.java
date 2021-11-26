package com.controller;

import com.helper.AccountDatabaseHelper;
import com.helper.ProjectManager;
import com.view.Navigator;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ChangePasswordController {
  @FXML
  private TextField showCurrentPassword;

  @FXML
  private PasswordField currentPassword;

  @FXML
  private PasswordField confirmPassword;

  @FXML
  private RadioButton show_password_btn;

  @FXML
  private Label errUsername;

  @FXML
  private Label errPassword;

  @FXML
  private TextField showNewPassword;

  @FXML
  private TextField showConfirmPassword;

  @FXML
  private PasswordField newPassword;

  String currentPasswordText;
  String newPasswordText;
  String confirmPasswordText;

  @FXML
  void back(MouseEvent event) throws IOException {
    Navigator.getInstance().goToProfile();
  }

  @FXML
  void goToLogin(MouseEvent event) {
    if (currentPassword.getText().equalsIgnoreCase(ProjectManager.getInstance().getAccount().getPassword())) {
      if (newPassword.getText().equalsIgnoreCase(confirmPassword.getText())) {
        AccountDatabaseHelper.changePassword(newPassword.getText(), ProjectManager.getInstance().getAccount().getId());
      }
    }
  }

  @FXML
  void show_Password(ActionEvent event) {
    if(show_password_btn.isSelected()==true){
      currentPasswordText= currentPassword.getText();
      newPasswordText= newPassword.getText();
      confirmPasswordText= confirmPassword.getText();

      currentPassword.setVisible(false);
      showCurrentPassword.setVisible(true);

      newPassword.setVisible(false);
      showNewPassword.setVisible(true);

      confirmPassword.setVisible(false);
      showConfirmPassword.setVisible(true);

      showCurrentPassword.setText(currentPasswordText);
      showNewPassword.setText(newPasswordText);
      showConfirmPassword.setText(confirmPasswordText);
    }
    else {
      currentPasswordText= showCurrentPassword.getText();
      newPasswordText= showNewPassword.getText();
      confirmPasswordText= showConfirmPassword.getText();

      showCurrentPassword.setVisible(false);
      currentPassword.setVisible(true);

      showNewPassword.setVisible(false);
      newPassword.setVisible(true);

      showConfirmPassword.setVisible(false);
      confirmPassword.setVisible(true);

      currentPassword.setText(currentPasswordText);
      newPassword.setText(newPasswordText);
      confirmPassword.setText(confirmPasswordText);
    }
  }
}
