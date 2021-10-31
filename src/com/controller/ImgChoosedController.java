package com.controller;

import com.model.Laptop;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

public class ImgChoosedController implements Initializable {
  @FXML
  private HBox boxImgChooseSrc;

  @FXML
  private ImageView imgChooseSrc;

  public void setData (String src) {
    Image image = new Image(getClass().getResourceAsStream(src));

    imgChooseSrc.setImage(image);
  }

  @Override
  public void initialize(URL location, ResourceBundle resources) {

  }
}
