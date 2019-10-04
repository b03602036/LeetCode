class solution{
    //58. Length of Last Word
    //1 ms, faster than 46.06%
    public int lengthOfLastWord(String s) {
        if (s.trim().equals("")) return 0;
        String[] str = s.split(" ");
        return str[str.length-1].length();
    }

}
