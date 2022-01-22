module eng.tetiana_luhacheva.whalepipeline3d {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens eng.tetiana_luhacheva.whalepipeline3d to javafx.fxml;
    exports eng.tetiana_luhacheva.whalepipeline3d;
    exports eng.tetiana_luhacheva.whalepipeline3d.controller;
    opens eng.tetiana_luhacheva.whalepipeline3d.controller to javafx.fxml;
}