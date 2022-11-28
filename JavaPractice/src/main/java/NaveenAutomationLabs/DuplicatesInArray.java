package NaveenAutomationLabs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicatesInArray {
    public static void main(String[] args){
        String[] arr = {"a", "b", "c", "b" };
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i].equals(arr[j])){
                    System.out.println("Duplicate : " + arr[i]);
                }
            }
        }

        //method-2
        // using hashset, unique values
        Set<String> hs = new HashSet<String>();
        for(String name : arr){
            if(hs.add(name) == false){
                System.out.println("Duplicate : " + name);
            }
        }

        //method-3
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(String name: arr){
            if(hm.containsKey(name)){
                hm.put(name, hm.get(name) + 1);
            }else{
                hm.put(name, 1);
            }
        }

        // traver se map
        Set<Map.Entry<String, Integer>> hs3 = hm.entrySet();
        for(Map.Entry e: hs3){
            System.out.println(e.getKey() + " " + e.getValue());
        }

        Set<String> hs2 = hm.keySet();
        for(String key: hs2){
            if(hm.get(key) > 1){
                System.out.println("Duplicate : " + key);
            }
        }
    }
}
