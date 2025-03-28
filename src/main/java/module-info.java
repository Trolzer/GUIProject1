module com.ejcausa.guiproject1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ejcausa.guiproject1 to javafx.fxml;
    exports com.ejcausa.guiproject1;
}