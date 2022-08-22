package houses;

import java.util.Arrays;

public class House {

    private String houseName;

    private String basement;


    private String[] residents = new String[]{"Ivan", "Semen", "Dima"};


    public House(String basement) {
        this.basement = basement;
    }


    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getBasement() {
        return basement;
    }

    public void setBasement(String basement) {
        this.basement = basement;
    }

    public void setResidents(String[] residents) {
        this.residents = new String[3];
    }

    @Override
    public String toString() {
        return "basement='" + basement + '\'' + ", residents=" + Arrays.toString(residents);
    }
}
