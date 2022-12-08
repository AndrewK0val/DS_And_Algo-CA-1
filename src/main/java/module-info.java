module andrewkoval.jewellerystore {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    //requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    //requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires xstream;

    opens andrewkoval.jewellerystore to javafx.fxml;
    opens andrewkoval.jewellerystore.Controllers  to  javafx.fxml;
    exports andrewkoval.jewellerystore;
    exports andrewkoval.jewellerystore.Controllers to  javafx.fxml;
}