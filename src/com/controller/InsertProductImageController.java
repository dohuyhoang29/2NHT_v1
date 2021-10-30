package com.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class InsertProductImageController implements Initializable {
  @FXML
  private TextField txtSearch;

  @FXML
  private Label lbUsername;

  @FXML
  private ImageView imgProfile;

  @FXML
  private HBox dashBoard;

  @FXML
  private HBox addProduct;

  @FXML
  private VBox addProductContainer;

  @FXML
  private HBox addPhone;

  @FXML
  private HBox addLaptop;

  @FXML
  private HBox addTablet;

  @FXML
  private HBox addProduct1;

  @FXML
  private Button btnChooseImages;

  @FXML
  private Button btnPrevious;

  @FXML
  private Button btnNext;

  int count;

  @FXML
  void showAddProductMousePressed(MouseEvent event) {
    count++;
    if (count % 2 != 0) {
      addProductContainer.setVisible(true);
      addProductContainer.setManaged(true);
    } else {
      addProductContainer.setVisible(false);
      addProductContainer.setManaged(false);
    }
  }


  @Override
  public void initialize(URL location, ResourceBundle resources) {

  }
}
