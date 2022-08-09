package branchoperators;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieAccessServiceTest {

    @Test

    public void MovieAccessFirstTest() {
        int userAge=0 ;
        String result=MovieAccessService.accessMovie(userAge);
        Assert.assertEquals("Incorrect age, check the user with the given age",result);
    }

    @Test

    public void MovieAccessSecondTest() {
        int userAge=19 ;
        String result=MovieAccessService.accessMovie(userAge);
        Assert.assertEquals("Rating R. Access is allowed.",result);
    }

    @Test

    public void MovieAccessThirdTest() {
        int userAge=22 ;
        String result=MovieAccessService.accessMovie(userAge);
        Assert.assertEquals("Rating F. Access is allowed.",result);
    }

    @Test

    public void MovieAccessFourthTest() {
        int userAge=12 ;
        String result=MovieAccessService.accessMovie(userAge);
        Assert.assertEquals("Access is denied",result);
    }
}