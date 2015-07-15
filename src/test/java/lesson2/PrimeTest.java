package lesson2;

import org.testng.Assert;
import org.testng.annotations.Test;


public class PrimeTest {

    @Test()
    public void isPrimeNumberTest() {

        Assert.assertTrue(isPrime(6));

    }

    public boolean isPrime(int i) {
        return false;
    }
}
