class solution{
    //322. Coin Change
    //8 ms, faster than 92.44%
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for(int i = 1 ; i < dp.length ; i++){
            dp[i] = amount + 1;
        }
        for(int i = 1 ; i < dp.length ; i++){
            for(int j = 0 ; j < coins.length ; j++) {
                int k = i - coins[j];
                if (k >= 0) {
                    dp[i] = Math.min(dp[i], dp[k] + 1);
                }
            }
        }

        if(dp[amount] == amount + 1) return -1;

        return dp[amount];
    }
}
