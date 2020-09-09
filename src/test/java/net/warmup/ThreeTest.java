package net.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ThreeTest {

    @Test
    public void ThreeTest(){
        assertTrue(new Three() instanceof Three);
    }

    @Test
    public void setValuesAndCalculate(){
        Three three = new Three();
        three.setValueOne(12);
        three.setValueTwo(15);
        assertEquals(318000,three.calculate());
    }

}
