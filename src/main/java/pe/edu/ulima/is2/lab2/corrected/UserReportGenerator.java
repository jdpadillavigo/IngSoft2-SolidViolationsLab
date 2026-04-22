package pe.edu.ulima.is2.lab2.corrected;

public class UserReportGenerator {
    private DiscountCalculator mDiscountCalculator;

    public UserReportGenerator(DiscountCalculator mDiscountCalculator) {
        this.mDiscountCalculator = mDiscountCalculator;
    }

    public String generateUserReport(User user) {
        return "=== REPORTE DE USUARIO ===\n"
                + "Nombre: " + user.getName() + "\n"
                + "Email: " + user.getEmail() + "\n"
                + "Tipo: " + user.getUserType() + "\n"
                + "Total Compras: $" + user.getTotalPurchases() + "\n"
                + "Descuento Aplicable: " + (mDiscountCalculator.calculateDiscount(user) * 100) + "%\n";
    }
}
