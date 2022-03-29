int XXX(int x){
    if (x == 0) return 0;
    if (x == 1) return 1;

    int l = 0;
    int r = x;

    while (l < r) {
        int m = (l + r) / 2;
        if (m < x / m) {
            l = m + 1;
        } else if (m > x / m) {
            r = m - 1;
        } else {
            return m;
        }
    }
    if (l > x / l) return l - 1;
    return l;
}


