package pe.edu.ulima.is2.lab2.corrected;

public class BankTransferPayment implements PaymentMethod {
    @Override
    public boolean process(double amount, String data) {
        System.out.println("Procesando transferencia bancaria por $" + amount);
        // Simulación de validación bancaria
        if (data.length() < 10) {
            return false;
        }
        System.out.println("Transferencia bancaria procesada exitosamente");
        return true;
    }

    @Override
    public double calculateProcessingFee(double amount) {
        return 5.0;
    }

    @Override
    public String getPaymentType() {
        return "BANK_TRANSFER";
    }
}
