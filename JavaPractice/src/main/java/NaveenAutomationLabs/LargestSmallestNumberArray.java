package NaveenAutomationLabs;

public class LargestSmallestNumberArray {
    public static void main(String[] args){
        int[] arr = { 2,6,4,1, 8, 9, 7, 2, -100};
        int largest = arr[0];
        int smallest = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }

            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }

        System.out.println(largest + " " + smallest);
    }
}
