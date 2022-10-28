module code.textfinder {
    requires javafx.controls;
    requires javafx.fxml;
    requires itextpdf;
    requires org.apache.poi.ooxml;


    opens code.textfinder to javafx.fxml;
    exports code.textfinder;
}