package NaveenAutomationLabs;

public class PrintNumbersWithoutUsingDigits {
    public static void main(String[] args){

        int one = 'A'/'A';
        String s1 = "..........";

        for(int i=one; i<(s1.length() * s1.length()); i++){
            System.out.println(i);
        }

        //method 2
        for(int i=one; i<= 'd'; i++){
            System.out.println(i);
        }
    }
}
