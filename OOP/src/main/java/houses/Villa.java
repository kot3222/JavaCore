package houses;

public class Villa extends House {

    public Villa(String basement) {
        super(basement);
    }

    @Override
    public String getHouseName() {
        return "Villa";
    }

    @Override
    public String toString() {
        return "Villa " + super.toString();
    }
}
