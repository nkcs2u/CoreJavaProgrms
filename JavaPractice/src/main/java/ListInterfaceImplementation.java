import java.util.ArrayList;
import java.util.Collections;

public class ListInterfaceImplementation {

    public static void main(String[] args){
        //ArrayList
        ArrayList<String> a = new ArrayList<String>();
        a.add("aaa");
        a.add("bbb");
        System.out.println(a);

        a.add(0, "ccc");
        System.out.println(a);

        a.remove(1);
        System.out.println(a);

        a.remove("bbb");
        System.out.println(a);


        //removeAll() method
        //a.contains("ccc")
        //a.get(2) - index pos
        //a.indexOf("ccc")
        //a.isEmpty()
        //a.size()
        // ArrayList can accepts duplicate values
        // ArrayList, LinkedList, Vector implements List interface
        // all above can have duplicate
        // array have fixed size, ArrayList can grow dynamically
        //
        System.out.println(a);
        /*
        Array:
            . static size at the time of declaration
            . in array identifier refers to memory address, in arraylist it prints the datatype value
         */
    }
}
