public int XXX(int x) {
    if (x == 0 || x == 1) {
        return x;
    }
    double left = 1;
    double right = x;
    double mid = (right - left) / 2;

    while (mid * mid - x > 0.001 || mid * mid - x < 0) {
        if (mid > x / mid) {
            right = mid;
            mid = (left + right) / 2;
        } else {
            left = mid;
            mid = (left + right) / 2;
        }
    }
    return (int) mid;
}
