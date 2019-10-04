class solution{
    //283. Move Zeroes
    //49 ms, faster than 5.23%
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = i + 1; j < n ; j++){
                if(nums[i] == 0 && nums[j] != 0){
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }
    }
}
