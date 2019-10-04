class solution{
//72. Edit Distance
    //6 ms, faster than 57.97%
    public static int minDistance(String word1, String word2) {

        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        int m = w1.length;
        int n = w2.length;
        int[][] ret = new int[m + 1][n + 1];

        for(int i = 0 ; i <= m ; i++){
            ret[i][0] = i;
        }
        for(int i = 1 ; i <= n ; i++){
            ret[0][i] = i;
        }


        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(word1.charAt(i) == word2.charAt(j))
                    ret[i + 1][j + 1] = ret[i][j];
                else {
                    int a = ret[i][j];
                    int b = ret[i][j + 1];
                    int c = ret[i + 1][j];
                    ret[i + 1][j + 1] = a < b ? (a < c ? a : c) : (b < c ? b : c);
                    ret[i + 1][j + 1]++;
                }
            }
        }

        for(int i = 0 ; i <= m ; i ++){
            for(int j = 0 ; j <= n ; j++) {
                System.out.printf(" %-2d ", ret[i][j]);
            }
            System.out.println();
        }


        return ret[m][n];
    }
}
