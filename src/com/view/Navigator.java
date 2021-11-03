package com.view;

import java.io.IOException;

import com.helper.TranslateManager;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Navigator {
  private Navigator() {
  }
  static final String PROJECT_NAME = "2NHT";
  static final String INSERT_LAPTOP_BASIC_INFO = "InsertLaptopBasicInfoUI.fxml";
  static final String INSERT_LAPTOP_IMG = "InsertLaptopImageUI.fxml";
  static final String INSERT_LAPTOP_PRODUCT_DATA = "InsertLaptopProductDataUI.fxml";
  static final String INSERT_PHONE_BASIC_INFO = "InsertPhoneBasicInfoUI.fxml";
  static final String INSERT_PHONE_IMG = "InsertPhoneImageUI.fxml";
  static final String INSERT_PHONE_PRODUCT_DATA = "InsertPhoneProductDataUI.fxml";
  static final String INSERT_TABLET_BASIC_INFO = "InsertTabletBasicInfoUI.fxml";
  static final String INSERT_TABLET_IMG = "InsertTabletImageUI.fxml";
  static final String INSERT_TABLET_PRODUCT_DATA = "InsertTabletProductDataUI.fxml";
  static final String DASHBOARD = "DashboardUI.fxml";

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
    loader = new FXMLLoader(getClass().getResource(url), TranslateManager.getRb());
    Parent root = loader.load();
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.setTitle(title);
    if (!stage.isShowing()) {
      stage.show();
    }
  }

  public void goToInsertLaptopBasicInfo() throws IOException {
    goToScene(PROJECT_NAME, INSERT_LAPTOP_BASIC_INFO);
  }

  public void goToInsertLaptopImage() throws IOException {
    goToScene(PROJECT_NAME, INSERT_LAPTOP_IMG);
  }

  public void goToInsertLaptopProductData() throws IOException {
    goToScene(PROJECT_NAME, INSERT_LAPTOP_PRODUCT_DATA);
  }

  public void goToInsertPhoneBasicInfo() throws IOException {
    goToScene(PROJECT_NAME, INSERT_PHONE_BASIC_INFO);
  }

  public void goToInsertPhoneImage() throws IOException {
    goToScene(PROJECT_NAME, INSERT_PHONE_IMG);
  }

  public void goToInsertPhoneProductData() throws IOException {
    goToScene(PROJECT_NAME, INSERT_PHONE_PRODUCT_DATA);
  }

  public void goToInsertTabletBasicInfo() throws IOException {
    goToScene(PROJECT_NAME, INSERT_TABLET_BASIC_INFO);
  }

  public void goToInsertTabletImage() throws IOException {
    goToScene(PROJECT_NAME, INSERT_TABLET_IMG);
  }

  public void goToInsertTabletProductData() throws IOException {
    goToScene(PROJECT_NAME, INSERT_TABLET_PRODUCT_DATA);
  }

  public void goToDashboard() throws IOException {
    goToScene(PROJECT_NAME, DASHBOARD);
  }


//  public void goToEditAccount(Account account) throws IOException {
//    goToScene("EditAccount", EDIT_ACCOUNT);
//    EditAccountController controller = loader.getController();
//    controller.loadData(account);
//  }
}
