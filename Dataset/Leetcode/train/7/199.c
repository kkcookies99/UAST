int XXX(int x) {
    long XXX = 0;
    while (x) {
        XXX = XXX * 10 + x % 10;
        x /= 10;
    }
    if (XXX > 0x7fffffff || XXX < -0x7fffffff - 1) return 0;
    return XXX;
}

