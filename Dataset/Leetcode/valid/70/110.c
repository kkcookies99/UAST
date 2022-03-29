int XXX(int n){
    long f[2] = {1 ,1};
    for(int i= 2; i <= n; ++i) {
        f[i % 2] = f[(i - 1) % 2] + f[(i - 2) % 2];
    }
    return f[n % 2];
}

