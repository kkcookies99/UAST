class Solution {
    public int XXX (int x) {
        long result = 0;
        while (x != 0) {
            result = result*10 + x%10;
            x /= 10;
        }
        if (result > 2147483647 || result < -2147483648) {
            return 0;
        }
        return (int)result;
    }
} 

