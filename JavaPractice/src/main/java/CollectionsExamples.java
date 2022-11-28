import java.util.ArrayList;

public class CollectionsExamples {
    public static void main(String[] args){
        int[] a = {1, 2, 2, 3, 3, 3};
        // 1-> 1, 2-> 2, 3-> 3

        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0; i<a.length; i++){

            if(! al.contains(a[i])){
                al.add(a[i]);
                int k=1;

                for(int j=i+1; j<a.length; j++){
                    if(a[i] == a[j]){
                        k++;
                    }
                }
                System.out.println(a[i] + " " + k);
            }
        }
    }
}
