package NaveenAutomationLabs;

public class TrianglePattern02 {
    /*
        *
      * *
    * * *
  * * * *
* * * * *
     */

    public static void main(String[] args){

        int size = 5;

        for(int i=1; i<=size; i++){
            int j = 1;
            while (j<=(size - i)){
                j++;
                System.out.print(" ");
            }

            j = 1;
            while(j<= i){
                System.out.print("*");
                j++;
            }

            System.out.println("");
        }
    }

}
