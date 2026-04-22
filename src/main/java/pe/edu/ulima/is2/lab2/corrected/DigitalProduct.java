package pe.edu.ulima.is2.lab2.corrected;

public class DigitalProduct extends Product implements Downloadable {
    private String downloadUrl;
    private long fileSize;

    @Override
    public double calculatePrice() {
        return basePrice; // Sin impuestos físicos
    }

    @Override
    public String getDownloadUrl() {
        return downloadUrl;
    }

    @Override
    public long getFileSize() {
        return fileSize;
    }
}
