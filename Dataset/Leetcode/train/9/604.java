 public boolean XXX(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0))
        {
            return false;
        }
        if (x < 10)
        {
            return true;
        }

        int rev = 0;
        while (x != 0)
        {
            int m = x % 10;
            x /= 10;
            if (rev != 0 && x == rev)
            {
                break;
            }
            rev = rev * 10 + m;
            if (rev != 0 && x == rev)
            {
                break;
            }
        }
        return x == rev;
    }

