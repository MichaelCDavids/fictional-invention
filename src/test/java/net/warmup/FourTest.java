package net.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FourTest {

    @Test
    public void InstanceTest(){
        assertTrue(new Four() instanceof Four);
    }

    @Test
    public void displayIntegerArray(){
        Four four = new Four();

        int [] array = {1,2,3,4,5,6,7,8,9,10};

        four.displayIntegerArray(array);
    }

    @Test
    public void displayStringArray(){
        Four four = new Four();

        String [] array = {"1","2","3","4","5","6","7","8","9","10"};

        four.displayStringArray(array);
    }

    @Test
    public void filterOutMultiplesWithStar(){
        Four four = new Four();

        int [] array = {1,2,3,4,5,6,7,8,9,10};

        String [] stringArray = four.filterMultipleOfThreeAndFive(array);

        four.displayStringArray(
                stringArray
        );
    }


}
