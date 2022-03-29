class Solution {
    public int XXX(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int f1 = 0;
        int f2 = 1;
        int fn = 0;
        for (int i = 1; i <= n;i++) {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }
}

