module com.example.oop_lab2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oop_lab2 to javafx.fxml;
    exports com.example.oop_lab2;
}