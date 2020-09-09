package net.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SevenTest {

    private int[][] multipleOfTwoArray(){
        int[][] array = new int[10][10];

        for (int i = 0, k = 2; i < array.length; i++, k += 2) {
            for (int j = 0, l = k; j < array[i].length; j++, l += 2) {
                array[i][j] = l;
                k = l;
            }
        }

        return array;

    }
    @Test
    public void sevenTest(){
        assertTrue(new Seven(multipleOfTwoArray()) instanceof Seven);
    }

    @Test
    public void sumMuliptesOfFiveMethod(){
        Seven seven = new Seven(multipleOfTwoArray());
        seven.sumOfMultiplesOfFive();
        assertEquals(2100,seven.getSum());
    }
}
