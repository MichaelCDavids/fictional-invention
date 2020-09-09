package net.warmup;

public class Eight {

    int sum;

    int multiple;

    int[][] array;

    public Eight(int[][] array) {
        this.array = array;
    }

    public void sumOfMultiplesOfNumber() {
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array[i].length; j++) {
                if (this.array[i][j] % this.multiple == 0) {
                    this.sum += array[i][j];
                }
            }
        }
    }

    public void setMultiple(int multiple) {
        this.multiple = multiple;
    }

    public int getSum() {
        return sum;
    }


}