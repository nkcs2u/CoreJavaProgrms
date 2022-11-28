package NaveenAutomationLabs;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsInString {
    public static void main(String[] args){
        String str = "aa bb cc aa dd ee bb";
        HashMap<String , Integer> hm = new HashMap<String, Integer>();

        String[] str_spl = str.split(" ");

        for(int i=0; i<str_spl.length; i++){
            if(hm.containsKey(str_spl[i])){
                hm.put(str_spl[i] , hm.get(str_spl[i]) + 1);
            }else {
                hm.put(str_spl[i], 1);
            }
        }

        for (Map.Entry<String, Integer> x: hm.entrySet()){
            if(x.getValue() > 1){
                System.out.println(x.getKey());
            }
        }

        // or use set data structure, it returns -1 for duplicate when inserting.
    }
}
