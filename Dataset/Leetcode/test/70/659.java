 public int XXX(int n) {
        int first  = 1;
        int second = 1;
        int result = 1;
        for (int i = 2; i <= n ; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

