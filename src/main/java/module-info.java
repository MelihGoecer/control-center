module com.siemens.controlcenter {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.siemens.controlcenter to javafx.fxml;
    exports com.siemens.controlcenter;
}