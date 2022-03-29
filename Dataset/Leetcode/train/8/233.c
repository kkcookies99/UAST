int XXX(char * s){
    int i=0,signal = 0;
    long ret = 0;
    char *temp = NULL;
    while(s[i] != '\0'){
        temp = &s[i];
        i++;
        if(signal == 0){
            if(*temp >= '0' && *temp <= '9'){
                signal = 1;
                ret += (*temp - '0');
            }
            else if(*temp == '-'){
                signal = -1;
            }
            else if(*temp == '+'){
                signal = 1;
            }
            else if(*temp != ' '){
                break;
            }
            else continue;
        }
        else {
            if (*temp >= '0' && *temp <= '9'){
                if(ret == 0 && *temp == '0') continue;
                ret *= 10;
                ret += (*temp - '0');
            }
            else break;
        }
        if(ret > 2147483647) return (signal > 0?INT_MAX:INT_MIN);
    }
    return(ret * signal);
}

