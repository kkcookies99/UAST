bool XXX(int x){
    long y = 0;
    int tmp = x;
    if (x < 0) {
        return false;
    }

    while (tmp != 0) {
        int n = tmp % 10;
        tmp /= 10;
        y = y * 10 + n;
    }

    if (x == y) {
        return true;
    } else {
        return false;
    }
}

