package net.api;

import java.util.ArrayList;
import java.util.List;

public class CheckRemoveReturnType {
    public static void main(String[] args) {
        List s1 = new ArrayList( );
        s1.add("a");
        s1.add("b");
        s1.add("c");
        s1.add("a");
        if(s1.remove("a")){
            if(s1.remove("a")){
                s1.remove("b");
            }else{
                s1.remove("c");
            }
        }
        System.out.println(s1);
    }
}
