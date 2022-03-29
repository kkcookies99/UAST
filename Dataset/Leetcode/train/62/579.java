class Solution {
    public int XXX(int m, int n) {
        int C = m + n - 2;
        int K = (m < n ? m : n) - 1;
        double res = 1;
        for(int i = 1; i <= K; i++) {
            res = res * (C - i + 1) / i;
        }
        return (int)res;
    }
}

