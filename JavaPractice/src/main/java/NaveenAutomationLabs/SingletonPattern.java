package NaveenAutomationLabs;

public class SingletonPattern {
    //at a time only one object will be created and enabled
    // going to create another object, always it returns same object. refere to single object
    // constructor is private
    // write static method which returns singleton object
    // singleton also called lazy initialization

    private static SingletonPattern sp= null;
    public String str;

    private SingletonPattern(){
        str = "initialized";
    }

    public static SingletonPattern getInstance(){
        if(sp == null){
            sp = new SingletonPattern();
        }
        return sp;
    }

    public static void main(String[] args){
        SingletonPattern s1 = SingletonPattern.getInstance();

        SingletonPattern s2 = SingletonPattern.getInstance();

        SingletonPattern s3 = SingletonPattern.getInstance();

        s1.str = "s1";

        System.out.println(s2.str + " " + s3.str);
    }
}
