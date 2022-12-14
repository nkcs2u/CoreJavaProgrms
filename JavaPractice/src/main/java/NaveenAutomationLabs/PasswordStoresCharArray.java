package NaveenAutomationLabs;

import java.util.Arrays;

public class PasswordStoresCharArray {
    public static void main(String[] args){
        // if password string is replaced with different string , it will get garbaged.
        // chances of leaking
        //instead save the password in chararray,

        char c[] = new char[] {'a', 'b', 'c'};
        //print c

        //while garbage
        Arrays.fill(c , '*');
        //safe
    }
}
