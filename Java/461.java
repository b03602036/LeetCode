class solution{
    //461. Hamming Distance
    public int hammingDistance(int x, int y) {
        int count = 0;
        while(x != 0 || y != 0){
            int m = x & 1;
            int n = y & 1;
            x  >>= 1;
            y  >>= 1;
            if(m != n) count++;
        }
        return count;
    }
}
