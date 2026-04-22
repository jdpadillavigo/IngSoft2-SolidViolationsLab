package pe.edu.ulima.is2.lab2.corrected;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public boolean process(double amount, String data) {
        System.out.println("Procesando pago con tarjeta de crédito por $" + amount);
        // Simulación de validación de tarjeta
        if (data.length() < 16) {
            return false;
        }
        System.out.println("Pago con tarjeta procesado exitosamente");
        return true;
    }

    @Override
    public double calculateProcessingFee(double amount) {
        return amount * 0.03;
    }

    @Override
    public String getPaymentType() {
        return "CREDIT_CARD";
    }
}
