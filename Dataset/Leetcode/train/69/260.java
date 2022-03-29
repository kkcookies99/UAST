class Solution {
    public int XXX(int x) {
        if(x < 0){
            return -1;
        }
        if(x <= 1){
            return x;
        }
        int r = 0, e = 0x8000;
        for (int k = 0; k < 16; k++) {
            int t = (((r << 1) + e) << (15 - k));      //后面的左移是为了算*e
            if (x >= t) {
                r += e;
                x -= t;
            }
            e >>= 1;
        }
        return r;
    }
}
code block

