package HW.hw5.Core;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    // Метод записи строк в текстовый файл
    public void log(String s){
        try(FileWriter writer = new FileWriter("notes3.txt", true))
            {
                writer.write(s);
                writer.append('\n');
                writer.flush();
            }
            catch(IOException ex){
                
                System.out.println(ex.getMessage());
            }
    }
}
