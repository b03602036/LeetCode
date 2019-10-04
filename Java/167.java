class solution{
    //167. Two Sum II - Input array is sorted
    //92 ms, faster than 5.76%
    public int[] twoSum2(int[] numbers, int target) {
        int n = numbers.length;
        int[] index = new int[2];
        for (int i = 0; i < n; i++) {
            int k = target - numbers[i];
            for (int j = i; j < n; j++) {
                if (numbers[j] == k) {
                    index[0] = i + 1;
                    index[1] = j + 1;
                    break;
                }
            }
        }
        return index;
    }
}
