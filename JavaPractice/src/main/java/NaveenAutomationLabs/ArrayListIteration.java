package NaveenAutomationLabs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("aaa");
        names.add("bbb");
        names.add("ccc");
        names.add("ddd");

        //using lambda expression
        names.forEach(x -> System.out.println(x));

        //using iterator
        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //3rd type
        Iterator<String> it2 = names.iterator();
        it2.forEachRemaining(x -> System.out.println(x));

        //for loop
        for(String x: names){
            System.out.println(x);
        }

        // for index
        for(int i=0; i<names.size(); i++){
            System.out.println(names.get(i));
        }

        // list iterator, reverse also possible
        ListIterator<String> li = names.listIterator(names.size());
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}
