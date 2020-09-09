package net.warmup;

public class Five {

    public static void main(String[] args) {
        Five five = new Five();

        int [][] array = five.fillTenByTenWithMultipleOfTwo();
        five.displayMultiDimensionalIntegerArray(array);

        String[][] filtered = five.filterMultipleOfThreeAndFive(array);
        five.displayMultiDimensionalStringArray(filtered);
    }

    public int[][] fillTenByTenWithMultipleOfTwo(){
        int[][] array = new int[10][10];

        for (int i = 0, k = 2; i < array.length; i++, k += 2) {
            for (int j = 0, l = k; j < array[i].length; j++, l += 2) {
                array[i][j] = l;
                k = l;
            }
        }
        return array;
    }

    public String[][] filterMultipleOfThreeAndFive(int[][] array) {

        String[][] temp = new String[array.length][array[0].length];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 3 == 0) {
                    temp[i][j] = "*";
                } else if (array[i][j] % 5 == 0) {
                    temp[i][j] = "*";
                } else {
                    temp[i][j] = array[i][j] + "";
                }
            }
        }
        return temp;
    }

    public void displayMultiDimensionalStringArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void displayMultiDimensionalIntegerArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }

}