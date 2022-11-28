import java.util.HashSet;
import java.util.Iterator;

public class CollectionIterator {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("aaa");
        hs.add("bbb");

        Iterator<String> it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}
