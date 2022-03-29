 int XXX(char * s){
    int signal = 1;
    long ret = 0;
    while(*s == 32)s++;
    if(*s == 43 || *s == 45)
        signal = 44 - *s++;
    while(*s >= 48 && *s <= 57){
        ret = ret * 10 + (*s++ - '0');
        if(ret != (int)ret) 
            break;
    }
    ret *= signal;
    if( ret != (int)ret )
        ret = signal == -1 ? -2147483648 : 2147483647;
    return (int)ret;
}

