 class Solution {
    public int XXX(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        if (m < n) return XXX(n, m);
        --m;
        --n;
        int s = m + n;
        long ans = s;
        for (int i = 2; i <= n; ++i) {
            ans = ans *  (s - i + 1);
            ans /= i;
        }
        return (int)ans;
        
    }
}

