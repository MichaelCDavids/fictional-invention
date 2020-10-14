package net.datatypes;

class SomeClass{
    String s1 = "green mile";   // 0
    String local;   // 1
    public void generateReport( int n ){

        if( n > 0 ) local = "good";   //2

        System.out.println( s1+" = " + local );   //3
    }

    public static void main(String[] args) {
//        for(int i=0; i<5; i++){
//            System.out.println(i);
//        }
//        for(int i=0; i++<5; System.out.println(i));
        for(int i=0; i<5; System.out.println(++i));
//        int i=0; do { System.out.println(i); }while(i++<5);
    }
}