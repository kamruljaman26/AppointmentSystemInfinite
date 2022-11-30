package com.appointment.com.asi.utils;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FXUtil {

    // all view resource link
    public static final String SIGN_IN = "signIn.fxml";
    public static final String PATIENT_FONT_PAGE = "patientFrontPage.fxml";
    public static final String STAFF_FONT_PAGE = "staffFrontPage.fxml";

    // load fxml view in the stage
    public static void loadAnchorView(Class<?> aClass, String fxSource, AnchorPane rootPane, Object... data) {
        try {
            // load view in anchor pane area and control separately
            FXMLLoader loader = new FXMLLoader(aClass.getResource(fxSource));
            AnchorPane pane = loader.load();
            // transfer data to the controller
            if (data.length > 0) {
                DTO controller = loader.getController();
                controller.data(data);
            }
            rootPane.getChildren().setAll(pane);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    // load fxml view in the stage
    public static void loadView(Class<?> aClass, ActionEvent event, String fxSource, String title, Object... data) {
        try {
            // load fxml
            FXMLLoader loader = new FXMLLoader(aClass.getResource(fxSource));
            Parent layout = loader.load();

            // transfer data to the controller
            if (data.length > 0) {
                DTO controller = loader.getController();
                controller.data(data);
            }

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(layout);
            stage.setTitle(title);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // show alert
    public static void showAlert(Alert.AlertType type, String message) {
        Alert alert = new Alert(type);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

}
