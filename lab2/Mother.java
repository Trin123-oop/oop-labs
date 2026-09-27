package lab2;

public class Mother extends Parent {
    private Father husband;

    public Mother() { super(0); }

    public Father getHusband() { return husband; }

    @Override
    public String getFirstName() {
        return "Ms." + firstName;
    }
}
