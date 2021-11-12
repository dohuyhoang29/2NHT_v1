package com.helper;

import com.model.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryDatabaseHelper {
  public static List<Category> getAllCategories() {
    List<Category> list = new ArrayList<>();
    String query = "SELECT * FROM categories";
    try (Connection cnt = DatabaseHelper.getConnetion();
        PreparedStatement preStm = cnt.prepareStatement(query);
        ResultSet rs = preStm.executeQuery()) {
        while (rs.next()) {
          Integer id = rs.getInt("id");
          String name = rs.getString("name");
          String description = rs.getString("description");
          list.add(new Category(id, name, description));
        }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
      return null;
    }
    return list;
  }

  public static Category getCategoryByName(String name) {
    String query = "SELECT * FROM categories WHERE name = ?";
    try (Connection cnt = DatabaseHelper.getConnetion();
        PreparedStatement preStm = cnt.prepareStatement(query)) {
      preStm.setString(1, name);

      ResultSet rs = preStm.executeQuery();
      if(rs.next()) {
        Integer id = rs.getInt("id");
        String Name = rs.getString("name");
        String description = rs.getString("description");
        return new Category(id, Name, description);
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    return null;
  }

  public static boolean insertCategory(String name) {
    String query = "INSERT INTO categories(name) VALUES (?);";
    try (Connection cnt = DatabaseHelper.getConnetion();
        PreparedStatement preStm = cnt.prepareStatement(query)) {
      preStm.setString(1, name);
      if (preStm.executeUpdate() > 0) {
        return true;
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    return false;
  }
}
