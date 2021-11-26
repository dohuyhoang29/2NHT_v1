package com.helper;

import com.model.OrderDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDetailsDatabaseHelper {
  public static boolean insertOrderDetails (Integer quantity, Integer productID, Integer orderID) {
    String query = "INSERT INTO order_detail (quantity, product_id, order_id) VALUES (?,?,?);";

    try (Connection cnt = DatabaseHelper.getConnetion();
        PreparedStatement preStm = cnt.prepareStatement(query)) {
      preStm.setInt(1, quantity);
      preStm.setInt(2, productID);
      preStm.setInt(3, orderID);

      if (preStm.executeUpdate() > 0) {
        return true;
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    return false;
  }

  public static List<OrderDetail> getOrderDetail (Integer id) {
    List<OrderDetail> list = new ArrayList<>();

    String query = "SELECT od.id, p.name, p.img_src, p.price, od.quantity, o.`status`, o.address "
        + "FROM order_detail AS od "
        + "INNER JOIN `order` AS o ON od.order_id = o.id "
        + "INNER JOIN product AS p ON od.product_id = p.id "
        + "WHERE od.order_id  = ?;";

    try (Connection cnt = DatabaseHelper.getConnetion();
        PreparedStatement preStm = cnt.prepareStatement(query)) {
      preStm.setInt(1, id);

      ResultSet rs = preStm.executeQuery();
      while (rs.next()) {
        Integer Id = rs.getInt("id");
        String name = rs.getString("name");
        String imgSrc = rs.getString("img_src");
        Integer price = rs.getInt("price");
        Integer quantity = rs.getInt("quantity");
        String status = rs.getString("status");
        String address = rs.getString("address");

        list.add(new OrderDetail(Id, imgSrc, name, price, quantity, status, address));
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
      return null;
    }

    return list;
  }
}
