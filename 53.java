class solution{
    //53. Maximum Subarray
    //Input: [-2,1,-3,4,-1,2,1,-5,4],
    //Output: 6
    //1 ms, faster than 89.00%
    public int maxSubArray(int[] nums) {
        int ret = 0;
        for(int i = 1 ; i < nums.length ; i++){
            nums[i] = Math.max(nums[i-1] + nums[i], nums[i]);
            if(nums[i] > nums[ret]) {
                ret = i;
            }
        }
        return nums[ret];
    }
}
