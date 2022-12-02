package NaveenAutomationLabs;

public class PyramidPattern {
    /*

    *
   * *
  * * *
 * * * *
* * * * *
     */

    public static void main(String[] args){

        int star_size = 5;

        for(int i=1; i<= star_size; i++){
            int j = star_size - i;
            while (j > 0){
                j--;
                System.out.print(" ");
            }

            j = i;
            while(j>0){
                j--;
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
