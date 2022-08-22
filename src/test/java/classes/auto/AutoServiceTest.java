package classes.auto;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

public class AutoServiceTest {

    private Auto[] autos = {
            new Auto("BMW", "M5", 2, "Automatic"),
            new Auto("Kia", "Ceed", 5, "MT"),
            new Auto("Mercedes", "E43", 2, "Automatic"),
            new Auto("Ford", "Explorer", 7, "MT"),
            new Auto("Mercedes", "C300", 2, "Automatic"),
            new Auto("Mercedes", "E220d", 4, "Automatic")
    };

    @Test
    public void getOnlyModelNameTest() {

        AutoService autoService = new AutoService();
        Auto[] resultArray = autoService.getOnlyModelName(autos, "BMW");
        Arrays.stream(resultArray)
                .forEach(System.out::println);
    }

    @Test
    public void getSportCarsTest() {

        AutoService autoService = new AutoService();
        Auto[] resultArray = autoService.getSportCars(autos, 2);
        Arrays.stream(resultArray)
                .forEach(System.out::println);
    }

    @Test
    public void getOnlyAutomaticTypeCarsTest() {

        AutoService autoService = new AutoService();
        Auto[] resultArray = autoService.getOnlyAutomaticTypeCars(autos, "Automatic");
        Arrays.stream(resultArray)
                .forEach(System.out::println);
    }

    @Test
    public void getOnlyMercedesEClassCarsTest() {

        AutoService autoService = new AutoService();
        Auto[] resultArray = autoService.getOnlyMercedesEClassCars(autos, "Mercedes");
        Arrays.stream(resultArray)
                .forEach(System.out::println);
    }
}