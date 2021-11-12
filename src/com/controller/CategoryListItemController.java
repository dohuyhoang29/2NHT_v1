package com.controller;

import com.model.Category;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

public class CategoryListItemController {
  @FXML
  private HBox productListItem;

  @FXML
  private Label name;

  @FXML
  private Label description;

  @FXML
  private Label quantity;

  @FXML
  private ImageView view;

  @FXML
  private ImageView edit;

  @FXML
  private ImageView delete;

  private Category category;

  public void setData (Category category) {
    this.category = category;
    name.setText(category.getName());
    description.setText(category.getDescription());
  }

  @FXML
  void deleteCategory(MouseEvent event) {

  }

  @FXML
  void editCategory(MouseEvent event) {

  }
}
