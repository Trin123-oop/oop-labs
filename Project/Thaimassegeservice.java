package Project;

public class Thaimassegeservice extends SpaService {
    private String pressureLevel;

    public Thaimassegeservice(String date, String therapist, int quantity, double price, String pressureLevel) {
        super(date, therapist, quantity, price);
        this.pressureLevel = pressureLevel;
    }

    public String getPressureLevel() { return pressureLevel; }
    public void setPressureLevel(String pressureLevel) { this.pressureLevel = pressureLevel; }

    @Override
    public String getDescription() {
        return "Thai Massage | Pressure: " + pressureLevel;
    }
}
