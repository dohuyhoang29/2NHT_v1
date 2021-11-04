package com.model;

import java.time.LocalDate;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Phone {
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
  StringProperty rearCamera;
  StringProperty selfieCamera;
  StringProperty ram;
  StringProperty internalMemory;
  StringProperty cpu;
  StringProperty gpu;
  StringProperty batteryCapacity;
  StringProperty sim;
  StringProperty operatingSystem;

  public Phone (String productCode, String productName, String manufacturerName, Integer importPrice, Integer price, String origin,
                LocalDate importDate, String imgSrc, String screen, String rearCamera, String selfieCamera, String ram, String internalMemory,
                String cpu, String gpu, String batteryCapacity, String sim, String operationgSystem) {
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
    this.rearCamera = new SimpleStringProperty(rearCamera);
    this.selfieCamera = new SimpleStringProperty(selfieCamera);
    this.ram = new SimpleStringProperty(ram);
    this.internalMemory = new SimpleStringProperty(internalMemory);
    this.cpu = new SimpleStringProperty(cpu);
    this.gpu = new SimpleStringProperty(gpu);
    this.batteryCapacity = new SimpleStringProperty(batteryCapacity);
    this.sim = new SimpleStringProperty(sim);
    this.operatingSystem = new SimpleStringProperty(operationgSystem);
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

  public String getRam() {
    return ram.get();
  }

  public StringProperty getRamProperty() {
    return ram;
  }

  public void setRam(String ram) {
    this.ram.set(ram);
  }

  public String getInternalMemory() {
    return internalMemory.get();
  }

  public StringProperty getInternalMemoryProperty() {
    return internalMemory;
  }

  public void setInternalMemory(String internalMemory) {
    this.internalMemory.set(internalMemory);
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

  public String getOperatingSystem() {
    return operatingSystem.get();
  }

  public StringProperty getOperatingSystemProperty() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem.set(operatingSystem);
  }
}
