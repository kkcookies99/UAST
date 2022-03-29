class Solution {
    public int XXX(int x) {
        int res = 0;
        while(x != 0){
            if(res > Integer.MAX_VALUE / 10 || res < Integer.MIN_VALUE / 10) return 0;
            res *= 10;
            res += x % 10;
            x /= 10;
        }
        return res;
    }
}

