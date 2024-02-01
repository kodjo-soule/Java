module com.ums.hello {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ums.hello to javafx.fxml;
    exports com.ums.hello;
}
