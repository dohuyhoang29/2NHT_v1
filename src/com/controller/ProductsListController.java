package com.controller;

import com.helper.ProductDatabaseHelper;
import com.model.Product;
import com.view.Navigator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class ProductsListController implements Initializable {

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
  private ChoiceBox<String> cpCategroy;

  @FXML
  private ChoiceBox<String> cbStatus;

  @FXML
  private TextField txtName;

  @FXML
  private DatePicker dpFrom;

  @FXML
  private DatePicker dpTo;

  @FXML
  private Button btnSearch;

  @FXML
  private VBox itemLayout;

  int count;

  private List<Product> listData = new ArrayList<>();
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    listData = ProductDatabaseHelper.getAllProduct();
    System.out.println(listData.size());
    try {
      for (Product p : listData) {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/com/view/ProductListItemUI.fxml"));
        HBox hBox = fxmlLoader.load();
        ProductListItemController productListItemController = fxmlLoader.getController();
        productListItemController.setData(p);
        itemLayout.getChildren().add(hBox);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @FXML
  private void showChangeLanguageMousePressed(MouseEvent mouseEvent) {
    //Hanh dong
    count++;
    if (count % 2 != 0) {
      changeLanguageContainer.setVisible(true);
    } else {
      changeLanguageContainer.setVisible(false);
    }
  }

  //Dieu huong
  @FXML
  private void goToInsertProduct(MouseEvent mouseEvent) throws IOException {
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

  @FXML
  private void goToCategoryList(MouseEvent mouseEvent) throws IOException {
    Navigator.getInstance().goToCategoryList();
  }
}
