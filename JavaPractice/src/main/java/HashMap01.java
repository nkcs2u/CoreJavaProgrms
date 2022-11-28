import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap01 {
    public static void main(String[] args){
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "aa");
        hm.put(2, "bb");
        hm.put(3, "cc");

        Set me =  hm.entrySet();
        Iterator it = me.iterator();

        while(it.hasNext()){
            Map.Entry me2 = (Map.Entry)it.next();
            System.out.println(me2.getKey() + " " + me2.getValue());
        }

        me.forEach(x -> {
            Map.Entry me2 = (Map.Entry)x;
            System.out.println(me2.getKey() + " " + me2.getValue());
        });


    }
}
