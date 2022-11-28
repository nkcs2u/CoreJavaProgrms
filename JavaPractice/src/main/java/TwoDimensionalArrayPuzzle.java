public class TwoDimensionalArrayPuzzle {

    public static void main(String[] args){
        int[][] a = { {1, 0, 2}, {3, 0, 5}, {6, 1, 8}};

        int min_val, min_col;
        min_col = 0;
        min_val = a[0][0];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(a[i][j] < min_val){
                    min_val = a[i][j];
                    min_col = j;
                }
            }
        }

        int max_val_col = a[0][min_col];

        for(int i=0; i<3; i++){
            if(a[i][min_col] > max_val_col ){
                max_val_col = a[i][min_col];
            }
        }

        System.out.println(min_val + " " + max_val_col);
    }
}
