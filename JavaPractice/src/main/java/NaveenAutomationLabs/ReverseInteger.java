package NaveenAutomationLabs;

public class ReverseInteger {
    public static void main(String[] args){
        int num = 1234, rev = 0;

        while(num != 0){
            int rem = num % 10;
            num = num/10;
            rev = rev*10 + rem;
        }

        System.out.println(rev);

        num = 1234;
        StringBuffer sb = new StringBuffer(String.valueOf(num));

        System.out.println(sb.reverse());
    }
}
