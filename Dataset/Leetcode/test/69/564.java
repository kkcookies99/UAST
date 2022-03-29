class Solution {
    public int XXX(int x) {
        if(x <= 1) return x;
        int res = x / 2;
        int temp = x / res;
        while(res > temp) {
            res = (res + temp) / 2;
            temp = x / res;
        }
        return res;
    }
}

