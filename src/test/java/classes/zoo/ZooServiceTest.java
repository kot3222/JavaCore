package classes.zoo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZooServiceTest {
    @Test
    public void getAveragePriceByZoos() {
        Zoo kazanZoo = new Zoo(
                1250,
                "KazanZoo",
                new Animal[]{
                        new Animal("Тигр"),
                        new Animal("Лиса"),
                        new Animal("Зебра")
                }
        );

        Zoo moscowZoo = new Zoo(
                2650,
                "MoscowZoo",
                new Animal[]{
                        new Animal("Панда"),
                        new Animal("Фламинго"),
                        new Animal("Дикобраз"),
                        new Animal("Страус"),
                        new Animal("Бобёр")
                }
        );

        Zoo prahaZoo = new Zoo(
                1750,
                "PrahaZoo",
                new Animal[]{
                        new Animal("Слон"),
                        new Animal("Пингвин"),
                        new Animal("Леопард"),
                        new Animal("Змея")
                }
        );

        Zoo[] zoos = {kazanZoo, moscowZoo, prahaZoo};

        ZooService zooService = new ZooService();

        long result = zooService.getAveragePriceByZoos(zoos);
        // 1750+2650+1250=5650/3=1883,33
        Assert.assertEquals(1883, result);
    }

    @Test

    public void getTheBiggestZoo() {
        Zoo kazanZoo = new Zoo(
                1250,
                "KazanZoo",
                new Animal[]{
                        new Animal("Тигр"),
                        new Animal("Лиса"),
                        new Animal("Зебра")
                }
        );

        Zoo moscowZoo = new Zoo(
                2650,
                "MoscowZoo",
                new Animal[]{
                        new Animal("Панда"),
                        new Animal("Фламинго"),
                        new Animal("Дикобраз"),
                        new Animal("Страус"),
                        new Animal("Бобёр")
                }
        );

        Zoo prahaZoo = new Zoo(
                1750,
                "PrahaZoo",
                new Animal[]{
                        new Animal("Слон"),
                        new Animal("Пингвин"),
                        new Animal("Леопард"),
                        new Animal("Змея")
                }
        );

        Zoo[] zoos = {kazanZoo, moscowZoo, prahaZoo};

        ZooService zooService = new ZooService();
        ZooResult result = zooService.getNameByThrBiggestZoos(zoos);
        String expectedName = "MoscowZoo";

        int expectedAnimalsSize = 5;

        System.out.println(result.getName());
        System.out.println(result.getSizeAnimals());
        Assert.assertEquals(expectedName, result.getName());
        Assert.assertEquals(expectedAnimalsSize, result.getSizeAnimals());
    }
}


