package NaveenAutomationLabs;

public class OverrideStaticMethodChild extends OverrideStaticMethod {

    public static void fun(){
        System.out.println("Child class");
    }

    public static void main(String[] args){
        OverrideStaticMethod oc = new OverrideStaticMethodChild();
        oc.fun();
    }
}
