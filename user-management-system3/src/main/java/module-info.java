module com.ums.usermanagementsystem3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ums.usermanagementsystem3 to javafx.fxml;
    exports com.ums.usermanagementsystem3;
}