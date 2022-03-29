class Solution {
    public int XXX(int x) {
        long y = 0;
        while (x != 0) {
            int remain = x % 10;
            y = y * 10 + remain;
            x /= 10;
        }
        
        if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE) {
            return 0;
        }
        
        return (int) y;
    }
}

