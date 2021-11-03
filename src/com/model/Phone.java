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
}
