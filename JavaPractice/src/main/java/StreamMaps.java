import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMaps {

    public static void main(String[] args){
        Stream.of("abb" , "abb", "ccc", "add").filter(s -> s.startsWith("a"))
                .map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

        Arrays.asList("add",  "ccc", "acc", "abb", "add").stream().filter(s -> s.startsWith("a")).sorted()
                .map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

        ArrayList<String> name1 = new ArrayList<String>();
        ArrayList<String> name2 = new ArrayList<String>();

        name1.add("aaa");
        name2.add("bbb");

        boolean flag = Stream.concat(name1.stream(), name2.stream()).anyMatch(s -> s.equalsIgnoreCase("aaa"));
        System.out.println(flag);

        List ls = Stream.of("abb", "bbb", "acc").filter(s -> s.startsWith("a")).collect(Collectors.toList());
        System.out.println(ls);

        Stream.of(1, 2,2,1,3,4).distinct().forEach(s-> System.out.println(s));

        System.out.println(Stream.of(1, 2,2,1,3,4).distinct().limit(2).collect(Collectors.toList() ));


    }
}
