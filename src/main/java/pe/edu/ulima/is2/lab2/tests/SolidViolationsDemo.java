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
            System.out.println("Proceso de pago correcto\n");
        } else {
            System.out.println("Error en el pago\n");
        }
    }

    private static void demonstrateLSPViolation() {
        System.out.println("--- LSP Violation ---");
        Product[] products = new Product[] {
                new PhysicalProduct() {{
                    name = "Laptop";
                    basePrice = 2500;
                }},
                new DigitalProduct() {{
                    name = "E-book";
                    basePrice = 50;
                }},
                new ServiceProduct() {{
                    name = "Mantenimiento";
                    basePrice = 120;
                }}
        };

        for (Product product : products) {
            System.out.println("Producto: " + product.getName());
            System.out.println("Precio: $" + product.calculatePrice());
            System.out.println();
        }
    }

    private static void demonstrateISPViolation() {
        System.out.println("--- ISP Violation ---");
        OrderManager basicOrders = new BasicOrderProcessor();
        basicOrders.createOrder("C001", new String[]{"P001", "P002"});

        ShippingService shipping = new ShippingOrderProcessor();
        shipping.calculateShippingCost("O001");
        shipping.scheduleDelivery("O001", "30-04-2026");
        shipping.trackShipment("O001");
        System.out.println();
    }

    private static void demonstrateDIPViolation() {
        System.out.println("--- DIP Violation ---");

        System.out.println("===== REAL =====");

        OrderService realService = DependencyInjector.createOrderService();
        realService.processOrder("CLI-001");
        realService.cancelOrder("ORDER-100", "CLI-001");

        System.out.println("\n===== MOCKS =====");

        OrderService testService = DependencyInjector.createTestOrderService();
        testService.processOrder("TEST-001");
        testService.cancelOrder("ORDER-100", "CLI-001");
    }
}