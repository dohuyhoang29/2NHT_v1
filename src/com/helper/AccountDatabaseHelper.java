package com.helper;

import com.model.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccountDatabaseHelper {
  public static Account getAccountByUsernameOrEmail(String user) {
    String query = "SELECT * FROM account WHERE username = ? OR email = ?";
    try (Connection cnt = DatabaseHelper.getConnetion();
        PreparedStatement preStm = cnt.prepareStatement(query)) {
      preStm.setString(1, user);
      preStm.setString(2, user);
      ResultSet rs = preStm.executeQuery();
      if (rs.next()) {
        Integer id = rs.getInt("id");
        String username = rs.getString("username");
        String email = rs.getString("email");
        String password = rs.getString("password");
        String type = rs.getString("type");
        String address = rs.getString("address");
        String phone = rs.getString("phone_number");
        return new Account(id, username, email, password, type, address, phone);
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    return null;
  }

  public static List<Account> getAllAccount() {
    List<Account> list = new ArrayList<>();
    String query = "SELECT * FROM account";

    try (Connection cnt = DatabaseHelper.getConnetion();
        PreparedStatement preStm = cnt.prepareStatement(query);
        ResultSet rs = preStm.executeQuery()) {
      while (rs.next()) {
        Integer id = rs.getInt("id");
        String username = rs.getString("username");
        String email = rs.getString("email");
        String password = rs.getString("password");
        String type = rs.getString("type");
        String address = rs.getString("address");
        String phone = rs.getString("phone_number");
        list.add(new Account(id, username, email, password, type, address, phone));
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
      return null;
    }
    return list;
  }

  public static boolean insertAccount(String username, String email, String password,String type, String address, String phone) {
    String query = "INSERT INTO account (username, email, `password`, type, address, phone_number) VALUES (?,?,?,?,?,?)";
    try (Connection cnt = DatabaseHelper.getConnetion();
        PreparedStatement preStm = cnt.prepareStatement(query)) {
      preStm.setString(1, username);
      preStm.setString(2, email);
      preStm.setString(3, password);
      preStm.setString(4, type);
      preStm.setString(5, address);
      preStm.setString(6, phone);
      if (preStm.executeUpdate() > 0) {
        return true;
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }

    return false;
  }

  public static boolean editAccount(String username, String email, String password,String type, String address, String phone, Integer id) {
    String query = "UPDATE account SET username = ?, email = ?, `password` = ?, type = ?, address = ?, phone_number = ? WHERE id = ?";
    try (Connection cnt = DatabaseHelper.getConnetion();
        PreparedStatement preStm = cnt.prepareStatement(query)) {
      preStm.setString(1, username);
      preStm.setString(2, email);
      preStm.setString(3, password);
      preStm.setString(4, type);
      preStm.setString(5, address);
      preStm.setString(6, phone);
      preStm.setInt(7, id);
      if (preStm.executeUpdate() > 0) {
        return true;
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }

    return false;
  }

  public static boolean deleteAccount(Integer id) {
    String query = "DELETE FROM account WHERE id = ?";
    try (Connection cnt = DatabaseHelper.getConnetion();
        PreparedStatement preStm = cnt.prepareStatement(query)) {
      preStm.setInt(1, id);
      if (preStm.executeUpdate() > 0) {
        return true;
      }
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
    return false;
  }
}
