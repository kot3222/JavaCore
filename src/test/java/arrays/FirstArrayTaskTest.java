package arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstArrayTaskTest {

    @Test
    public void firstTest(){
     int[] values=new int[6];
     values[0]=16;
     values[1]=36;
     values[2]=23;
     values[3]=32;
     values[4]=7;
     values[5]=44;
     int expectedResult=4;
     int result=FirstArrayTask.getCountEvenNumbers(values);
        Assert.assertEquals(expectedResult,result);
    }
}