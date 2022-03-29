int XXX(int x){
    long long num = 0;
    
    while(x != 0){        
        num = num * 10 + x % 10;
        x /= 10;
    }
    if(num > 2147483647 || num < -2147483648)
        return 0;
    
    return num;
}

