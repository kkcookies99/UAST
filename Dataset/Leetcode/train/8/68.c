int XXX(char * str){
    long num = 0;
    bool flag = true;
    //跳过空格
    while(*str != '\0' && *str == ' ') str++;
    //判断正负
    if(*str == '+'){
        str++;
    }else if(*str == '-'){
        flag = false;
        str++;
    }
    //开始计数
    if('0' <= *str && *str <= '9'){
        while('0' <= *str && *str <= '9'){
            num = num * 10 + (*str - '0');
            str++;
            //超标情况
            if(num > 2147483647){
                if(!flag)
                return INT_MIN;
                return INT_MAX;
            }
        }
    }
    //负数的输出情况
    if(!flag)
    return (int)num * -1;
    //正数的输出情况
    return (int)num;
}

