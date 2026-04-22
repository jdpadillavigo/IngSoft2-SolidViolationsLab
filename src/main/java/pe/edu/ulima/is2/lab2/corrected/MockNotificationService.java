package pe.edu.ulima.is2.lab2.corrected;

public class MockNotificationService implements NotificationService {
    public MockNotificationService() {}

    @Override
    public void sendNotification(String type, String recipient, String message) {
        System.out.println("Enviando notificación de tipo " + recipient + " a " + type + ": " + message);
    }
}
