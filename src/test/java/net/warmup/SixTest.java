package net.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SixTest {

    @Test
    public void SixTests() {
        int[] array = new int[10];
        for (int i = 0, j = 2; i < array.length; i++, j += 2) {
            array[i] = j;
        }
        assertTrue(new Six(array) instanceof  Six);
    }

    @Test
    public void getSum() {
        int[] array = new int[10];
        for (int i = 0, j = 2; i < array.length; i++, j += 2) {
            array[i] = j;
        }
        Six six = new Six(array);
        assertEquals(0,six.getSum());
    }

    @Test
    public void sumOfMultiples() {
        int[] array = new int[10];
        for (int i = 0, j = 2; i < array.length; i++, j += 2) {
            array[i] = j;
        }
        Six six = new Six(array);
        six.sumOfMultiplesOfThree();
        assertEquals(36,six.getSum());
    }
}
