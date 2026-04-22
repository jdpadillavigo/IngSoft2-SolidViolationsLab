package pe.edu.ulima.is2.lab2.corrected;

public interface OrderRepository {
    void saveOrder(String orderData);
    String getCustomerData(String customerId);
}
