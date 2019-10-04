class solution{
    //219. Contains Duplicate II
    //9 ms, faster than 44.77%
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> ans = new HashMap<>();
        int pos = 0;
        for(int i : nums){
            if(!ans.containsKey(i)) {
                ans.put(i, pos++);
            }else if (ans.containsKey(i)){
                if (pos - ans.get(i) <= k) return true;
                else ans.replace(i, pos++);
            }
        }
        return false;
    }
}
