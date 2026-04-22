package pe.edu.ulima.is2.lab2.corrected;

public class ApplePayPayment implements PaymentMethod {
    @Override
    public boolean process(double amount, String data) {
        System.out.println("Procesando pago con Bitcoin por $" + amount);
        // Simulación de validación de Bitcoin
        if (!data.startsWith("bc1") && !data.startsWith("1")) {
            return false;
        }
        System.out.println("Pago con Bitcoin procesado exitosamente");
        return true;
    }

    @Override
    public double calculateProcessingFee(double amount) {
        return amount * 0.001;
    }

    @Override
    public String getPaymentType() {
        return "BITCOIN";
    }
}
