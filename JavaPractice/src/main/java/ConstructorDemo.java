public class ConstructorDemo {

   public ConstructorDemo(){
        System.out.println("ConstructorDemo - default constructor has called");
    }

    public ConstructorDemo(int a){
        System.out.println("ConstructorDemo - with parameter constructor");
    }

    public static void main(String[] args){
        /* if any parameterized constructor is define, then it wont provide any implicit constructors */
        ConstructorDemo cd = new ConstructorDemo();
        ConstructorDemo cd1 = new ConstructorDemo(1);
    }
}
