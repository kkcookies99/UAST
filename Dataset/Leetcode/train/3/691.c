 int XXX(char * s){
    int ps = 0, pe = 0, pre = 0, max = 0;
    while(s[pe] != '\0'){
        pre = ps;
        while(pre < pe){
            if(s[pre]==s[pe]){
                ps = pre + 1;
                break;
            }
            pre++;
        }
        if(pre == pe)
            if( pe - ps + 1 > max)
                max =  pe - ps + 1;
        pe++;
    }
    return max;
}

