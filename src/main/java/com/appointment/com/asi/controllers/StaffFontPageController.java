package com.appointment.com.asi.controllers;

import com.appointment.com.asi.utils.FXUtil;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class StaffFontPageController implements Initializable {


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void onApp(ActionEvent actionEvent) {
        FXUtil.loadView(getClass(), actionEvent, FXUtil.VIEW_APPOINTMENT_STAFF, "Appointment System");
    }

    public void onInformation(ActionEvent actionEvent) {
        FXUtil.loadView(getClass(), actionEvent, FXUtil.VIEW_STAFF_INFO, "Appointment System");
    }

    public void onOperation(ActionEvent actionEvent) {
        FXUtil.loadView(getClass(), actionEvent, FXUtil.VIEW_OPERATION_STAFF, "Appointment System");
    }

    public void onSignOut(ActionEvent actionEvent) {
        FXUtil.loadView(getClass(), actionEvent, FXUtil.SIGN_IN, "Appointment System");
    }

    public void onRecords(ActionEvent actionEvent) {
        FXUtil.loadView(getClass(), actionEvent, FXUtil.VIEW_RECORD_STAFF, "Appointment System");
    }

    public void onPatientsButton(ActionEvent actionEvent) {
        FXUtil.loadView(getClass(), actionEvent, FXUtil.STAFF_VIEW_PATIENT_PAGE, "Appointment System");
    }

    public void onRoom(ActionEvent actionEvent) {
        FXUtil.loadView(getClass(), actionEvent, FXUtil.VIEW_ROOMS_STAFF, "Appointment System");
    }
}
