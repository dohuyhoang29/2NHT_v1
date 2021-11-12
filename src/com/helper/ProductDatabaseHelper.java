package com.helper;


import com.model.Product;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductDatabaseHelper {

  public static List<Product> getAllProduct() {
    List<Product> list = new ArrayList<>();
    String query = "SELECT * FROM product";

    try (Connection cnt = DatabaseHelper.getConnetion();
        PreparedStatement preStm = cnt.prepareStatement(query);
        ResultSet rs = preStm.executeQuery()) {
      while (rs.next()) {
        String categoryId = rs.getString("category_id");
        String code = rs.getString("code");
        String name = rs.getString("name");
        LocalDate importDate = rs.getDate("import_date").toLocalDate();
        Integer importPrice = rs.getInt("import_price");
        Integer price = rs.getInt("price");
        String hardDrive = rs.getString("hard_drive");
        String origin = rs.getString("origin");
        Integer quantity = rs.getInt("quantity");
        String color = rs.getString("color");
        String imgSrc = rs.getString("img_src");
        String screen = rs.getString("screen");
        String cpu = rs.getString("cpu");
        String gpu = rs.getString("gpu");
        String ram = rs.getString("ram");
        String operatingSystem = rs.getString("operating_system");
        String rearCamera = rs.getString("rear_camera");
        String selfieCamera = rs.getString("selfie_camera");
        String batteryCapacity = rs.getString("battery_capacity");
        String sim = rs.getString("sim");
        String weight = rs.getString("weight");
        String dimensions = rs.getString("dimensions");

        list.add(
            new Product(categoryId, code, name, importDate, importPrice, price, hardDrive, origin,
                quantity, color, imgSrc, screen, cpu, gpu, ram, operatingSystem, rearCamera,
                selfieCamera, batteryCapacity, sim, weight, dimensions));
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
      return null;
    }

    return list;
  }

  public static boolean insertLaptop(Integer categoryId, String code, String name,
      LocalDate importDate,
      Integer importPrice, Integer price, String hardDrive, String origin, Integer quatity,
      String color, String imgSrc, String screen, String cpu, String gpu, String ram,
      String operatingSystem, String rearCamera, String selfieCamera, String batteryCapacity,
      String sim,
      String weight, String dimensions) {
    String query =
        "INSERT INTO product (category_id, code, name, import_date, import_price, price, hard_drive, origin, quantity, color, img_src, screen, cpu, gpu, ram, operating_system, rear_camera, selfie_camera, battery_capacity, sim, weight, dimensions) "
            + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    try (Connection cnt = DatabaseHelper.getConnetion();
        PreparedStatement preStm = cnt.prepareStatement(query)) {
      preStm.setInt(1, categoryId);
      preStm.setString(2, code);
      preStm.setString(3, name);
      preStm.setDate(4, Date.valueOf(importDate));
      preStm.setInt(5, importPrice);
      preStm.setInt(6, price);
      preStm.setString(7, hardDrive);
      preStm.setString(8, origin);
      preStm.setInt(9, quatity);
      preStm.setString(10, color);
      preStm.setString(11, imgSrc);
      preStm.setString(12, screen);
      preStm.setString(13, cpu);
      preStm.setString(14, gpu);
      preStm.setString(15, ram);
      preStm.setString(16, operatingSystem);
      preStm.setString(17, rearCamera);
      preStm.setString(18, selfieCamera);
      preStm.setString(19, batteryCapacity);
      preStm.setString(20, sim);
      preStm.setString(21, weight);
      preStm.setString(22, dimensions);

      if (preStm.executeUpdate() > 0) {
        return true;
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    return false;
  }
}