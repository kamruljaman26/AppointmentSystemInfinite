module com.appointment.com.asi {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.appointment.com.asi to javafx.fxml;
    exports com.appointment.com.asi;
    exports com.appointment.com.asi.controllers;
    opens com.appointment.com.asi.controllers to javafx.fxml;
}