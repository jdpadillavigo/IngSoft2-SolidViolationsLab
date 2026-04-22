package pe.edu.ulima.is2.lab2.corrected;

public class DatabaseOrderRepository implements OrderRepository {
    public DatabaseOrderRepository() {}

    @Override
    public void saveOrder(String orderData) {
        System.out.println("Guardando en base de datos: " + orderData);
    }

    @Override
    public String getCustomerData(String customerId) {
        return "Datos del cliente " + customerId + " desde BD";
    }
}