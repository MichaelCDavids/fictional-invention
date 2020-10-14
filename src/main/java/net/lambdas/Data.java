package net.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class Data {
    int value;

    Data(int value) {
        this.value = value;
    }

    public static ArrayList<Data> filterData(ArrayList<Data> dataList, Predicate<Data> p){
        Iterator<Data> i = dataList.iterator();
        while(i.hasNext()){
            if(p.test(i.next())){
                i.remove();
            }
        }
        return new ArrayList<Data>(dataList);
    }

    public static void main(String[] args) {
//        Data[] dataArr = new Data[]{};
//
//        List<Data> al = Arrays.asList(dataArr); //1

//        for (Data element : dataList) {
//
//            dataList.removeIf((Data d) -> {
//                return d.value % 2 == 0;
//            });  //2
//
////            System.out.println("Removed "+d+", "); //3
//        }
        ArrayList<Data> al = new ArrayList<>();
        Data d = new Data(1);
        al.add(d);
        d = new Data(2);
        al.add(d);
        d = new Data(3);
        al.add(d);

        //INSERT METHOD CALL HERE
        System.out.println(al);
        filterData(al, (Data x) -> x.value%2 == 0 );
        System.out.println(al);
        filterData(al, (Data x) -> x.value%2 == 0 );






    }

    public String toString() {
        return "" + value;
    }
}
