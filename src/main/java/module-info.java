module com.paulrezzonico.renameto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.paulrezzonico.renameto to javafx.fxml;
    exports com.paulrezzonico.renameto;
}