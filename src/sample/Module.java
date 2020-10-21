package sample;

import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;

public class Module {
    public void createFile(TextField login,PasswordField password,Label status) throws IOException {
        File file = new File("C://test/Reg.txt");
        FileWriter fos = new FileWriter(file);
        file.createNewFile();
        if (login.getText().isEmpty()&&password.getText().isEmpty()){
            status.setText("Введите логин и пароль: ");
        }else if (login.getText().isEmpty()){
            status.setText("Введите логин: ");
        }else if (password.getText().isEmpty()){
            status.setText("Ввведите пароль: ");
        }else if (!login.getText().isEmpty()&&!password.getText().isEmpty()){
            status.setText("Вы зарегистрированы ");
        }
        fos.write( login.getText() +"\n" + password.getText());
        fos.close();
    }
    public void egualsFile(TextField name, PasswordField password, Label status) throws IOException {
        FileReader fis = new FileReader("C://test/Reg.txt");
        String str;
        var buffer=new BufferedReader(fis);
        ArrayList<String> arrayList = new ArrayList<>();
        while ((str = buffer.readLine())!=null){
            if (str.isEmpty())break;
            arrayList.add(str);
        }
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add(name.getText());
        arrayList1.add(password.getText());
        if (arrayList.equals(arrayList1)){
            status.setText("Вы авторизованы");
        }else status.setText("Зарегистрируйтесь: ");
        fis.close();
    }
}


