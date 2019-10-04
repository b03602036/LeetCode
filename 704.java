class solution{
    //704. Binary Search
    //0 ms, faster than 100.00%
    public int search2(int[] nums, int target) {
        int l = 0 ;
        int r = nums.length - 1;
        if(l == r && nums[l] == target) return l;

        while(l < r){
            int m = l + (r-l)/2;
            if(nums[m] == target)
                return m;
            else if (nums[m] > target)
                r = m;
            else
                l = m + 1;
            if(l == r && nums[l] == target) return l;
        }
        return -1;
    }
}
