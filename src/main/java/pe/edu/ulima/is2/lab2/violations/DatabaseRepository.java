package pe.edu.ulima.is2.lab2.violations;

public class DatabaseRepository {
    public void saveOrder(String orderData) {
        System.out.println("Guardando en base de datos: " + orderData);
        // Simulación de guardado en BD
    }

    public String getCustomerData(String customerId) {
        return "Datos del cliente " + customerId + " desde BD";
    }
}