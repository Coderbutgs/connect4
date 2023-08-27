module com.internshala.training.connect4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.internshala.training.connect4 to javafx.fxml;
    exports com.internshala.training.connect4;
}