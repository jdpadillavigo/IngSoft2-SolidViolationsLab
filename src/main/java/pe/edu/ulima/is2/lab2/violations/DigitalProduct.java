package pe.edu.ulima.is2.lab2.violations;

public class DigitalProduct extends Product {
    public DigitalProduct(String name, double basePrice) {
        super(name, basePrice, 0.0); // Los productos digitales no tienen peso
    }

    @Override
    public double calculatePrice() {
        return basePrice; // Sin impuestos físicos
    }

    @Override
    public double calculateShippingCost() {
        // VIOLACIÓN LSP: Los productos digitales no deberían tener costo de envío
        // pero la clase base obliga a implementar este método
        throw new UnsupportedOperationException("Los productos digitales no tienen costo de envío");
    }

    @Override
    public boolean requiresPhysicalDelivery() {
        return false;
    }
}