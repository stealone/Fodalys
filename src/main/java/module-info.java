module com.lifesoft.fordalys.fordalys {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;

    opens com.lifesoft.fordalys.fordalys to javafx.fxml;
    exports com.lifesoft.fordalys.fordalys;
}