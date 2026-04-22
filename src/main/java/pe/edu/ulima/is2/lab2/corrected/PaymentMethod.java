package pe.edu.ulima.is2.lab2.corrected;

public interface PaymentMethod {
    public boolean process(double amount, String data);
    public double calculateProcessingFee(double amount);
    public String getPaymentType();
}
