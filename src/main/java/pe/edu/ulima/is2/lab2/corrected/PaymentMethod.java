package pe.edu.ulima.is2.lab2.corrected;

public interface PaymentMethod {
    boolean process(double amount, String data);
    double calculateProcessingFee(double amount);
    String getPaymentType();
}
