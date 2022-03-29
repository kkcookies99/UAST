int XXX(int x) {
    int flag = 1;
    if(x < 0)
    {
        if(x == -2147483648)
        {
            return 0;
        }
        x = 0-x;
        flag = 0;
    }
    long long num = 0;
    int temp = 0;
    while(x > 0)
    {
        temp = x%10;
        num = num * 10 + temp;
        x = x / 10; 
    }
    
    if(num > 2147483647)
    {
        return 0;
    }
    
    if(flag == 0)
    {
        num = 0-num;
        if(num < -2147483648)
        {
            return 0;
        }
    }
    return num;
}

