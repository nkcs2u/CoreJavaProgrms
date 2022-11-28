package NaveenAutomationLabs;

public class ReverseString{
    public static void main(String[] args){
        String name = "abcd";
        StringBuilder sb = new StringBuilder(name);
        System.out.println(sb.reverse());

        StringBuffer sb2 = new StringBuffer(name);
        System.out.println(sb2.reverse());

        String name_rev = "";
        for(int i=name.length()-1; i>=0; i--){
            name_rev = name_rev + name.charAt(i);
        }
        System.out.println(name_rev);


        // String is immutable
        //stringbuffer, stringbuild is mutable
        //string dont have reverse()

    }
}