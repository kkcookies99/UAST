 public int XXX(int n) {
       if (n == 1) {
            return 1;
        }
        int[] ans = new int[n+1];
        ans[0] = 0;
        ans[1] = 1;
        ans[2] = 2;
        for (int i = 3; i <= n; i++) {
            ans[i] = ans[i - 2] + ans[i - 1];
        }
        return ans[n];
    }

