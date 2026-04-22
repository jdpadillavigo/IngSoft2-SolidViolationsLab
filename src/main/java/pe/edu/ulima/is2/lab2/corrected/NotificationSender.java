package pe.edu.ulima.is2.lab2.corrected;

public interface NotificationSender {
    void sendOrderConfirmation(String orderId);
    void sendShippingNotification(String orderId);
    void sendDeliveryNotification(String orderId);
}
