package NaveenAutomationLabs;

public class PallindromeCheckNumber {
    public static boolean pallindromeCheck(int num){

        int sum =0, num_orig = num;
        while(num>0){
            int r = num % 10;
            num = num/10;
            sum = sum*10 + r;
        }
        if(num_orig != sum){
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(pallindromeCheck(1551));
    }
}
