package com.view;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Navigator {
  private Navigator() {
  }

  static final String INSERT_LAPTOP_BASIC_INFO = "InsertLaptopBasicInfoUI.fxml";
  static final String INSERT_LAPTOP_IMG = "InsertLaptopImageUI.fxml";
  static final String INSERT_LAPTOP_PRODUCT_DATA = "InsertLaptopProductDataUI.fxml";

  private FXMLLoader loader;
  private static Navigator navigator;

  private Stage stage;

  public static Navigator getInstance() {
    if (navigator == null) {
      navigator = new Navigator();
    }
    return navigator;
  }

  public void setStage(Stage stage) {
    this.stage = stage;
  }

  public Stage getStage() {
    return stage;
  }

  public void goToScene(String title, String url) throws IOException {
    loader = new FXMLLoader(getClass().getResource(url));
    Parent root = loader.load();
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.setTitle(title);
    if (!stage.isShowing()) {
      stage.show();
    }
  }

  public void goToInsertLaptopBasicInfo() throws IOException {
    goToScene("Add Product", INSERT_LAPTOP_BASIC_INFO);
  }

  public void goToInsertLaptopImage() throws IOException {
    goToScene("Add Product", INSERT_LAPTOP_IMG);
  }

  public void goToInsertLaptopProductData() throws IOException {
    goToScene("Add Product", INSERT_LAPTOP_PRODUCT_DATA);
  }

//  public void goToEditAccount(Account account) throws IOException {
//    goToScene("EditAccount", EDIT_ACCOUNT);
//    EditAccountController controller = loader.getController();
//    controller.loadData(account);
//  }
}
