package Leet;

import org.junit.Assert;
import org.junit.Test;

public class HappyNumbersTest {

    @Test
    public void isHappyTest(){
        int n = 19;
        HappyNumbers h = new HappyNumbers();
        boolean expected = true;
        boolean actual = h.isHappy(n);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void isHappyTest2(){
        int n = 2;
        HappyNumbers h = new HappyNumbers();
        boolean expected = false;
        boolean actual = h.isHappy(n);

        Assert.assertEquals(expected, actual);

    }





  
}