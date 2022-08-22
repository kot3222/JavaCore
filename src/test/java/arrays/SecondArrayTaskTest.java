package arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SecondArrayTaskTest {
    @Test
    public void testFirst() {
        int[] valuesFirst = new int[3];
        int[] valuesSecond = new int[2];
        int expectedResult = 5;
        int result = SecondArrayTask.fullSize(valuesFirst, valuesSecond);
        Assert.assertEquals(expectedResult, result);
    }
}