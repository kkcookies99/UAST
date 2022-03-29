```char* XXX(char* s) {
    int len = strlen(s);
    if(len == 0)
        return "";
    int i, j, z, head = 0, tail = 0;
    int maxsize = 0, size = 0;
    if(s[0] == s[1]){
       head = 0;
       tail = 1;
       maxsize = 2;
    }
    for(i = 1; i < len - 1; i++){
        //奇数型回文的判断
        if(s[i - 1] == s[i + 1]){
            size = 1;
            j = i - 1;
            z = i + 1;
            while(s[j] == s[z]){
                j--;
                z++;
                size += 2;
                if(j < 0 || z == len)
                    break;
            }
            if(size > maxsize){
                head = j + 1;
                tail = z - 1;
                maxsize = size;
            }
        }
        //偶数型回文的判断
        if(s[i] == s[i + 1]){
            size = 0;
            j = i;
            z = i + 1;
            while(s[j] == s[z]){
                j--;
                z++;
                size += 2;
                if(j < 0 || z == len)
                    break;
            }
            if(size > maxsize){
                head = j + 1;
                tail = z - 1;
                maxsize = size;
            }
        }
    }
    printf("%d %d\n", head, tail);
    s[tail + 1] = '\0';
    return &s[head];
}

