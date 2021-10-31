package com.controller;

import com.model.Laptop;
import com.view.Navigator;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class InsertLaptopImageController implements Initializable {
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
  private Button btnChooseImages;

  @FXML
  private HBox imgChoosed;

  @FXML
  private HBox imgChoosedLayout;

  @FXML
  private Button btnNext;

  @FXML
  private void clickNext() throws IOException {
    Navigator.getInstance().goToInsertLaptopProductData();
  }

  @FXML
  private void clickPrevious() throws IOException {
    Navigator.getInstance().goToInsertLaptopBasicInfo();
  }

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
  void clickChooseImage(ActionEvent event) {

  }

//  private List<Laptop> list;

  @Override
  public void initialize(URL location, ResourceBundle resources) {
//    list = new ArrayList<>(list());

//    for (int i = 0; i < list.size(); i++) {
//      try {
//        FXMLLoader fxmlLoader = new FXMLLoader();
//        fxmlLoader.setLocation(getClass().getResource("/com/view/imgChoosedUI.fxml"));
//        HBox imgBox = fxmlLoader.load();
//        ImgChoosedController imgChoosedController = fxmlLoader.getController();
//        imgChoosedController.setData(list.get(i).getImgSrc());
//        imgChoosedLayout.getChildren().add(imgBox);
//      } catch (IOException e) {
//        e.printStackTrace();
//      }
//    }
  }

//  private List<Laptop> list() {
//    List<Laptop> listAdd = new ArrayList<>();
//    Laptop laptop = new Laptop();
//    laptop.setImgSrc("/com/images/iphone-13-pro-max-bac.jpg");
//    listAdd.add(laptop);
//
//    laptop = new Laptop();
//    laptop.setImgSrc("/com/images/iphone-13-pro-max-bac.jpg");
//    listAdd.add(laptop);
//
//    laptop = new Laptop();
//    laptop.setImgSrc("/com/images/iphone-13-pro-max-bac.jpg");
//    listAdd.add(laptop);
//
//    laptop = new Laptop();
//    laptop.setImgSrc("/com/images/iphone-13-pro-max-bac.jpg");
//    listAdd.add(laptop);
//
//    laptop = new Laptop();
//    laptop.setImgSrc("/com/images/iphone-13-pro-max-bac.jpg");
//    listAdd.add(laptop);
//
//    return listAdd;
//  }
}