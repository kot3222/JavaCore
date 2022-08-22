package string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test

    public void getTheBiggestString() {
        String[] strings = {
                "Губка боб, Патрик, Сэнди",
                "Планктон, Сквидвард, Пэрл",
                "Мистер Крабс, Летучий Голандец, Бабуля Спанч Боба",
                "Житель бикини ботом 1, Житель Бикини ботом 2"
        };

        BigString bigString = StringUtils.getTheBiggestStringFromArray(strings);
        Assert.assertEquals(49, bigString.getLength());
        Assert.assertEquals("Мистер Крабс, Летучий Голандец, Бабуля Спанч Боба", bigString.getValue());
    }

    @Test
    public void whenEmptyArrayString() {
        String[] strings = {};
        BigString bigString = StringUtils.getTheBiggestStringFromArray(strings);
        Assert.assertNull(bigString);
    }
}