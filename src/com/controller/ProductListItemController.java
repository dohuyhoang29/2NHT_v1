package com.controller;

import com.model.Product;
import com.view.Navigator;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class ProductListItemController {
  @FXML
  private HBox productListItem;

  @FXML
  private Label code;

  @FXML
  private ImageView imgSrc;

  @FXML
  private Label name;

  @FXML
  private Label category;

  @FXML
  private Label quantity;

  @FXML
  private Label importPrice;

  @FXML
  private Label price;

  @FXML
  private Label importDate;

  @FXML
  private Label status;

  @FXML
  private ImageView view;

  @FXML
  private ImageView edit;

  @FXML
  private ImageView delete;

  Product product;

  public void setData(Product product) {
    this.product = product;
    Image image = new Image(getClass().getResourceAsStream("/com/images/" + product.getImgSrc()));
    imgSrc.setImage(image);
    code.setText(product.getProductCode());
    name.setText(product.getProductName());
    category.setText(product.getCategoryName());
    quantity.setText(product.getQuantity().toString());
    importPrice.setText(product.getImportPrice().toString());
    price.setText(product.getPrice().toString());
    importDate.setText(product.getWarrantyPeriod().toString());
    if (product.getQuantity() > 0) {
      status.setText("Stocking");
    }
    if (product.getQuantity() == 0) {
      status.setText("Sold out");
    }
  }

  @FXML
  void viewProduct() throws IOException {
    Navigator.getInstance().goToViewProduct(product);
  }
}
