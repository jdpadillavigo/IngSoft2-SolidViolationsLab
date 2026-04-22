package pe.edu.ulima.is2.lab2.corrected;

public class ServiceProduct extends Product implements Serviceable {
    private int duration;

    @Override
    public double calculatePrice() {
        return basePrice * 1.1; // Incluye comisión de servicio
    }

    @Override
    public void scheduleService() {

    }

    @Override
    public int getServiceDuration() {
        return duration;
    }
}
