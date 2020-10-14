package net.datatypes;

public class WrappersAndShit {
    public static Integer wiggler(Integer x){
        Integer y = x + 10;
        x++;
        System.out.println(x);
        return y;
    }

    public static void main(String[] args){
//        Integer dataWrapper = new Integer(5);
//        Integer value = wiggler(dataWrapper);
//        System.out.println(dataWrapper+value);

        int i;
        int j;
        for (i = 0, j = 0 ; j < 1 ; ++j , i++){
            System.out.println( i + " " + j );
        }
        System.out.println( i + " " + j );
    }
}
