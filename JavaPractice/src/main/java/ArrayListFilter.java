import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListFilter {

    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("abb");
        names.add("bcc");
        names.add("acc");
        names.add("dee");

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            String s = it.next();
            if(s.startsWith("a")){
                System.out.println(s);
            }
        }
    }
}
