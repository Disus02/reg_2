package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Module {
    public void createFile(String login,String password) throws IOException {
        File file = new File("C://test/Reg.txt");
        FileWriter fos = new FileWriter(file);
        file.createNewFile();
        fos.write("Имя: " + login +"\n"+"Пароль: " + password);
        fos.close();
    }

}
