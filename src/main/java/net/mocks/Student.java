package net.mocks;
import java.util.ArrayList;

public class Student{

    ArrayList<Integer> scores;
    private double average;

    public ArrayList<Integer> getScores(){ return scores; }

    public double getAverage(){ return average; }

    private void computeAverage(){
        //valid code to compute average
        average = 1;//update average value
    }

    public Student(){
        computeAverage();
    }

    //other code irrelavant to this question not shown

}