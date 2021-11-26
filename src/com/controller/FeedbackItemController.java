package com.controller;

import com.model.Account;
import com.model.Feedback;
import com.model.Product;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class FeedbackItemController {

  @FXML
  private Label username;

  @FXML
  private Label date;

  @FXML
  private HBox pointBox;

  @FXML
  private Label feedback;

  public void setData (Feedback feedback) {
    username.setText(feedback.getUsername());
    date.setText(feedback.getDateProperty());
    this.feedback.setText(feedback.getFeedback());
  }

}
