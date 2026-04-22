package pe.edu.ulima.is2.lab2.corrected;

public interface InventoryManager {
    boolean checkProductAvailability(String productId, int quantity);
    void reserveProduct(String productId, int quantity);
    void releaseProductReservation(String productId, int quantity);
}
