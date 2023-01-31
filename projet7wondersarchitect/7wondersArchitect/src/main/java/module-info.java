module com.example._7wondersarchitect {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._7wondersarchitect to javafx.fxml;
    exports com.example._7wondersarchitect;
}