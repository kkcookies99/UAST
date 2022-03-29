 int XXX(char * haystack, char * needle){
    int neelength = strlen(needle);
    if(neelength == 0){
        return 0;
    }
    int haylength = strlen(haystack);
    if(haylength == 0){
        return -1;
    }
//把i<haylength优化成了haylength-neelength+1,即如果主字符串剩余长度小于查找字符串就不再继续了
    for(int i = 0;i < haylength - neelength + 1;i++){
        if(haystack[i] == needle[0]){
            int sign = 1;
            for(int j = 1;j <neelength;j++){
                if(haystack[i + j] !=needle[j]){
                    break;
                }
                sign++;
            }
            if(sign == neelength){
                return i;
            }
        }
    }
    return -1;
}

