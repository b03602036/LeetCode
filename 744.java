class solution{
    //744. Find Smallest Letter Greater Than Target
    //0 ms, faster than 100.00%
    public char nextGreatestLetter2(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) return letters[i];
        }

        return letters[0];
    }
}
