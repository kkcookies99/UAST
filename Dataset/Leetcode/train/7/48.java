class Solution {
    public int XXX(int x){
        int res = 0;
        int tmp;
        while(x!=0) {
            tmp = x % 10;
            res = res * 10 + tmp;
            x /= 10;
        }
        return res;
    }
}

