public boolean XXX(int x) {
        int xx = x;
        int res = 0;
        while (x > 0){
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return res == xx;
    }

