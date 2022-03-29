int XXX(int n){
    if (n < 4) {
        return n;
    }
    
    int half = n/2;
    return (XXX(half)*XXX(n-half)
            + XXX(half-1)*XXX(n-half-1));
}

