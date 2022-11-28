package NaveenAutomationLabs;

public class StringImmutableInJava {

    /*
    String is non primitive
    String pool memory in method area.
   same string values identifiers will refer to same string saved in pool memory

   immutable means u cannot change the value/state, instead it start refering to differemt value in pool

   class loading mechanism:

   optimization & performance :
   String class is final type : it can not be inheritted and overridden.

   wrapper classes Integer, Float, Double are final classes

     */

    public static void main(String[] args){
        String str1 = "aaa";
        String str2 = "aaa";

        System.out.println(str1 + " " + str2);
    }
}
