package Project;

public abstract class SpaService implements SpaServiceRecord {
    private String date;
    private String therapist;
    private int quantity;
    private double price;

    public SpaService(String date, String therapist, int quantity, double price) {
        this.date = date;
        this.therapist = therapist;
        setQuantity(quantity);
        setPrice(price);
    }

    @Override
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    @Override
    public String getTherapist() { return therapist; }
    public void setTherapist(String therapist) { this.therapist = therapist; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) {
        if (quantity > 0) this.quantity = quantity;
        else this.quantity = 1;
    }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price >= 0) this.price = price;
        else this.price = 0.0;
    }

    public final double calculateTotal() {
        return quantity * price;
    }

    public abstract String getDescription();
}