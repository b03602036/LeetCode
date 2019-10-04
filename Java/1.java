// 1. Two Sum

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        for(int j = 0 ; j < nums.length ; j ++){
            ret[0] = j;
            int n = target - nums[j];
            //System.out.println(n);
                for(int i = j + 1 ; i < nums.length ; i++){
                    if(nums[i] == n){
                        ret[1] = i;
                        return ret;
                    }
                }
        }
        return null;
    }
}
