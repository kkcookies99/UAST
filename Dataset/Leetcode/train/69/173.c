int XXX(int x){
    int left = 0;
    int right = 2e16;
    long mid = 0;
    while(right - left > 1) {
        mid = (right + left) / 2;
        if(mid * mid < x) {
            left = mid;
        } else if(mid * mid > x) {
            right = mid;
        } else {
            return mid;
        }
    }
    return left;
}

