package NaveenAutomationLabs;

import java.util.Locale;

public class StringManipulation {
    public static void main(String[] args){
        String str = "Chan Raama Ramma Krishna Krishna";
        System.out.println(str.length());

        System.out.println(str.charAt(6));

        System.out.println(str.indexOf('s'));

        System.out.println(str.indexOf('s', str.indexOf('s')+1));

        System.out.println(str.indexOf("Raama"));
        System.out.println(str.indexOf("Shiva"));


        String str2 = "Om namah shivaya";
        String str3 = "Chan Raama Ramma Krishna Krishna";

        System.out.println(str.equalsIgnoreCase(str3));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.equals(str3.toUpperCase()));


        System.out.println(str.substring(0, 9));

        String str4 = "   aaa   ";
        System.out.println(str4.trim());

        System.out.println(str4.replace(" " , "*"));

        String str5 = "Hello-world-of-coffy";
        System.out.println(str5.split("-").length);

        //concat()
        // str1 + str2
        // contains()
        // replaceAll()
        //

    }
}
