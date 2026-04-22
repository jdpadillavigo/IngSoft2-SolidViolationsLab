package pe.edu.ulima.is2.lab2.violations;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLogger {
    public void log(String message) {
        try (FileWriter writer = new FileWriter("app.log", true)) {
            String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            writer.write(timestamp + " - " + message + "\n");
        } catch (IOException e) {
            System.err.println("Error escribiendo log: " + e.getMessage());
        }
    }
}