package com.view;

import com.controller.EditAccountController;
import com.controller.EditCategoryController;
import com.controller.ViewProctController;
import com.model.Account;
import com.model.Category;
import com.model.Product;
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
  static final String INSERT_PRODUCT = "InsertProductUI.fxml";
  static final String DASHBOARD = "DashboardUI.fxml";
  static final String PRODUCTS_LIST = "ProductsListUI.fxml";
  static final String LOGIN = "LoginUI.fxml";
  static final String REGISTER = "RegisterUI.fxml";
  static final String ACCOUNT_LIST = "AccountListUI.fxml";
  static final String INSERT_ACCOUNT = "InsertAccountUI.fxml";
  static final String EDIT_ACCOUNT = "EditAccountUI.fxml";
  static final String CATEGORY_LIST = "CategoryListUI.fxml";
  static final String INSERT_CATEGORY = "InsertCategoryUI.fxml";
  static final String EDIT_CATEGORY = "EditCategoryUI.fxml";
  static final String VIEW_PRODUCT = "ViewProductUI.fxml";

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

  public void goToInsertProduct() throws IOException {
    goToScene(PROJECT_NAME, INSERT_PRODUCT);
  }

  public void goToDashboard() throws IOException {
    goToScene(PROJECT_NAME, DASHBOARD);
  }

  public void goToProductsList() throws IOException {
    goToScene(PROJECT_NAME, PRODUCTS_LIST);
  }

  public void goToLogin() throws IOException {
    goToScene(PROJECT_NAME, LOGIN);
  }

  public void goToRegister() throws IOException {
    goToScene(PROJECT_NAME, REGISTER);
  }

  public void goToAccountList() throws IOException {
    goToScene(PROJECT_NAME, ACCOUNT_LIST);
  }

  public void goToInsertAccount() throws IOException {
    goToScene(PROJECT_NAME, INSERT_ACCOUNT);
  }

  public void goToEditAccount(Account account) throws IOException {
    goToScene(PROJECT_NAME, EDIT_ACCOUNT);
    EditAccountController editAccountController = loader.getController();
    editAccountController.setData(account);
  }

  public void goToCategoryList() throws IOException {
    goToScene(PROJECT_NAME, CATEGORY_LIST);
  }

  public void goToInsertCategory() throws IOException {
    goToScene(PROJECT_NAME, INSERT_CATEGORY);
  }

  public void goToEditCategory(Category category) throws IOException {
    goToScene(PROJECT_NAME, EDIT_CATEGORY);
    EditCategoryController controller = loader.getController();
    controller.setData(category);
  }

  public void goToViewProduct(Product product) throws IOException {
    goToScene(PROJECT_NAME, VIEW_PRODUCT);
    ViewProctController controller = loader.getController();
    controller.setData(product);
  }
}
