public int XXX(int x) {
        int t = 1;
        while ((long) t * t <= x)
            t++;
        if (t * t == x)
            return t;
        return t - 1;
    }

