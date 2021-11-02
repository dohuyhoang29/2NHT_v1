package com.controller;

import com.view.Navigator;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class InsertLaptopBasicInfoController implements Initializable {
  @FXML
  private VBox changeLanguageContainer;

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
  private VBox addProductContainer;

  @FXML
  private HBox addPhone;

  @FXML
  private HBox addLaptop;

  @FXML
  private HBox addTablet;

  @FXML
  private TextField txtProductCode;

  @FXML
  private TextField txtProductName;

  @FXML
  private ChoiceBox<String> cbManufacturer;

  @FXML
  private TextField txtImportPrice;

  @FXML
  private TextField txtPrice;

  @FXML
  private TextField txtOrigin;

  @FXML
  private TextField txtImportDate;

  @FXML
  private Button btnNext;

  @FXML
  private void clickNext() throws IOException {
    Navigator.getInstance().goToInsertLaptopImage();
  }

  @FXML
  private void showAddProductMousePressed (MouseEvent mouseEvent) {
    count++;
    if (count % 2 != 0) {
      addProductContainer.setVisible(true);
      addProductContainer.setManaged(true);
    } else {
      addProductContainer.setVisible(false);
      addProductContainer.setManaged(false);
    }
  }

  @FXML
  private void showChangeLanguageMousePressed (MouseEvent mouseEvent) {
    count++;
    if (count % 2 != 0) {
      changeLanguageContainer.setVisible(true);
    } else {
      changeLanguageContainer.setVisible(false);
    }
  }

  int count;

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    addProductContainer.setManaged(false);
    cbManufacturer.getItems().add("Apple");
    cbManufacturer.getItems().add("Asus");
    cbManufacturer.getItems().add("Dell");
    cbManufacturer.getItems().add("Acer");
    cbManufacturer.getItems().add("HP");
    cbManufacturer.getItems().add("Lenovo");
    cbManufacturer.getItems().add("Microsoft");
    cbManufacturer.getItems().add("MSI");
    cbManufacturer.getItems().add("Avita");
    cbManufacturer.getItems().add("Gigabyte");
    cbManufacturer.getItems().add("Fujitsu");
  }
}
