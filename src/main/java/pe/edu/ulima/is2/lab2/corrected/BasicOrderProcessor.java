package pe.edu.ulima.is2.lab2.corrected;

public class BasicOrderProcessor implements OrderManager {
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
}
