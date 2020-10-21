package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;
public class Controller {

    Module module = new Module();
    @FXML
    private TextField name;
    @FXML
    private PasswordField password;
    @FXML
    private Label status;

    @FXML
    public void pressRegistr(ActionEvent event) throws IOException {
        module.createFile(name,password,status);
    }
    @FXML
    public void PressOpen(ActionEvent event) throws IOException {
        module.egualsFile(name,password,status);
    }
}

