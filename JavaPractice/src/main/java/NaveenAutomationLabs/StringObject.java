package NaveenAutomationLabs;

public class StringObject {
    public static void main(String[] args){
        String s1 = new String("Hello");

        /*
        stack mem
            s1
        heap mem
            string pool
            String value in pool
        in heap String object created

        when use string litteral type initialize, dont create the String object. only pool value
         */
    }
}
