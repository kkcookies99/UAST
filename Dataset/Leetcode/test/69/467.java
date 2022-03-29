class Solution {
    public int XXX(int x) {
        long a = x;
        long l = 0, r = a;
        while (l < r) {
            long mid = l + r >> 1;
            if (mid * mid >= a) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l * l == a ? (int)l : (int)l - 1;
    } 
}

