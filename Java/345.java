class solution{
    //345. Reverse Vowels of a String
    //72 ms, faster than 5.07%
    public static String reverseVowels(String s) {
        StringBuffer vwl = new StringBuffer();
        StringBuffer sb = new StringBuffer();
        for(int i = 0 ; i < s.length() ; i ++){
            char c = s.charAt(i);
            if(Character.toString(c).matches("[AEIOUaeiou]") ){
                vwl.append(c);
            }
        }
        System.out.println(vwl);
        vwl = vwl.reverse();
        int m = 0;
        for(int i = 0 ; i < s.length() ; i ++){
            char c = s.charAt(i);
            if(Character.toString(c).matches("[AEIOUaeiou]") ){
                sb.append(vwl.charAt(m));
                m++;
            }
            else sb.append(c);
        }
        return new String(sb);
    }
}
