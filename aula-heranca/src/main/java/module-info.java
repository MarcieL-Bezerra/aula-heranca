module com.example.aulaheranca {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.aulaheranca to javafx.fxml;
    exports com.example.aulaheranca;
}