package net.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class EightTest {



    @Test
    public void EightTest() {
        int[][] array = new int[10][10];

        for (int i = 0, k = 2; i < array.length; i++, k += 2) {
            for (int j = 0, l = k; j < array[i].length; j++, l += 2) {
                array[i][j] = l;
                k = l;
            }
        }


        Eight instance = new Eight(array);

        assertTrue(instance instanceof Eight);

    }

    @Test
    public void EightSetMultiple() {
        int[][] array = new int[10][10];

        for (int i = 0, k = 2; i < array.length; i++, k += 2) {
            for (int j = 0, l = k; j < array[i].length; j++, l += 2) {
                array[i][j] = l;
                k = l;
            }
        }


        Eight instance = new Eight(array);

        instance.setMultiple(6);
        instance.sumOfMultiplesOfNumber();

        assertEquals(3366,instance.getSum());

    }

    @Test
    public void EightSumOfMultiple() {
        int[][] array = new int[10][10];

        for (int i = 0, k = 2; i < array.length; i++, k += 2) {
            for (int j = 0, l = k; j < array[i].length; j++, l += 2) {
                array[i][j] = l;
                k = l;
            }
        }


        Eight instance = new Eight(array);

        instance.setMultiple(3);
        instance.sumOfMultiplesOfNumber();

        assertEquals(3366,instance.getSum());

    }

}
