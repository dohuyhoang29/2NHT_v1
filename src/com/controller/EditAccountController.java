package com.controller;

import com.helper.AccountDatabaseHelper;
import com.model.Account;
import com.view.Navigator;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class EditAccountController implements Initializable {
  @FXML
  private TextField txtSearch;

  @FXML
  private ImageView changeLanguage;

  @FXML
  private Label username;

  @FXML
  private HBox dashboard;

  @FXML
  private ImageView imgdashboard;

  @FXML
  private Label lbdashboard;

  @FXML
  private HBox addProduct2;

  @FXML
  private HBox productsList;

  @FXML
  private VBox changeLanguageContainer;

  @FXML
  private TextField txtUsername;

  @FXML
  private TextField txtEmail;

  @FXML
  private TextField txtAddress;

  @FXML
  private PasswordField pfPassword;

  @FXML
  private PasswordField pfConfirmPassword;

  @FXML
  private ChoiceBox<String> cbType;

  @FXML
  private TextField txtPhoneNumber;

  @FXML
  private Button btnSave;

  private int count;
  private Account acc;

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    cbType.getItems().add("ADMIN");
    cbType.getItems().add("USER");
    cbType.getItems().add("STAFF");

  }

  public void setData(Account account) {
    this.acc = account;
    txtUsername.setText(account.getUsername());
    txtEmail.setText(account.getEmail());
    pfPassword.setText(account.getPassword());
    pfConfirmPassword.setText(account.getPassword());
    if (account.getAddress() != null) {
      txtAddress.setText(account.getAddress());
    }
    cbType.setValue(account.getType());
    txtPhoneNumber.setText(account.getPhone());
  }

  //Hanh dong
  @FXML
  private void showChangeLanguageMousePressed (MouseEvent mouseEvent) {
    count++;
    if (count % 2 != 0) {
      changeLanguageContainer.setVisible(true);
    } else {
      changeLanguageContainer.setVisible(false);
    }
  }

  @FXML
  void editAccount(ActionEvent event) throws IOException {
    if (pfPassword.getText().equalsIgnoreCase(pfConfirmPassword.getText())) {
      AccountDatabaseHelper.editAccount(txtUsername.getText(), txtEmail.getText(), pfPassword.getText(), cbType.getValue(), txtAddress.getText(), txtPhoneNumber.getText(), acc.getId());
      Navigator.getInstance().goToAccountList();
    }
  }

  //Dieu Huong
  @FXML
  private void goToInsertProduct (MouseEvent mouseEvent) throws IOException {
    Navigator.getInstance().goToInsertProduct();
  }

  @FXML
  private void goToDashboard(MouseEvent mouseEvent) throws IOException {
    Navigator.getInstance().goToDashboard();
  }

  @FXML
  private void goToProductList(MouseEvent mouseEvent) throws IOException {
    Navigator.getInstance().goToProductsList();
  }

  @FXML
  private void goToAccountList(MouseEvent mouseEvent) throws IOException {
    Navigator.getInstance().goToAccountList();
  }
}