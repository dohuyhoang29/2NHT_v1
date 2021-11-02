package com.controller;

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
    private StackedAreaChart<?, ?> sacRevenue;

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

    int count;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ObservableList<PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Phone", 30),
                new PieChart.Data("Laptop", 30),
                new PieChart.Data("Tablet", 30)
        );
        pcSalesAnalytics.setData(pieChartData);

        CategoryAxis xAxis = new CategoryAxis();
//        xAxis.setCategories(FXCollections.<String>observableArrayList(
//                Arrays.asList("1750", "1800", "1850", "1900", "1950", "1999", "2050" )));

        NumberAxis yAxis = new NumberAxis(0, 10000, 2500);
        yAxis.setLabel("Population in Millions");
        sacRevenue = new StackedAreaChart(xAxis, yAxis);
//
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Asia");
        series1.getData().add(new XYChart.Data("1750", 502));
        series1.getData().add(new XYChart.Data("1800", 635));
        series1.getData().add(new XYChart.Data("1850", 809));
        series1.getData().add(new XYChart.Data("1900", 947));
        series1.getData().add(new XYChart.Data("1950", 1402));
        series1.getData().add(new XYChart.Data("1999", 3634));
        series1.getData().add(new XYChart.Data("2050", 5268));

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Africa");
        series2.getData().add(new XYChart.Data("1750", 106));
        series2.getData().add(new XYChart.Data("1800", 107));
        series2.getData().add(new XYChart.Data("1850", 111));
        series2.getData().add(new XYChart.Data("1900", 133));
        series2.getData().add(new XYChart.Data("1950", 221));
        series2.getData().add(new XYChart.Data("1999", 767));
        series2.getData().add(new XYChart.Data("2050", 1766));

        XYChart.Series series3 = new XYChart.Series();
        series3.setName("Europe");

        series3.getData().add(new XYChart.Data("1750", 163));
        series3.getData().add(new XYChart.Data("1800", 203));
        series3.getData().add(new XYChart.Data("1850", 276));
        series3.getData().add(new XYChart.Data("1900", 408));
        series3.getData().add(new XYChart.Data("1950", 547));
        series3.getData().add(new XYChart.Data("1999", 729));
        series3.getData().add(new XYChart.Data("2050", 628));

        XYChart.Series series4 = new XYChart.Series();
        series4.setName("America");
        series4.getData().add(new XYChart.Data("1750", 18));
        series4.getData().add(new XYChart.Data("1800", 31));
        series4.getData().add(new XYChart.Data("1850", 54));
        series4.getData().add(new XYChart.Data("1900", 156));
        series4.getData().add(new XYChart.Data("1950", 339));
        series4.getData().add(new XYChart.Data("1999", 818));
        series4.getData().add(new XYChart.Data("2050", 1201));

        XYChart.Series series5 = new XYChart.Series();
        series5.setName("Oceania");
        series5.getData().add(new XYChart.Data("1750", 2));
        series5.getData().add(new XYChart.Data("1800", 2));
        series5.getData().add(new XYChart.Data("1850", 2));
        series5.getData().add(new XYChart.Data("1900", 6));
        series5.getData().add(new XYChart.Data("1950", 13));
        series5.getData().add(new XYChart.Data("1999", 30));
        series5.getData().add(new XYChart.Data("2050", 46));

        sacRevenue.getData().addAll(series1, series2, series3, series4, series5);


    }
}
