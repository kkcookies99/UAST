int XXX(int x) {
    short sign;
    long z, y=0;
    sign = (x >= 0)? 1 : -1;
    z = (long)x*sign;
    while(z){
        y *= 10;
        y += z%10;
        z /= 10;
    }
    if(y < -2147483648 || y > 2147483647){
        return 0;
    }
    return sign * (int)y;
}

