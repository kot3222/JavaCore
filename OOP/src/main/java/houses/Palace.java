package houses;

public class Palace extends House {

    public Palace(String basement) {
        super(basement);
    }

    @Override
    public String getHouseName() {
        return "Palace";
    }

    @Override
    public String toString() {
        return "Palace " + super.toString();
    }
}
