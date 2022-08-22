package figure;

public class GeometricFigure {

    private String figureName;
    private int axisValue;

    public GeometricFigure(String figureName, int axisValue) {
        this.figureName = figureName;
        this.axisValue = axisValue;
    }

    public String getFigureName() {
        return figureName;
    }

    public void setFigureName(String figureName) {
        this.figureName = figureName;
    }

    public int getAxisValue() {
        return axisValue;
    }

    public void setAxisValue(int axisValue) {
        this.axisValue = axisValue;
    }

    @Override
    public String toString() {
        return "figureName='" + figureName + '\'' +
                ", axisValue=" + axisValue;
    }
}

