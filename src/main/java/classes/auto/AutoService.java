package classes.auto;

public class AutoService {
    /**
     * Данный метод возвращает автомобили марки BMW
     * @param autos все автомобили
     * @return массив автомобилей БМВ.
     */
    public Auto[] getOnlyModelName(Auto[] autos, String model) {

        int count = 0;
        for (Auto auto : autos) {
            if (auto.getModel().equals(model)) {
                count++;
            }
        }

        Auto[] result = new Auto[count];

        for (Auto auto : autos) {
            if (auto.getModel().equals(model)) {
                count--;
                result[count] = auto;
            }
        }
        return result;
    }

    /**
     * Принято считать что если автомобиль двух-местный, то он из спорт-класса
     * Данный метод возвращает автомобили спорт-класса
     * @param autos все автомобили
     * @return автомобили спорт-класса
     */
    public Auto[] getSportCars(Auto[] autos, int seatsCount) {
        int count = 0;
        for (Auto auto : autos) {
            if (auto.getSeatsCount() == 2) {
                count++;
            }
        }

        Auto[] result = new Auto[count];

        for (Auto auto : autos) {
            if (auto.getSeatsCount() == 2) {
                count--;
                result[count] = auto;
            }
        }
        return result;
    }

    /**
     * Данный метод возвращает автомобили только с автоматической коробкой передач
     * @param autos все автомобили
     * @return автомобили с автоматической коробкой передач.
     */
    public Auto[] getOnlyAutomaticTypeCars(Auto[] autos, String transmission) {
        int count = 0;

        for (Auto auto : autos) {
            if (auto.getTransmission().equals(transmission)) {
                count++;
            }
        }

        Auto[] result = new Auto[count];

        for (Auto auto : autos) {
            if (auto.getTransmission().equals(transmission)) {
                count--;
                result[count] = auto;
            }
        }
        return result;
    }

    /**
     * Данный метод возвращает автомобили Mercedes E-класса
     * @param autos все автомобили
     * @return автомобили Mercedes Е-класса
     */

    public Auto[] getOnlyMercedesEClassCars(Auto[] autos, String model) {
        int count = 0;

        for (Auto auto : autos) {
            if (auto.getModel().equals(model) && auto.getMark().contains("E")) {
                count++;
            }
        }

        Auto[] result = new Auto[count];

        for (Auto auto : autos) {
            if (auto.getModel().equals(model) && auto.getMark().contains("E")) {
                count--;
                result[count] = auto;
            }
        }
        return result;
    }
}
