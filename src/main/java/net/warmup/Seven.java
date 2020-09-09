package net.warmup;

public class Seven{

    int sum;

    int[][] array;

    public Seven(int[][] array){
        this.array = array;
    }

    public void sumOfMultiplesOfFive(){
        for(int i=0;i<this.array.length;i++){
            for(int j=0;j<this.array[i].length;j++){
                if(this.array[i][j]%5==0){
                    this.sum+=array[i][j];
                }
            }
        }
    }

    public int getSum(){
        return sum;
    }
}