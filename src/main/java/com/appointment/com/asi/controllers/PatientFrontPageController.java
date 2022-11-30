package com.appointment.com.asi.controllers;

import com.appointment.com.asi.utils.FXUtil;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class PatientFrontPageController implements Initializable {

    public Button appBut;
    public Button currentInfoBut;
    public Button operationBut;
    public Text doctorName;
    public Button signOut;
    public Button recordButton;
    public Button billsButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void onApp(ActionEvent actionEvent) {
        FXUtil.loadView(getClass(), actionEvent, FXUtil.VIEW_APPOINTMENT_PATIENT, "Appointment System");
    }

    public void onInformation(ActionEvent actionEvent) {
        FXUtil.loadView(getClass(), actionEvent, FXUtil.VIEW_PATIENT_INFO, "Appointment System");
    }

    public void onOperation(ActionEvent actionEvent) {
        FXUtil.loadView(getClass(), actionEvent, FXUtil.VIEW_OPERATION_PATIENT, "Appointment System");
    }

    public void onSignOut(ActionEvent actionEvent) {
        FXUtil.loadView(getClass(), actionEvent, FXUtil.SIGN_IN, "Appointment System");
    }

    public void onRecords(ActionEvent actionEvent) {
        FXUtil.loadView(getClass(), actionEvent, FXUtil.VIEW_RECORD_PATIENT, "Appointment System");
    }

    public void onBills(ActionEvent actionEvent) {
        FXUtil.loadView(getClass(), actionEvent, FXUtil.VIEW_BILLS_PATIENT, "Appointment System");
    }
}
