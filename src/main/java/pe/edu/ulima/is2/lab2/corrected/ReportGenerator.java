package pe.edu.ulima.is2.lab2.corrected;

public interface ReportGenerator {
    String generateOrderReport(String orderId);
    String generateDailyReport(String date);
    String generateCustomerReport(String customerId);
}
