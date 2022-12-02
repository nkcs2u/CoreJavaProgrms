package NaveenAutomationLabs;

public class TrianglePattern01 {
    /*
    *
    * *
    * * *
    * * * *
    * * * * *
     */
    public static void main(String[] args){

        for(int i=1; i<=5; i++){
            int j = 1;
            while(j<=i) {
                System.out.print("* ");
                j++;
            }
            System.out.println("");
        }
    }

}
