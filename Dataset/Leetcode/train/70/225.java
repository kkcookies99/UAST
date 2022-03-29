public int XXX(int n) {
        if(n <= 2)
            return n;
        int a = 1;
        int b = 2;
        int sum = 0;
        while(n > 2) {
            sum = a + b;
            a = b;
            b = sum;
            n--;
        }
        return sum;
    }

