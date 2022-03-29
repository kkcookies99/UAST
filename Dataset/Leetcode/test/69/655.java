    public int XXX(int x) {
        if (x <= 0) return 0;
        long l = 1, r = x;
        while (l < r) {
            long mid = (r - l) / 2 + l + 1;
            if (mid * mid == x) return (int) mid;
            else if (mid * mid > x) {
                r = mid - 1;
            } else {
                l = mid;
            }
        }
        return (int)l;
    }

