package net.warmup;

public class Six {

    int sum;

    int[] array;

    public Six(int[] array) {
        this.array = array;
    }

    public void sumOfMultiplesOfThree() {
        for (int i = 0; i < this.array.length; i++) {
            if (array[i] % 3 == 0) {
                this.sum += array[i];
            }
        }
    }

    public int getSum() {
        return sum;
    }
}