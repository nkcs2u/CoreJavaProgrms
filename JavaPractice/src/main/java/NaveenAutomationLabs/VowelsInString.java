package NaveenAutomationLabs;

import java.util.Arrays;
import java.util.Locale;

public class VowelsInString {

    public static void main(String[] args){
        //method 1
        String str = "aAsegh";

        for(char c : Arrays.asList(str.toLowerCase().toCharArray())){
            isVowel(c);
        }

    }

    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';

    }

    //method 2
    public static void count() {
        IntPredicate vowel = new IntPredicate() {
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
        String test = " ";
        test.chars().filter(vowel).count();
    }
    
    //method 3
    public static void method3(){
        String test = "";
        // google guava library
        String st = "aaaa";
        CharMatcher.anyOf("aeiou").countInt(st);

    }
}
