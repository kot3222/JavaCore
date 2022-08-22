package arrays;

public class FirstArrayTask {
    public static int getCountEvenNumbers(int[] array) {
        int completeResult = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                completeResult++;
            }
        }

        return completeResult;
    }
}
