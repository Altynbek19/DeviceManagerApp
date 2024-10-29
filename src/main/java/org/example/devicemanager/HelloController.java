package org.example.devicemanager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML private ListView<Device> listView;
    private ObservableList<Device> deviceList = FXCollections.observableArrayList();

    // Initialize method
    @FXML
    public void initialize() {
        listView.setItems(deviceList);
    }

    // Method to add Smartphone
    @FXML
    public void addSmartphone() {
        // Get values from input fields and create a Smartphone instance
        // Add the instance to deviceList
    }

    // Method to add Laptop
    @FXML
    public void addLaptop() {
        // Get values from input fields and create a Laptop instance
        // Add the instance to deviceList
    }

    // Method to add Tablet
    @FXML
    public void addTablet() {
        // Get values from input fields and create a Tablet instance
        // Add the instance to deviceList
    }

    // Method to remove selected device
    @FXML
    public void removeSelectedDevice() {
        Device selectedDevice = listView.getSelectionModel().getSelectedItem();
        deviceList.remove(selectedDevice);
    }
}
