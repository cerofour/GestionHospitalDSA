package pe.edu.utp.gestionhospital;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HospitalManagementController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
