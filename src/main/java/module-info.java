module com.example.odtwarzacz_w65471 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.odtwarzacz_w65471 to javafx.fxml;
    exports com.example.odtwarzacz_w65471;
}