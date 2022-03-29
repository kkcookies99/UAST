public boolean XXX(int x) {

    int k = x;
    if(k<0)
        return false;
    int n=0;
    while(k>0){
        n = k%10 + n*10;
        k /= 10;
    }
    return (x==n) ? true : false;
}