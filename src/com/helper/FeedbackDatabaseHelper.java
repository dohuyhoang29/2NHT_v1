package com.helper;

import com.model.Feedback;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FeedbackDatabaseHelper {
  public static List<Feedback> getAllFeedback () {
    List<Feedback> list = new ArrayList<>();
    String query = "SELECT f.id, f.feedback, f.point, f.date, a.username, p.name "
                  + "FROM feedback AS f "
                  + "INNER JOIN product AS p ON f.product_id = p.id "
                  + "INNER JOIN account AS a ON f.account_id = a.id;";

    try (Connection cnt = DatabaseHelper.getConnetion();
        PreparedStatement stm = cnt.prepareStatement(query);
        ResultSet rs = stm.executeQuery()) {
      while (rs.next()) {
        Integer id = rs.getInt("id");
        String feedback = rs.getString("feedback");
        Integer point = rs.getInt("point");
        LocalDate date = rs.getDate("date").toLocalDate();
        String username = rs.getString("username");
        String name = rs.getString("name");

        list.add(new Feedback(id, feedback, username, name, point, date));
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
      return null;
    }
    return list;
  }

  public static List<Feedback> getFeedbackByProduct (String productName) {
    List<Feedback> list = new ArrayList<>();
    String query = "SELECT f.id, f.feedback, f.point, f.date, a.username, p.name "
        + "FROM feedback AS f "
        + "INNER JOIN product AS p ON f.product_id = p.id "
        + "INNER JOIN account AS a ON f.account_id = a.id WHERE p.name = ?;";

    try (Connection cnt = DatabaseHelper.getConnetion();
        PreparedStatement stm = cnt.prepareStatement(query)) {
      stm.setString(1, productName);

      ResultSet rs = stm.executeQuery();
      while (rs.next()) {
        Integer id = rs.getInt("id");
        String feedback = rs.getString("feedback");
        Integer point = rs.getInt("point");
        LocalDate date = rs.getDate("date").toLocalDate();
        String username = rs.getString("username");
        String name = rs.getString("name");

        list.add(new Feedback(id, feedback, username, name, point, date));
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
      return null;
    }
    return list;
  }

  public static boolean insertFeedback (String feedback, Integer point, Integer accountID, Integer productID) {
    String query = "INSERT INTO feedback (account_id, product_id, feedback, point, date) VALUES (?, ?, ?, ?, ?);";

    try (Connection cnt = DatabaseHelper.getConnetion();
        PreparedStatement preStm = cnt.prepareStatement(query)) {
      preStm.setInt(1, accountID);
      preStm.setInt(2, productID);
      preStm.setString(3, feedback);
      preStm.setInt(4, point);
      preStm.setDate(5, Date.valueOf(LocalDate.now()));

      if (preStm.executeUpdate() > 0) {
        return true;
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }

    return false;
  }
}
