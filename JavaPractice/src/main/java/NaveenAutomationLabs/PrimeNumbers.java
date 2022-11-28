package NaveenAutomationLabs;

public class PrimeNumbers {

    public static boolean primeCheck(int num){
        if(num<2){
            return false;
        }

        for(int i=2; i<num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        /*
        Prime number n can be devide by 1 or n
        n >= 2
        2 is minimum prime


         */
        System.out.println(primeCheck(4));


    }
}
