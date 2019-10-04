class solution{
    //217. Contains Duplicate
    //11 ms, faster than 12.58%
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> ans = new HashMap<>();
        for(int i : nums){
            if(!ans.containsKey(i)) ans.put(i, 0);
        }
        return nums.length != ans.size();
    }
}
