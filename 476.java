class solution{
    //476. Number Complement
    //0 ms, faster than 100.00%
    public int findComplement(int num) {
        int ret = 0;
        int round = 0;
        int temp = num;
        while(temp!=0){
            round++;
            temp = temp >> 1;
        }
        while(round > 0){
            temp |= 1;
            if(round != 1)
                temp <<= 1;
            round--;
        }
        ret = num ^ temp;
        return ret;
    }
}
