package com.controller;

import com.helper.CategoryDatabaseHelper;
import com.helper.ProductDatabaseHelper;
import com.helper.ProductManager;
import com.helper.ValidationManager;
import com.model.Category;
import com.view.Navigator;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

public class InsertProductController implements Initializable {

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
  private HBox addProduct;

  @FXML
  private HBox productsList;

  @FXML
  private VBox changeLanguageContainer;

  @FXML
  private VBox basicInfo;

  @FXML
  private TextField txtProductCode;

  @FXML
  private Label errProductCode;

  @FXML
  private TextField txtProductName;

  @FXML
  private Label errProductName;

  @FXML
  private ChoiceBox<String> cbCategory;

  @FXML
  private Label errProductCategory;

  @FXML
  private TextField txtImportPrice;

  @FXML
  private Label errImportPrice;

  @FXML
  private TextField txtPrice;

  @FXML
  private Label errPrice;

  @FXML
  private TextField txtOrigin;

  @FXML
  private DatePicker dpImportDate;

  @FXML
  private Label errImportDate;

  @FXML
  private Button btnNextBasicInfo;

  @FXML
  private VBox productImages;

  @FXML
  private Button btnChooseImages;

  @FXML
  private TextArea txtAreaImgSrc;

  @FXML
  private TextField txtColor;

  @FXML
  private Label errColor;

  @FXML
  private TextField txtQuantity;

  @FXML
  private TextField txtHardDrive;

  @FXML
  private Label errHardDrive;

  @FXML
  private Button btnPreviousProductImg;

  @FXML
  private Button btnNextProductImg;

  @FXML
  private VBox productData;

  @FXML
  private TextField txtCpu;

  @FXML
  private TextField txtGpu;

  @FXML
  private TextField txtRam;

  @FXML
  private TextField txtScreen;

  @FXML
  private TextField txtRearCamera;

  @FXML
  private TextField txtSelfieCamera;

  @FXML
  private TextField txtDimensions;

  @FXML
  private TextField txtBatteryCapacity;

  @FXML
  private TextField txtSim;

  @FXML
  private TextField txtOperatingSystem;

  @FXML
  private TextField txtWeight;

  @FXML
  private Button btnPreviousProductData;

  @FXML
  private Button btnSave;

  //Dieu huong
  @FXML
  private void goToDashboard(MouseEvent mouseEvent) throws IOException {
    Navigator.getInstance().goToDashboard();
  }

  @FXML
  private void goToProductList(MouseEvent mouseEvent) throws IOException {
    Navigator.getInstance().goToProductsList();
  }

  @FXML
  private void goToInsertProduct(MouseEvent mouseEvent) throws IOException {
    Navigator.getInstance().goToInsertProduct();
  }

  @FXML
  private void setBtnNextBasicInfo(MouseEvent mouseEvent) {
    ValidationManager check = ValidationManager.getInstance();

    if(basicInfo.isVisible()) {
      int count = 0;
      if(txtProductCode.getText().isEmpty()) {
        errProductCode.setText("Product's code is required");
        count++;
      }else errProductCode.setText("");

      if(txtProductName.getText().isEmpty()) {
        errProductName.setText("Product's name is required");
        count++;
      }else errProductName.setText("");

      if(cbCategory.getValue() == null) {
        errProductCategory.setText("Product's category is required");
        count++;
      }else errProductCategory.setText("");

      if(txtImportPrice.getText().isEmpty()) {
        errImportPrice.setText("Product's import price is required");
        count++;
      }else if(!check.isPositiveNumber(txtImportPrice.getText())) {
        errImportPrice.setText("Product's import price must be a positive number");
        count++;
      }else errImportPrice.setText("");

      if(txtPrice.getText().isEmpty()) {
        errPrice.setText("Product's price is required");
        count++;
      }else if(!check.isPositiveNumber(txtPrice.getText())) {
        errPrice.setText("Product's price must be a positive number");
        count++;
      }else errPrice.setText("");

      if(dpImportDate.getValue() == null) {
        errImportDate.setText("Product's import date is required");
        count++;
      }else errImportDate.setText("");

      if(count == 0)
        productImages.setVisible(true);
    }
  }

  @FXML
  private void setBtnNextProductImg(MouseEvent mouseEvent) {
    if(productImages.isVisible()) {
      int count = 0;
      if(txtColor.getText().isEmpty()) {
        errColor.setText("Product's color is required");
        count++;
      }
      else errColor.setText("");

      if(txtHardDrive.getText().isEmpty()) {
        errHardDrive.setText("Hard drive is required");
        count++;
      }
      else errHardDrive.setText("");

      if(count == 0) productData.setVisible(true);
    }
  }

  @FXML
  private void setBtnPreviousProductImg(MouseEvent mouseEvent) {
    productImages.setVisible(false);
    basicInfo.setVisible(true);
  }

  @FXML
  private void setBtnPreviousProductData(MouseEvent mouseEvent) {
    productData.setVisible(false);
    productImages.setVisible(true);
  }

  //Actions
  @FXML
  private void clickSave() throws IOException {
    Category category = CategoryDatabaseHelper.getCategoryByName(cbCategory.getValue());
    ProductDatabaseHelper.insertLaptop(category.getId(), txtProductCode.getText(),
        txtProductName.getText(), dpImportDate.getValue(),
        Integer.parseInt(txtImportPrice.getText()), Integer.parseInt(txtPrice.getText()),
        txtHardDrive.getText(), txtOrigin.getText(), Integer.parseInt(txtQuantity.getText()),
        txtColor.getText(), txtAreaImgSrc.getText(), txtScreen.getText(), txtCpu.getText(),
        txtGpu.getText(), txtRam.getText(), txtOperatingSystem.getText(), txtRearCamera.getText(),
        txtSelfieCamera.getText(), txtBatteryCapacity.getText(), txtSim.getText(),
        txtDimensions.getText(), txtWeight.getText());
//    Navigator.getInstance().goToInsertProduct();
  }

  @FXML
  private void showChangeLanguageMousePressed(MouseEvent mouseEvent) {
    count++;
    if (count % 2 != 0) {
      changeLanguageContainer.setVisible(true);
    } else {
      changeLanguageContainer.setVisible(false);
    }
  }

  @FXML
  void clickChooseImage(MouseEvent mouseEvent) {
    imgSrc = fileChooser.showOpenDialog(Navigator.getInstance().getStage());
    if (imgSrc != null) {
      printListSrc(txtAreaImgSrc, imgSrc);
    }
  }

  private void printListSrc(TextArea textArea, File file) {
    if (file == null) {
      return;
    }

    textArea.setText(file.getAbsolutePath());
  }

  int count;
  private File imgSrc;
  final FileChooser fileChooser = new FileChooser();

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    List<Category> listCate = CategoryDatabaseHelper.getAllCategories();
    for (Category c : listCate) {
      cbCategory.getItems().add(c.getName());
    }
  }
}
