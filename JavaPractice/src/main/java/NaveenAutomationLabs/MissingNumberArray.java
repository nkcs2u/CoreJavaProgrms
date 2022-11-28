package NaveenAutomationLabs;

public class MissingNumberArray {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 5, 6, 7};
        int sum_seq = 0;
        for(int i=1; i<=a[a.length-1]; i++){
            sum_seq = sum_seq + i;
        }

        int sum=0;
        for(int i=0; i<=a.length-1; i++){
            sum = sum + a[i];
        }

        System.out.println(sum_seq-sum);
    }
}
