class solution{
    //739. Daily Temperatures
    //420 ms, faster than 5.01%
    public int[] dailyTemperatures(int[] T) {
        int n = T.length;
        int[] ret = new int[n];
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1 ; j < n ; j ++){
                if(T[j] > T[i]){
                    ret[i] = j - i;
                    break;
                }
                if(j == n - 1)
                    ret[i] = 0;
            }
        }
        return ret;
    }
}
