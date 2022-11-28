public class VariablesDemo {
    String name;
    String address;
    static String city = "Banglore";
    static int objectCount=0;

    VariablesDemo(String name, String address){
        this.name = name;
        this.address = address;
        objectCount++;
    }

    // u ca call static method with class name
    // u cannot use instance variable inside static method
    //static method use to manipulate static variables
    // u can use static blocks to initialize the static variables. which runs befoore constructor
    public static void main(String[] args){

    }
}
