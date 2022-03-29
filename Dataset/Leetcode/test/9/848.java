 class Solution {
    public boolean XXX(int x) {
        if(x<0){return false;}
        //运行完后x是0 因为一直除以10，所以得有个临时变量存储最后return 和这个原值比较
        int tempX = x;
        int res = 0;
        while(x != 0){
            int temp = x % 10;
            res = res*10 + temp;
            x /= 10;
        }
        return res==tempX;
    }
}

