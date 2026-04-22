package pe.edu.ulima.is2.lab2.corrected;

public class ShippingOrderProcessor implements OrderManager, ShippingService {
    @Override
    public void createOrder(String customerId, String[] productIds) {
        System.out.println("Creando pedido básico para cliente: " + customerId);
    }

    @Override
    public void cancelOrder(String orderId) {
        System.out.println("Cancelando pedido: " + orderId);
    }

    @Override
    public void updateOrderStatus(String orderId, String status) {
        System.out.println("Actualizando estado del pedido " + orderId + " a: " + status);
    }

    @Override
    public void calculateShippingCost(String orderId) {
        System.out.println("Calculando costo de envío para pedido: " + orderId);
    }

    @Override
    public void scheduleDelivery(String orderId, String deliveryDate) {
        System.out.println("Programando entrega del pedido " + orderId + " para: " + deliveryDate);
    }

    @Override
    public void trackShipment(String orderId) {
        System.out.println("Rastreando envío del pedido: " + orderId);
    }
}
