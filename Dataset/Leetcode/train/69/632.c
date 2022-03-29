int XXX(int x){
    int left = 0;
    int right = x;
    int mid = 0;
    int result = 0;
    while (left <= right) {
        mid = (left + right) / 2;
        if ((long long)mid * mid <= x){
            result = mid;
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return result;
}

