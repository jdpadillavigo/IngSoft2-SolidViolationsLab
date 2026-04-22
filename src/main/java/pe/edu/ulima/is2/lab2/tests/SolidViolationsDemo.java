package pe.edu.ulima.is2.lab2.tests;

import pe.edu.ulima.is2.lab2.corrected.*;

public class SolidViolationsDemo {
    public static void main(String[] args) {
        System.out.println("=== DEMOSTRACIÓN DE VIOLACIONES SOLID ===\n");

        // TODO: Ejecutar ejemplos de cada violación
        // TODO: Mostrar problemas que causan
        // TODO: Ejecutar versiones corregidas
        // TODO: Comparar diferencias

        demonstrateSRPViolation();
        demonstrateOCPViolation();
        demonstrateLSPViolation();
        demonstrateISPViolation();
        demonstrateDIPViolation();
    }

    private static void demonstrateSRPViolation() {
        System.out.println("--- SRP Violation ---");
        User user = new User(
                "Pepito",
                "pepito@ulima.edu.pe",
                "PREMIUM",
                250
        );

        DiscountCalculator calculator = new DiscountCalculator();
        UserReportGenerator generator = new UserReportGenerator(calculator);

        System.out.println(generator.generateUserReport(user));
    }

    private static void demonstrateOCPViolation() {
        System.out.println("--- OCP Violation ---");
        // TODO: Implementar demostración
        PaymentProcessor procesador = new PaymentProcessor();
        PaymentMethod tarjeta = new CreditCardPayment();
        PaymentMethod bitcoin = new ApplePayPayment();
        PaymentMethod transferencia = new BankTransferPayment();
        PaymentMethod paypal = new PaypalPayment();

        procesador.registerPaymentMethod(tarjeta);
        procesador.registerPaymentMethod(bitcoin);
        procesador.registerPaymentMethod(transferencia);
        procesador.registerPaymentMethod(paypal);

        if(procesador.processPayment(
                tarjeta.getPaymentType(),
                400,
                "1234567890123456"
        )) {
            System.out.println("Proceso de pago correcto");
        } else {
            System.out.println("Error en el pago");
        }
    }

    private static void demonstrateLSPViolation() {
        System.out.println("--- LSP Violation ---");
        // TODO: Implementar demostración
    }

    private static void demonstrateISPViolation() {
        System.out.println("--- ISP Violation ---");
        // TODO: Implementar demostración
    }

    private static void demonstrateDIPViolation() {
        System.out.println("--- DIP Violation ---");
        // TODO: Implementar demostración
    }
}