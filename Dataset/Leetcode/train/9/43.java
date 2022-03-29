class Solution {
    public boolean XXX(int x) {
        int a = x;
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        if (x % 10 == 0) {
            return false; 
        }
        int t = 0;
        while (x > 0) {
            t = t * 10 + x % 10;
            x /= 10;
        }
       return t == a;
    }
}

