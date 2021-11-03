package com;

import com.view.Navigator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
//    Parent root = FXMLLoader.load(getClass().getResource("view/InsertLaptopBasicInfoUI.fxml"));
//
//    Scene scene = new Scene(root);
//    primaryStage.setScene(scene);
//    primaryStage.show();

    Navigator.getInstance().setStage(primaryStage);
    Navigator.getInstance().goToInsertPhoneBasicInfo();
    //test commit
  }
}
