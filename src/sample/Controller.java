package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


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
        module.createFile(name.getText(),password.getText());
        status.setText("Вы зарегистрированы");
        status.getText();

    }
    @FXML
    public void PressOpen(ActionEvent event) throws IOException {
        FileReader fis = new FileReader("C://test/Reg.txt");
        String str;
        var buffer=new BufferedReader(fis);
        ArrayList<String> arrayList = new ArrayList<>();
        while ((str = buffer.readLine())!=null){
            if (str.isEmpty())break;
            arrayList.add(str);
        }

    }
}
