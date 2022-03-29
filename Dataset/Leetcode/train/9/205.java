 public boolean XXX(int x) {
         int y = x;
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int newNum = 0;
        while (x != 0) {
            newNum = x % 10 + newNum * 10;
            x=x/10;
        }
        if(y == newNum)
            return true;
        return false;
    }

