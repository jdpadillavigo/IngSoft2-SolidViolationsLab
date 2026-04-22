package pe.edu.ulima.is2.lab2.corrected;

public class EmailNotificationService implements NotificationService {
    public EmailNotificationService() {}

    @Override
    public void sendNotification(String recipient, String subject, String message) {
        System.out.println("Enviando email a " + recipient);
        System.out.println("Asunto: " + subject);
        System.out.println("Mensaje: " + message);
    }
}
