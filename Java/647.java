    //647. Palindromic Substrings
    //5 ms, faster than 44.86%
class solution{

	int count = 0;
    public int countSubstrings(String s) {
        int n = s.length();
        for(int i = 0 ; i < n ; i++){
            count++;
            int left = i - 1;
            int right = i + 1;
            while(left >= 0 && right < n && s.charAt(left) == s.charAt(right)){
                count++;
                left--;
                right++;
            }
            if(i < n - 1){
                if(s.charAt(i) == s.charAt(i + 1)){
                    count++;
                    left = i - 1;
                    right = i + 2;
                    while(left >= 0 && right < n && s.charAt(left) == s.charAt(right)){
                        count++;
                        left--;
                        right++;
                    }
                }
            }
        }
        return count;
    }

}
