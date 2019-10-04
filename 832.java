public class Solution_Array {

    //832. Flipping an Image
    //0 ms, faster than 100.00%
    public static int[][] flipAndInvertImage(int[][] A) {
        int n = A.length;
        for(int i = 0 ; i < n ; i++){
            int m = A[i].length;
            int k = 0;
            int s = A[i].length - 1;
            while(k <= s){
                int temp = A[i][s];
                A[i][s] = A[i][k];
                A[i][k] = temp;
                k++;
                s--;
            }

            for(int j = 0 ; j < m ; j++){
                A[i][j] ^= 1;
            }

        }

        return A;
    }
}
