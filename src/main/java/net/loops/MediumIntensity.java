package net.loops;

public class MediumIntensity {

    public static void main(String[] args) {
        int c =0;

        A: for (int i =0;i<2;i++){
            System.out.println("i="+i);
            B: for (int j =0;j<2;j++){
                System.out.println("j="+j);
                C: for (int k =0;k<3;k++){
                    System.out.println("k="+k);
                    c++;
                    if (k>j) break;
                }
            }
        }
        System.out.println(c);
    }
}
