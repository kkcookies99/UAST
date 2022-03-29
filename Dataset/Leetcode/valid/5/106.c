char* XXX(char* s) {
    char* ret = (char*)malloc(1001);
    memset(ret,0,1001);
    int len = strlen(s);
    if(len <=1) {
        return s;
    }
    int max[2];
    int j =0;
    int tmp = 0;
    // 长度遍历
    for(int i = 1; i <= len; i++) {
        // 起始点
        j =0;
        while(j+i -1 < len) {
            // 判断是否回文串，且是否最大
            tmp = 1;
            for(int k = 0;k < i ;k++)  {
                if(s[j + k] != s[j+i-k-1]) {
                    tmp = 0;
                    break;
                }
            }
            if(tmp == 1) {
                max[0] = j;
                max[1] = j+i -1;
            }
            j++;

        }

    }
    int p = 0;
    for(int m = max[0]; m <= max[1]; m++) {
        ret[p] = s[m];
        p ++;
    }
    return ret;
}

