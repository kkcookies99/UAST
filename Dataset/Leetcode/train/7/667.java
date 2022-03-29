     public int XXX(int x) {
        long y = 0;
        while (x != 0) {
            y = y * 10 + x % 10;
            x /= 10;
        }

        return y > Integer.MAX_VALUE || y < Integer.MIN_VALUE ? 0 : (int) y;
    }

