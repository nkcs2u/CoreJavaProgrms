package NaveenAutomationLabs;

public class FinalizeUsage {

    public static void main(String[] args){
        FinalizeUsage fs1 = new FinalizeUsage();
        FinalizeUsage fs2 = new FinalizeUsage();

        // making to refer null, already created objects arelost references
        fs1 = null;
        fs2 = null;

        //call garbage collector, clear the objects with no reference
        System.gc();
    }

    // this will be calle automatically before gc() executes
    public void finalize(){
        System.out.println("Finalize method");
    }
}
