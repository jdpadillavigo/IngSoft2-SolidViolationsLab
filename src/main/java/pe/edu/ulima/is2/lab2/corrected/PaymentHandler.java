package pe.edu.ulima.is2.lab2.corrected;

public interface PaymentHandler {
    boolean processPayment(String orderId, String paymentMethod, String paymentData);
    void processRefund(String orderId, double amount);
}
