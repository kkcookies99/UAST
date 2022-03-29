class Solution {
    public int XXX(int x) {
        int ans = 0;
        while (x != 0) {
            if (x > 0 && ans > (Integer.MAX_VALUE - x % 10) / 10) return 0;
            if (x < 0 && ans < (Integer.MIN_VALUE - x % 10) / 10) return 0;
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return ans;
    }
}

