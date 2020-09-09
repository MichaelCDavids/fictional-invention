package net.warmup;

public class Four {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0, j = 2; i < array.length; i++, j += 2) {
            array[i] = j;
        }


        Six six = new Six(array);
        six.sumOfMultiplesOfThree();
        System.out.println("Sum of multiples of three = " + six.getSum());


        Four four = new Four();
        // four.displayIntegerArray(array);
        // System.out.println(" ");
        String[] newArray = four.filterMultipleOfThreeAndFive(array);
        four.displayStringArray(newArray);
    }

    public void displayIntegerArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    public void displayStringArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    public String[] filterMultipleOfThreeAndFive(int[] array) {

        String[] temp = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                temp[i] = "*";
            } else if (array[i] % 5 == 0) {
                temp[i] = "*";
            } else {
                temp[i] = array[i] + "";
            }
        }

        return temp;
    }
}