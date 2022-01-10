module com.example.fxprototype {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.fxprototype to javafx.fxml;
    exports com.example.fxprototype;
    exports com.example.fxprototype.Controller;
    opens com.example.fxprototype.Controller to javafx.fxml;
    exports com.example.fxprototype.Model;
    opens com.example.fxprototype.Model to javafx.fxml;
}