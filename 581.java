class solution{
    //581. Shortest Unsorted Continuous Subarray
    //8 ms, faster than 43.98%
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int[] tem = nums.clone();
        Arrays.sort(nums);
        int s = 0;
        int e = 0;
        for(int i = 0 ; i < n ; i ++){
            if(tem[i] != nums[i]) s = i;
            if(tem[n - 1 - i] != nums[n - 1 - i]) e = n - 1 - i;
        }
        return e - s + 1;
    }
}
