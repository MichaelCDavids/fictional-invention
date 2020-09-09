package net.warmup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TwoTest {

    @Test
    public void TwoTest(){
        assertTrue(new Two(1,2) instanceof Two);
    }

    @Test
    public void methodForTwo(){
        Two two = new Two(1,2);

        assertEquals(40200,two.methodForTwo());
    }

}
