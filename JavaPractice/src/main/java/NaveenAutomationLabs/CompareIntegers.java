package NaveenAutomationLabs;

public class CompareIntegers {
    public static void main(String[] args){
        Integer n1 = 11;
        Integer n2 = 11;

        // integer caching -127 to 128
        // if number goes out of range, then no autoboxing will apply
        if(n1 == n2){
            System.out.println("equal");
        }else{
            System.out.println("Not equal");
        }
    }
}
