int XXX(char * str){
    int result=0;
    if (str==NULL || !*str) {
        return result;
    }
    while(*str==' ') {
        str++;
    }

    int sign = 1;
    if(*str=='+' || *str=='-') {
        sign = (*str=='-')?-1:1;
        str++;
    }
    
    for (char*p=str; *p; ++p) {
        if (*p<'0' || *p>'9') {
            break;
        }
        int bit = (*p-'0');
        
        if (sign<0) {
            if ( result>-(INT_MIN/10) || (result==-(INT_MIN/10) && bit>=-(INT_MIN%10))) {
                return INT_MIN;
            }
        } else {
            if ( result>INT_MAX/10 || (result==INT_MAX/10 && bit>=INT_MAX%10)) {
                return INT_MAX;
            }
        }

        result = result*10 + bit;
    }
    
    return result*sign;    
}

