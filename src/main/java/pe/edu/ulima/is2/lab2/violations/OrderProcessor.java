package pe.edu.ulima.is2.lab2.violations;

public interface OrderProcessor {
    // Operaciones básicas de pedido
    void createOrder(String customerId, String[] productIds);

    void cancelOrder(String orderId);

    void updateOrderStatus(String orderId, String status);

    // Operaciones de pago
    boolean processPayment(String orderId, String paymentMethod, String paymentData);

    void processRefund(String orderId, double amount);

    // Operaciones de envío
    void calculateShippingCost(String orderId);

    void scheduleDelivery(String orderId, String deliveryDate);

    void trackShipment(String orderId);

    // Operaciones de inventario
    boolean checkProductAvailability(String productId, int quantity);

    void reserveProduct(String productId, int quantity);

    void releaseProductReservation(String productId, int quantity);

    // Operaciones de notificación
    void sendOrderConfirmation(String orderId);

    void sendShippingNotification(String orderId);

    void sendDeliveryNotification(String orderId);

    // Operaciones de reportes
    String generateOrderReport(String orderId);

    String generateDailyReport(String date);

    String generateCustomerReport(String customerId);
}