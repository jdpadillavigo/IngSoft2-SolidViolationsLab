package pe.edu.ulima.is2.lab2.corrected;

public interface ShippingService {
    void calculateShippingCost(String orderId);
    void scheduleDelivery(String orderId, String deliveryDate);
    void trackShipment(String orderId);
}
