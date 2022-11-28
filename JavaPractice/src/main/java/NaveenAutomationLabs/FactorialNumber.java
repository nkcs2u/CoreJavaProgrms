package NaveenAutomationLabs;

public class FactorialNumber {

    public static void factorial(int num){

        if(num>=0) {
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }

            System.out.println(fact);
        } else if (num < 0) {
            System.out.println("Wrong number");
        }
    }

    public static int factorial2(int num){
        if(num <= 0){
            System.out.println("Wrong number");
            return -1;
        } else if (num==1) {
            return 1;
        }else {
            return num * factorial2(num-1);
        }
    }

    public static void main(String[] args){
        //factorial(0);
        System.out.println(factorial2(-1));
    }
}
