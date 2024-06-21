module com.example.assignmet1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignmet1 to javafx.fxml;
    exports com.example.assignmet1;
}