import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListStreamFilter {
    public static void main(String[] args){
        ArrayList<String> names= new ArrayList<String>();
        names.add("abb");
        names.add("bcc");
        names.add("acc");
        names.add("dee");
        // predicate takes lambda

       long c =  names.stream().filter(s -> {
           s.startsWith("a");
           return false;}).count();
        System.out.println(c);

        c =  names.stream().filter(s -> s.startsWith("a") ).count();
        System.out.println(c);

        Stream.of("abb", "bcc", "add").filter(s -> s.startsWith("a"));

        names.stream().filter(s -> s.length()>4).forEach(s -> System.out.println(s));

        names.stream().filter(s -> s.length()>4).limit(1).forEach(s -> System.out.println(s));



    }
}
