 char * XXX(char ** strs, int strsSize){
    if(!strsSize)
    return "";

    char* ans = strs[0];
    for(int i=1; i<strsSize; i++){//依次将字符串同ans比较
        char* p = ans;
        char* temp = strs[i];
        while(*p != '\0' && *temp != '\0'){
            if(*p != *temp){//若不相同，修改ans
                *p = '\0';
                break;
            }
            p++;
            temp++;
        }
        if(*temp == '\0') //若当前字符串遍历完，将ans指向当前字符串
        ans = strs[i];
    }
    return ans;
}

