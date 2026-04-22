package pe.edu.ulima.is2.lab2.tests;

import pe.edu.ulima.is2.lab2.corrected.DiscountCalculator;
import pe.edu.ulima.is2.lab2.corrected.User;
import pe.edu.ulima.is2.lab2.corrected.UserReportGenerator;

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