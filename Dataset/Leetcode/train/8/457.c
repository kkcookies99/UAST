 int XXX(char * s){
    int i = 0;
    int sign = 1;
    if(s[i]=='\0') return 0;
    while(s[i]==' ') ++i;
    if(s[i]=='-') {
        sign = -1;
        ++i;
    } else if(s[i]=='+') {
        sign = 1;
        ++i;
    }
    int ret = 0;
    while(s[i] >= '0' && s[i] <= '9') {
        if(sign > 0) {
            if(ret > INT_MAX/10) return INT_MAX;
            else if(ret == INT_MAX/10 && s[i] >= '8') return INT_MAX;
            ret = ret * 10 + (s[i] - '0');
        } else {
            if(ret < INT_MIN / 10) return INT_MIN;
            else if(ret == INT_MIN/10 && s[i] >= '9') return INT_MIN;
            ret = ret * 10 - (s[i] - '0'); 
        }
        ++i;
    }
    return ret;
}

