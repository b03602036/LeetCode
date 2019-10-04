class solution{
    //121. Best Time to Buy and Sell Stock
    //1 ms, faster than 88.88%
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = 0;
        int min = prices[0];
        for(int i = 0 ; i < n ; i++){
            if(prices[i] < min){
                min = prices[i];
            }else if (max < prices[i] - min){
                max = prices[i] - min;
            }
        }
        return max;
    }
}
