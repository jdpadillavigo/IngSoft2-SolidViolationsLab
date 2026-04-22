package pe.edu.ulima.is2.lab2.corrected;

public class NotificationService {
    public void sendWelcomeEmail(User user) {
        System.out.println("Enviando email de bienvenida a: " + user.getEmail());
        System.out.println("Asunto: ¡Bienvenido " + user.getName() + "!");
        System.out.println("Cuerpo: Gracias por registrarte como usuario " + user.getUserType());
    }
}
