package pe.edu.ulima.is2.lab2.violations;

public class EmailNotifier {
    public void sendEmail(String recipient, String subject, String message) {
        System.out.println("Enviando email a " + recipient);
        System.out.println("Asunto: " + subject);
        System.out.println("Mensaje: " + message);
    }
}