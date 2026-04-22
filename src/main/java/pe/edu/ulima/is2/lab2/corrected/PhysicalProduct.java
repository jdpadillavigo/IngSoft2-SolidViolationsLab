package pe.edu.ulima.is2.lab2.corrected;

public class PhysicalProduct extends Product implements Shippable {
    private double weight;

    @Override
    public double calculatePrice() {
        return basePrice * 1.15; // Incluye impuestos
    }

    @Override
    public double calculateShippingCost() {
        return weight * 2.5; // $2.5 por kg
    }

    @Override
    public boolean requiresPhysicalDelivery() {
        return true;
    }
}
