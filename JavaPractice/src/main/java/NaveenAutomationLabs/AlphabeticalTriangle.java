package NaveenAutomationLabs;

import java.security.PublicKey;

public class AlphabeticalTriangle {

    public static void main(String[] args){

        for(int i=1; i<=5; i++){
            int a = 'A';
            int j = 1;
            while(j<=i) {
                System.out.print((char) a + " ");
                a++;
                j++;
            }
            System.out.println("");
        }
    }
}
