class Solution {
    public int XXX(int n) {
        int ans = 0, max = n / 2;
        for (int i = 0; i <= max; i ++) {
            int total = n - i;
            ans += calC(i, total);
        }
        return ans;
    }
    public int calC(int a, int b) {
        long ans = 1;
        int n = b - a;
        a = n > a ? a : n;
        for (int i = b, k = 1; k <= a; i --, k ++) {
            ans = ans * i / k;
        }
        return (int)ans;
    }
}

