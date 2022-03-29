int XXX(int x){
    int tmp;
    int ret = 0;
    while(x){
        tmp = x%10;
        x/=10;
        if(ret>(int)0x7fffffff/10||ret<(int)0x7fffffff/-10)
            return 0;
        ret = ret*10+tmp;
    }
    return ret;
}

