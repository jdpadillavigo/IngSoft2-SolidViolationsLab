package pe.edu.ulima.is2.lab2.corrected;

public abstract class Product {
    protected String name;
    protected double basePrice;

    public abstract double calculatePrice();

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }
}
