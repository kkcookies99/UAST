class Solution {
    public int XXX(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int step1 = 1;
        int step2 = 2;
        int i = 3;
        for (; i <= n; i = i + 2) {
            step1 = step1 + step2;
            step2 = step1 + step2;
        }
        if (i == n + 1) {
            return step2;
        } else {
            return step1;
        }
    }
}

