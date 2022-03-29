bool XXX(int x){
    long res = 0;
    int tmp = x;
    if (x < 0)
        return false;
    
    while (x != 0){
        res = res * 10 + x % 10;
        x /= 10;
    }
    return (int)res == tmp ? true : false;
}

