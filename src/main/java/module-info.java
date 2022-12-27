module com.example.lab2_database {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab2_database to javafx.fxml;
    exports com.example.lab2_database;
}