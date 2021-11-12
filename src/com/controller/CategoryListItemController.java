package com.controller;

import com.helper.CategoryDatabaseHelper;
import com.model.Category;
import com.view.Navigator;
import java.io.IOException;
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
  void deleteCategory(MouseEvent event) throws IOException {
    CategoryDatabaseHelper.deleteCategory(category.getId());
    Navigator.getInstance().goToCategoryList();
  }

  @FXML
  void editCategory(MouseEvent event) throws IOException {
    Navigator.getInstance().goToEditCategory(category);
  }
}
