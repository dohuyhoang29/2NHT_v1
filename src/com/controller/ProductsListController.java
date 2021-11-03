package com.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class ProductsListController implements Initializable {
    @FXML
    private HBox addLaptop;

    @FXML
    private HBox addPhone;

    @FXML
    private HBox addProduct2;

    @FXML
    private VBox addProductContainer;

    @FXML
    private HBox addTablet;

    @FXML
    private Button btnSearch;

    @FXML
    private ChoiceBox<?> cbCategory;

    @FXML
    private ChoiceBox<?> cbStatus;

    @FXML
    private ImageView changeLanguage;

    @FXML
    private VBox changeLanguageContainer;

    @FXML
    private HBox dashboard;

    @FXML
    private HBox delete;

    @FXML
    private DatePicker dpImportDate;

    @FXML
    private HBox edit;

    @FXML
    private ImageView imgdashboard;

    @FXML
    private Label lbdashboard;

    @FXML
    private HBox productList;

    @FXML
    private TableView<?> tbProduct;

    @FXML
    private TableColumn<?, ?> tcID;

    @FXML
    private TableColumn<?, ?> tcImportDate;

    @FXML
    private TableColumn<?, ?> tcImportPrice;

    @FXML
    private TableColumn<?, ?> tcManufacturerName;

    @FXML
    private TableColumn<?, ?> tcPrice;

    @FXML
    private TableColumn<?, ?> tcProductName;

    @FXML
    private TableColumn<?, ?> tcStatus;

    @FXML
    private TextField txtSearch;

    @FXML
    private TextField txtSearchProduct;

    @FXML
    private Label username;

    @FXML
    private HBox view;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
