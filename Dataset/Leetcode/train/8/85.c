int XXX(char * str){
    int i;
    long int ret = 0;
    bool flag = true;
    
    while(*str == ' ') str++;
    
    if(*str == '+'){
        flag = true;
        str++;
    } else if (*str == '-') {
        flag = false;
        str++;
    } else if (*str < '0'|| *str > '9') {
        return 0;
    }
    
    
    while(*str >= '0' && *str <= '9') {
        ret *= 10;
        ret += *str - '0';
        str++;
        if(ret > 0x7fffffff)
            return flag ? 0x7fffffff : 0x80000000;
    }
    
    return flag ? ret : -ret;
}

