package warmup.prep;

import java.util.ArrayList;
import java.util.List;

public class AppMethods {
    public static String[] getQuestionOptionsFromForm(String one, String two, String three, String four, String five, String six) {
        List<String> options = new ArrayList<String>();
        if (!one.isEmpty()) {
            options.add(one);
        }
        if (!two.isEmpty()) {
            options.add(two);
        }
        if (!three.isEmpty()) {
            options.add(three);
        }
        if (!four.isEmpty()) {
            options.add(four);
        }
        if (!five.isEmpty()) {
            options.add(five);
        }
        if (!six.isEmpty()) {
            options.add(six);
        }
        String[] stringArray = new String[options.size()];
        for (int i=0;i<options.size();i++){
            stringArray[i]=options.get(i);
        }
        return  stringArray;

    }

}
