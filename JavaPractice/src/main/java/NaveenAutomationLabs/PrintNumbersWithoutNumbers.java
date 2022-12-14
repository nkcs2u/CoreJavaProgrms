package NaveenAutomationLabs;

import java.util.Arrays;
import java.util.BitSet;

public class PrintNumbersWithoutNumbers {
    public static void main(String[] args){
        Object num[] = new Object[100];
        Arrays.fill(num, new Object(){
            int count = 0;
            @Override
            public String toString(){
                return Integer.toString(++count);
            }
        });

        // print num

        String str = new BitSet() {{set(1,101);}}.toString();
        System.out.append(str , 1, str.length());
    }
}
