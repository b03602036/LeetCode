class solution{
    //22. Generate Parentheses
    public List<String> generateParenthesis(int n) {
        LinkedList<String> ret = new LinkedList<>();
        ret.add("()");
        int m = 1;
        while(ret.peekFirst().length() < 2 * n){
            String s = ret.removeFirst();
            String s2;
            s2 = "(" + s + ")";
            if(!ret.contains(s2))
                ret.add(s2);
            s2 = "()" + s;
            if(!ret.contains(s2))
                ret.add(s2);
            s2 = s + "()";
            if(!ret.contains(s2))
                ret.add(s2);
            m++;
        }
        return ret;
    }
}
