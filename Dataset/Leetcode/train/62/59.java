     public int XXX(int m, int n) {
        long ans = 1;
        int x = m + n - 2;
        int y = m - 1;
        while (y > 0) {
            ans *= (x / y);
            x--;
            y--;
        }
        return (int) ans;
    }

