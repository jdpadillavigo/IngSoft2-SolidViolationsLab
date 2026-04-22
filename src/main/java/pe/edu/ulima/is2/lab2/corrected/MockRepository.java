package pe.edu.ulima.is2.lab2.corrected;

public class MockRepository implements OrderRepository {
    public MockRepository() {
    }

    @Override
    public void saveOrder(String orderData) {
        System.out.println("Guardando en base de datos alternativa mock: " + orderData);
    }

    @Override
    public String getCustomerData(String customerId) {
        return "Datos del cliente " + customerId + " desde BD alternativa mock";
    }
}
