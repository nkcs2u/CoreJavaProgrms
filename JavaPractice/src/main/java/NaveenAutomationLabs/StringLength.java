package NaveenAutomationLabs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLength {

    public static void main(String[] args){
        String str  = "abcde";
        System.out.println(str.toCharArray().length);

        System.out.println(str.lastIndexOf(""));

        Matcher e =Pattern.compile("$").matcher(str);
        e.find();
        int len = e.end();
        System.out.println(len);

        System.out.println(str.split("").length);

        int count = 0;
        for(char c : str){
            count++;
        }

        int i=0;
        while(true){
            if(str.charAt(i) == '$'){
                break;;
            }
            i++;
        }
    }
}
