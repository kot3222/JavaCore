package classes.zoo;

public class ZooService {

    public long getAveragePriceByZoos(Zoo[] zoos) {

        double allPrices = 0;

        for (Zoo zoo : zoos) {

            allPrices = allPrices + zoo.getPrice();
        }

        long result = Math.round(allPrices / zoos.length);

        return result;
    }

    public ZooResult getNameByThrBiggestZoos(Zoo[] zoos) {

        String name = "";
        int countAnimalsInZoo = 0;


        for (Zoo zoo : zoos) {
            int animalsSize = zoo.getAnimals().length;
            if (animalsSize > countAnimalsInZoo) {
                countAnimalsInZoo = animalsSize;
                name = zoo.getName();
            }
        }
        return new ZooResult(name, countAnimalsInZoo);
    }
}
