class solution{
    //49. Group Anagrams
    //9 ms, faster than 78.15%
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> ans = new HashMap<>();
        for(String s : strs){
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }

        return new ArrayList(ans.values());
    }
}
