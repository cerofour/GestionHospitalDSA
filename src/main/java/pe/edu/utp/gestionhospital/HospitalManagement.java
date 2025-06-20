package pe.edu.utp.gestionhospital;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HospitalManagement extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HospitalManagement.class.getResource("HospitalManagement.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 700);
        stage.setTitle("Sistema de Gestión Hospitalaria");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
