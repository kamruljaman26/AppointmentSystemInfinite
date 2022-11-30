package com.appointment.com.asi.controllers;

import com.appointment.com.asi.utils.FXUtil;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(FXUtil.SIGN_IN));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Appointment System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}