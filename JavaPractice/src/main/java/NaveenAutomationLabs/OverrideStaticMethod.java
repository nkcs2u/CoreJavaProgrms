package NaveenAutomationLabs;

public class OverrideStaticMethod {
    /*
    cannot overide static method
    but, we can overload static method

    if parent variable refers child class object, when call same static method name which is in both,
    then it executes parent logic
     */

    public static void fun(){
        System.out.println("Override static method");
    }

    public static void fun(int num){

    }

}
