module org.example.devicemanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.devicemanager to javafx.fxml;
    exports org.example.devicemanager;
}