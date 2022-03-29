int XXX(int x){
    int rev = 0;
    while (x/10 != 0) {
        rev *= 10;
        rev += x % 10;
        x = x / 10;
    }
    if (rev > INT_MAX / 10 || rev < INT_MIN / 10) return 0;
    rev *= 10;
    rev += x;
    return rev;
}

