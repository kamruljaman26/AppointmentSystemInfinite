package com.appointment.com.asi.controllers;

import com.appointment.com.asi.utils.FXUtil;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class SignInController implements Initializable {

    public TextField emailInput;
    public TextField passInput;
    public Button signInButton;
    public Button signUpAction;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void signInButton(ActionEvent actionEvent) {
        String email = emailInput.getText();
        String pass = passInput.getText();

        // load view based on input validation
        if (email.equals("patient") && pass.equals("patient")) {
            FXUtil.loadView(getClass(), actionEvent, FXUtil.PATIENT_FONT_PAGE, "Patient Dashboard");
        }else {
            FXUtil.loadView(getClass(), actionEvent, FXUtil.STAFF_FONT_PAGE, "Staff Dashboard");
        }
    }

    public void signUpAction(ActionEvent actionEvent) {

    }
}
