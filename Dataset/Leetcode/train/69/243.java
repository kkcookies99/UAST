public int XXX(int x) {
        if (x == 0) return 0;
        int low = 1, high = x, mid = x;
        while (high - low > 1) {
            mid = low + (high - low) / 2;
            long sq = (long) mid * mid;
            if (sq == x) {
                return mid;
            } else if (sq < x) {
                low = mid;
            } else {
                high = mid;
            }
        }
        return low;
    }

