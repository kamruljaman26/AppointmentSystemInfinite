package com.appointment.com.asi.controllers;

import com.appointment.com.asi.utils.FXUtil;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewRecordPatientController implements Initializable {



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void onSignOut(ActionEvent actionEvent) {
        FXUtil.loadView(getClass(), actionEvent, FXUtil.SIGN_IN, "Appointment System");
    }

    public void onBackButton(ActionEvent actionEvent) {
        FXUtil.loadView(getClass(), actionEvent, FXUtil.PATIENT_FONT_PAGE, "Appointment System");
    }
}
