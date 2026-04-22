package pe.edu.ulima.is2.lab2.violations;

public class ServiceProduct extends Product {
    public ServiceProduct(String name, double basePrice) {
        super(name, basePrice, 0.0);
    }

    @Override
    public double calculatePrice() {
        return basePrice * 1.1; // Incluye comisión de servicio
    }

    @Override
    public double calculateShippingCost() {
        // VIOLACIÓN LSP: Los servicios no se envían físicamente
        return 0.0; // Comportamiento inconsistente - debería ser null o excepción
    }

    @Override
    public boolean requiresPhysicalDelivery() {
        return false;
    }
}