module com.example.sdmproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sdmproject to javafx.fxml;
    exports com.example.sdmproject;
    exports com.example.sdmproject.Controller;
}