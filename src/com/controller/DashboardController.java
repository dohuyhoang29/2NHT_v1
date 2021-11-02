package com.controller;

import com.view.Navigator;
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
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
    private ImageView changeLanguage;

    @FXML
    private VBox changeLanguageContainer;

    @FXML
    private HBox dashboard;

    @FXML
    private ImageView imgdashboard;

    @FXML
    private Label lbdashboard;

    @FXML
    private Label monthlyEarnings;

    @FXML
    private Label numberOfSales;

    @FXML
    private PieChart pcSalesAnalytics;

    @FXML
    private AreaChart<Number, Number> acRevenue;

    @FXML
    private Label saleRevenue;

    @FXML
    private TextField txtSearch;

    @FXML
    private Label username;

    @FXML
    private Label weeklyEarnings;

    @FXML
    private void showAddProductMousePressed (MouseEvent mouseEvent) {
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
    private void goToAddPhone(MouseEvent mouseEvent) throws IOException {
        Navigator.getInstance().goToInsertPhoneBasicInfo();
    }

    @FXML
    private void goToAddLaptop(MouseEvent mouseEvent) throws IOException {
        Navigator.getInstance().goToInsertLaptopBasicInfo();
    }

    @FXML
    private void goToAddTablet(MouseEvent mouseEvent) throws IOException {
        Navigator.getInstance().goToInsertTabletBasicInfo();
    }

    int count;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Phone", 30),
                new PieChart.Data("Laptop", 30),
                new PieChart.Data("Tablet", 30)
        );
        pcSalesAnalytics.setData(pieChartData);

        final NumberAxis xAxis = new NumberAxis(1, 12, 1);
        xAxis.setLabel("abc");
        final NumberAxis yAxis = new NumberAxis();
        acRevenue = new AreaChart<Number, Number>(xAxis, yAxis);

        XYChart.Series<Number, Number> series2014 = new XYChart.Series<Number, Number>();

        series2014.setName("2014");

        series2014.getData().add(new XYChart.Data<Number, Number>(1, 400));
        series2014.getData().add(new XYChart.Data<Number, Number>(3, 1000));
        series2014.getData().add(new XYChart.Data<Number, Number>(4, 1500));
        series2014.getData().add(new XYChart.Data<Number, Number>(5, 800));
        series2014.getData().add(new XYChart.Data<Number, Number>(7, 500));
        series2014.getData().add(new XYChart.Data<Number, Number>(8, 1800));
        series2014.getData().add(new XYChart.Data<Number, Number>(10, 1500));
        series2014.getData().add(new XYChart.Data<Number, Number>(12, 1300));

        XYChart.Series<Number, Number> series2015 = new XYChart.Series<Number, Number>();
        series2015.setName("2015");
        series2015.getData().add(new XYChart.Data<Number, Number>(1, 2000));
        series2015.getData().add(new XYChart.Data<Number, Number>(3, 1500));
        series2015.getData().add(new XYChart.Data<Number, Number>(4, 1300));
        series2015.getData().add(new XYChart.Data<Number, Number>(5, 1200));
        series2015.getData().add(new XYChart.Data<Number, Number>(7, 1400));
        series2015.getData().add(new XYChart.Data<Number, Number>(8, 1080));
        series2015.getData().add(new XYChart.Data<Number, Number>(10, 2050));
        series2015.getData().add(new XYChart.Data<Number, Number>(12, 2005));

        acRevenue.getData().addAll(series2014, series2015);
    }
}
