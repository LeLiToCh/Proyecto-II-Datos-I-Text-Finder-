module code.textfinder {
    requires javafx.controls;
    requires javafx.fxml;


    opens code.textfinder to javafx.fxml;
    exports code.textfinder;
}