module pe.edu.utp.gestionhospital {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens pe.edu.utp.gestionhospital to javafx.fxml;
    exports pe.edu.utp.gestionhospital;
}