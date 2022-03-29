public int XXX(int x) {
    if (x == 0) return 0;
    int left = 1, right = x, middle, sqrt;
    while (left <= right) {
        sqrt = x / (middle = ((right - left) >>> 1) + left);
        if (sqrt == middle) return sqrt;
        if (sqrt > middle) left = middle + 1;
        else right = middle - 1;
    }
    return right;
}

