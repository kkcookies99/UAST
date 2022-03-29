 char * XXX(char * a, char * b){
    char *p = NULL;
    int len_a = strlen(a);
    int len_b = strlen(b);
    int len_c = len_a > len_b ? len_a+1 : len_b+1;
    p = (char*)malloc((len_c+1)*sizeof(char));
    p[len_c] = '\0';
    bool flag = false;
    while(len_a || len_b){
        if(len_a == 0){
            if(b[len_b-1] == '0'){
                p[len_c-1] = flag?'1':'0';
                flag = false;
            }
            else{
                p[len_c-1] = flag?'0':'1';
            }
            len_b--;
            len_c--;
            continue;
        }
        else if(len_b == 0){
            if(b[len_a-1] == '0'){
                p[len_c-1] = flag?'1':'0';
                flag = false;
            }
            else{
                p[len_c-1] = flag?'0':'1';
            }
            len_a--;
            len_c--;
            continue;
        }

        if(a[len_a-1] == '0' && b[len_b-1]=='0'){
            p[len_c-1] = flag?'1':'0';
            flag = false;
        }
        else if (a[len_a-1] == '1' && b[len_b-1]=='1'){
            p[len_c-1] = flag?'1':'0';
            flag = true;
        }
        else {
            p[len_c-1] = flag?'0':'1';

        }
        len_a--;
        len_b--;
        len_c--;
    }

    int len = (strlen(a) > strlen(b) ? strlen(a) : strlen(b));
    if(flag) p[0] = '1';
    else {
        for(int i = 0;i< len;i++)
            p[i] = p[i+1];
        p[len] = '\0';
    }
    return p;
}

