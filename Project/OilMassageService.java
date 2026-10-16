package Project;

public class OilMassageService extends SpaService {
    private String oilScent;

    public OilMassageService(String date, String therapist, int quantity, double price, String oilScent) {
        super(date, therapist, quantity, price);
        this.oilScent = oilScent;
    }

    public String getOilScent() { return oilScent; }
    public void setOilScent(String oilScent) { this.oilScent = oilScent; }

    @Override
    public String getDescription() {
        return "Oil Massage | Scent: " + oilScent;
    }
}