package net.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OneTest {

    @Test
    public void TestOne(){
        assertTrue(new One() instanceof One);
    }

    @Test
    public void m1(){
        One one = new One();

        assertEquals(300,one.m1(100));
    }

    @Test
    public void m2(){
        One one = new One();
        assertEquals(10000,one.m2(100));
    }

    @Test
    public void m3(){
        One one = new One();
        assertEquals(3000000,one.m3(100,100));
    }
}
