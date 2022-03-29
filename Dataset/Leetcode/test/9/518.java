     public boolean XXX(int x) {
        if (x < 0) return false;
        int s = x;
        long result = 0;
        while (s > 0) {
            result = result * 10 + s % 10;
            s = s / 10;
        }
        return result == x;
    }

