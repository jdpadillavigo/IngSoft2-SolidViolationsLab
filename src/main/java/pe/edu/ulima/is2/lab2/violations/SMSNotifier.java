package pe.edu.ulima.is2.lab2.violations;

public class SMSNotifier {
    public void sendSMS(String phoneNumber, String message) {
        System.out.println("Enviando SMS a " + phoneNumber + ": " + message);
    }
}