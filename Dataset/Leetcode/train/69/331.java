class Solution {
    public int XXX(int x) {
        int l = 0, r = x;
        while(l < r){
            int m = l + (r - l) / 2;
            if((long)m * m < (long)x){
                l = m + 1;
            }else{
                r = m;
            }
        }
        return l*l == x ? l : l - 1;
    }
}

