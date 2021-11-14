package com.model;

import java.time.LocalDate;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Product {

  // khoi tao properties
  StringProperty categoryName;
  StringProperty productCode;
  StringProperty productName;
  StringProperty warrantyPeriod;
  ObjectProperty<Integer> importPrice;
  ObjectProperty<Integer> price;
  StringProperty hardDrive;
  StringProperty origin;
  ObjectProperty<Integer> quantity;
  StringProperty color;
  StringProperty imgSrc;

  StringProperty screen;
  StringProperty cpu;
  StringProperty gpu;
  StringProperty ram;
  StringProperty operatingSystem;
  StringProperty rearCamera;
  StringProperty selfieCamera;
  StringProperty batteryCapacity;
  StringProperty sim;
  StringProperty weight;
  StringProperty dimensions;

  // khoi tao contructer mac dinh
  public Product() {
    super();
  }

  // khoi tao contructer

  public Product(String categoryName, String productCode, String productName, String warrantyPeriod,
      Integer importPrice, Integer price, String hardDrive,
      String origin, Integer quantity, String color, String imgSrc, String screen, String cpu,
      String gpu, String ram, String operatingSystem, String rearCamera, String selfieCamera,
      String batteryCapacity, String sim, String weight, String dimensions) {
    this.categoryName = new SimpleStringProperty(categoryName);
    this.productCode = new SimpleStringProperty(productCode);
    this.productName = new SimpleStringProperty(productName);
    this.warrantyPeriod = new SimpleStringProperty(warrantyPeriod);
    this.importPrice = new SimpleObjectProperty<>(importPrice);
    this.price = new SimpleObjectProperty<>(price);
    this.hardDrive = new SimpleStringProperty(hardDrive);
    this.origin = new SimpleStringProperty(origin);
    this.quantity = new SimpleObjectProperty<>(quantity);
    this.color = new SimpleStringProperty(color);
    this.imgSrc = new SimpleStringProperty(imgSrc);
    this.screen = new SimpleStringProperty(screen);
    this.cpu = new SimpleStringProperty(cpu);
    this.gpu = new SimpleStringProperty(gpu);
    this.ram = new SimpleStringProperty(ram);
    this.operatingSystem = new SimpleStringProperty(operatingSystem);
    this.rearCamera = new SimpleStringProperty(rearCamera);
    this.selfieCamera = new SimpleStringProperty(selfieCamera);
    this.batteryCapacity = new SimpleStringProperty(batteryCapacity);
    this.sim = new SimpleStringProperty(sim);
    this.weight = new SimpleStringProperty(weight);
    this.dimensions = new SimpleStringProperty(dimensions);
  }

  //khoi tao getter va setter

  public String getCategoryName() {
    return categoryName.get();
  }

  public StringProperty getCategoryNameProperty() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName.set(categoryName);
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

  public String getWarrantyPeriod() {
    return warrantyPeriod.get();
  }

  public StringProperty getWarrantyPeriodProperty() {
    return warrantyPeriod;
  }

  public void setWarrantyPeriod(String warrantyPeriodProperty) {
    this.warrantyPeriod.set(warrantyPeriodProperty);
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

  public String getHardDrive() {
    return hardDrive.get();
  }

  public StringProperty getHardDriveProperty() {
    return hardDrive;
  }

  public void setHardDrive(String hardDrive) {
    this.hardDrive.set(hardDrive);
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

  public Integer getQuantity() {
    return quantity.get();
  }

  public ObjectProperty<Integer> getQuantityProperty() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity.set(quantity);
  }

  public String getColor() {
    return color.get();
  }

  public StringProperty getColorProperty() {
    return color;
  }

  public void setColor(String color) {
    this.color.set(color);
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

  public String getCpu() {
    return cpu.get();
  }

  public StringProperty getCpuProperty() {
    return cpu;
  }

  public void setCpu(String cpu) {
    this.cpu.set(cpu);
  }

  public String getGpu() {
    return gpu.get();
  }

  public StringProperty getGpuProperty() {
    return gpu;
  }

  public void setGpu(String gpu) {
    this.gpu.set(gpu);
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

  public String getOperatingSystem() {
    return operatingSystem.get();
  }

  public StringProperty getOperatingSystemProperty() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem.set(operatingSystem);
  }

  public String getRearCamera() {
    return rearCamera.get();
  }

  public StringProperty getRearCameraProperty() {
    return rearCamera;
  }

  public void setRearCamera(String rearCamera) {
    this.rearCamera.set(rearCamera);
  }

  public String getSelfieCamera() {
    return selfieCamera.get();
  }

  public StringProperty getSelfieCameraProperty() {
    return selfieCamera;
  }

  public void setSelfieCamera(String selfieCamera) {
    this.selfieCamera.set(selfieCamera);
  }

  public String getBatteryCapacity() {
    return batteryCapacity.get();
  }

  public StringProperty getBatteryCapacityProperty() {
    return batteryCapacity;
  }

  public void setBatteryCapacity(String batteryCapacity) {
    this.batteryCapacity.set(batteryCapacity);
  }

  public String getSim() {
    return sim.get();
  }

  public StringProperty getSimProperty() {
    return sim;
  }

  public void setSim(String sim) {
    this.sim.set(sim);
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
