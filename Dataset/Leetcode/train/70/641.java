class Solution {
    public int XXX(int n) {
        int[] res = new int[n];
        res[0] = 1;
        if (n == 1) {
            return 1;
        } else {
            res[1] = 2;
            if (n > 2) {
                for (int i = 2; i < n; i++) {
                    res[i] = res[i - 1] + res[i - 2];
                }
            }
        }
        return res[n - 1];
    }
}

