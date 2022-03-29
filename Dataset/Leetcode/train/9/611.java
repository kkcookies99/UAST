 public boolean XXX(int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        int n = 0,b = x;
        while(x != 0){
            n = n * 10 + x % 10;
            x = x / 10;
        }
        return b == n;
    }

