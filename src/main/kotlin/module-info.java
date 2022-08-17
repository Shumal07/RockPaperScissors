module com.example.rockpaperscissors {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.rockpaperscissors to javafx.fxml;
    exports com.example.rockpaperscissors;
}