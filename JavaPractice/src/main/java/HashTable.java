import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTable {
    public static void main(String[] args){
        Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
        ht.put("a", 1);
        ht.put("b", 2);

        Set hts = ht.entrySet();
        hts.forEach(x -> {
            Map.Entry me = (Map.Entry)x;
            System.out.println(me.getKey() + " " + me.getValue());
        });
    }

    /*
    HashMap not synchronized , not thread safe
    Hashtable is synchronized
    HashMap allows one null key, Hashtable donot
    HahTable do not allows the iterator object

     */
}
