package pe.edu.ulima.is2.lab2.corrected;

public class OrderService {
    private final NotificationService notificationService;
    private final Logger logger;
    private final OrderRepository repository;

    public OrderService(NotificationService notificationService, Logger logger, OrderRepository orderRepository) {
        this.notificationService = notificationService;
        this.logger = logger;
        this.repository = orderRepository;
    }

    public void processOrder(String customerId){
        logger.log("Iniciando procesamiento de pedido para cliente: " + customerId);

        // Lógica de negocio
        String customerData = repository.getCustomerData(customerId);
        logger.log("Datos de cliente obtenidos: " + customerData);

        // Crear pedido
        String orderId = "ORDER-" + System.currentTimeMillis();
        String orderData = "Pedido " + orderId + " para cliente " + customerId;

        // Guardar en base de datos
        repository.saveOrder(orderData);
        logger.log("Pedido guardado: " + orderId);

        // Enviar notificación
        notificationService.sendNotification(
                customerId,
                "Confirmación de pedido",
                "Su pedido " + orderId + " ha sido procesado"
        );

        logger.log("Pedido procesado completamente: " + orderId);
    }

    public void cancelOrder(String orderId, String customerId) {
        logger.log("Cancelando pedido: " + orderId);
        repository.saveOrder("CANCELLED: " + orderId);
        notificationService.sendNotification(
                customerId,
                "Cancelación de pedido",
                "Su pedido " + orderId + " ha sido cancelado"
        );
        logger.log("Pedido cancelado: " + orderId);
    }
}
