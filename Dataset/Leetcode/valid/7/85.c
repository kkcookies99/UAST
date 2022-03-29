int XXX(int x) {
    long r = 0;
    while (x != 0) {
        r = 10*r + x%10;
        x = x/10;
    }
    if (r > pow(2, 31)-1 || r < -pow(2, 31)) 
        return 0;
    return r;
}

