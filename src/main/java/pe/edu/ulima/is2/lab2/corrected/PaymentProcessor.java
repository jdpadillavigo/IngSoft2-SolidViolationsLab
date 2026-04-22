package pe.edu.ulima.is2.lab2.corrected;

import java.util.HashMap;

public class PaymentProcessor {
    private HashMap<String, PaymentMethod> mPaymentMethods;

    public PaymentProcessor() {
        this.mPaymentMethods = new HashMap<>();
    }

    public void registerPaymentMethod(PaymentMethod method) {
        mPaymentMethods.put(method.getPaymentType(), method);
    }

    public boolean processPayment(String type, double amount, String data) {
        PaymentMethod method = mPaymentMethods.get(type);
        return method.process(amount, data);
    }

    public double calculateProcessingFee(String type, double amount) {
        PaymentMethod method = mPaymentMethods.get(type);
        return method.calculateProcessingFee(amount);
    }
}
