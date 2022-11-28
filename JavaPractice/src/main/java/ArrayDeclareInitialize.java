public class ArrayDeclareInitialize {
    public static void main(String[] args){
        int[] a = new int[]{1, 2, 3, 4, 5};
        char[] b = {'a', 'b', 'c', 'd', 'e'};
        for(int i=0; i<a.length; i++){
            System.out.println(a[i] + " " +b[i]);
        }
    }
}
