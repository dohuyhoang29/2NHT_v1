package com.model;

import java.time.LocalDate;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Laptop {
  StringProperty productCode;
  StringProperty productName;
  StringProperty manufacturerName;
  ObjectProperty<Integer> importPrice;
  ObjectProperty<Integer> price;
  StringProperty origin;
  LocalDate importDate;
  StringProperty importDateProperty;
  StringProperty imgSrc;
  StringProperty screen;
  StringProperty ram;
  StringProperty hardDrive;
  StringProperty cpu;
  StringProperty graphics;
  StringProperty operatingSystem;
  StringProperty weight;
  StringProperty dimensions;


  public Laptop (String productCode, String productName, String manufacturerName, Integer importPrice, Integer price, String origin,
      LocalDate importDate, String imgSrc, String screen, String ram,
      String cpu, String operationgSystem, String hardDrive, String graphics, String weight, String dimensions) {
    this.productCode = new SimpleStringProperty(productCode);
    this.productName = new SimpleStringProperty(productName);
    this.manufacturerName = new SimpleStringProperty(manufacturerName);
    this.importPrice = new SimpleObjectProperty<>(importPrice);
    this.price = new SimpleObjectProperty<>(price);
    this.origin = new SimpleStringProperty(origin);
    this.importDate = importDate;
    this.importDateProperty = new SimpleStringProperty(importDate.toString());
    this.imgSrc = new SimpleStringProperty(imgSrc);
    this.screen = new SimpleStringProperty(screen);
    this.ram = new SimpleStringProperty(ram);
    this.cpu = new SimpleStringProperty(cpu);
    this.operatingSystem = new SimpleStringProperty(operationgSystem);
    this.hardDrive = new SimpleStringProperty(hardDrive);
    this.graphics = new SimpleStringProperty(graphics);
    this.weight = new SimpleStringProperty(weight);
    this.dimensions = new SimpleStringProperty(dimensions);
  }

  public String getProductCode() {
    return productCode.get();
  }

  public StringProperty getProductCodeProperty() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode.set(productCode);
  }

  public String getProductName() {
    return productName.get();
  }

  public StringProperty getProductNameProperty() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName.set(productName);
  }

  public String getManufacturerName() {
    return manufacturerName.get();
  }

  public StringProperty getManufacturerNameProperty() {
    return manufacturerName;
  }

  public void setManufacturerName(String manufacturerName) {
    this.manufacturerName.set(manufacturerName);
  }

  public Integer getImportPrice() {
    return importPrice.get();
  }

  public ObjectProperty<Integer> getImportPriceProperty() {
    return importPrice;
  }

  public void setImportPrice(Integer importPrice) {
    this.importPrice.set(importPrice);
  }

  public Integer getPrice() {
    return price.get();
  }

  public ObjectProperty<Integer> getPriceProperty() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price.set(price);
  }

  public String getOrigin() {
    return origin.get();
  }

  public StringProperty getOriginProperty() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin.set(origin);
  }

  public LocalDate getImportDate() {
    return importDate;
  }

  public void setImportDate(LocalDate importDate) {
    this.importDate = importDate;
  }

  public String getImportDateProperty() {
    return importDateProperty.get();
  }

  public StringProperty getImportDatePropertyProperty() {
    return importDateProperty;
  }

  public void setImportDateProperty(String importDateProperty) {
    this.importDateProperty.set(importDateProperty);
  }

  public String getImgSrc() {
    return imgSrc.get();
  }

  public StringProperty getImgSrcProperty() {
    return imgSrc;
  }

  public void setImgSrc(String imgSrc) {
    this.imgSrc.set(imgSrc);
  }

  public String getScreen() {
    return screen.get();
  }

  public StringProperty getScreenProperty() {
    return screen;
  }

  public void setScreen(String screen) {
    this.screen.set(screen);
  }

  public String getRam() {
    return ram.get();
  }

  public StringProperty getRamProperty() {
    return ram;
  }

  public void setRam(String ram) {
    this.ram.set(ram);
  }

  public String getHardDrive() {
    return hardDrive.get();
  }

  public StringProperty getHardDriveProperty() {
    return hardDrive;
  }

  public void setHardDrive(String hardDrive) {
    this.hardDrive.set(hardDrive);
  }

  public String getCpu() {
    return cpu.get();
  }

  public StringProperty getCpuProperty() {
    return cpu;
  }

  public void setCpu(String cpu) {
    this.cpu.set(cpu);
  }

  public String getGraphics() {
    return graphics.get();
  }

  public StringProperty getGraphicsProperty() {
    return graphics;
  }

  public void setGraphics(String graphics) {
    this.graphics.set(graphics);
  }

  public String getOperatingSystem() {
    return operatingSystem.get();
  }

  public StringProperty getOperatingSystemProperty() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem.set(operatingSystem);
  }

  public String getWeight() {
    return weight.get();
  }

  public StringProperty getWeightProperty() {
    return weight;
  }

  public void setWeight(String weight) {
    this.weight.set(weight);
  }

  public String getDimensions() {
    return dimensions.get();
  }

  public StringProperty getDimensionsProperty() {
    return dimensions;
  }

  public void setDimensions(String dimensions) {
    this.dimensions.set(dimensions);
  }
}
