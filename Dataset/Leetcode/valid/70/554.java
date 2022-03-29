public int XXX(int n) {
        if (n <= 2) return n;
        int fib0 = 1;
        int fib1 = 2;
        int temp = 0;
        for (int i = 3; i <= n; i++) {
            temp = fib1;
            fib1 = fib0 + fib1;
            fib0 = temp;
        }
        return fib1;
    }

