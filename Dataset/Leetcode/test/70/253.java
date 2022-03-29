public int XXX(int n) {
        int a = 0, sum = 1;
        while (n-- > 0) {
            a = (sum += a) - a;
        }
        return sum;
    }

