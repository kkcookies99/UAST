 char * XXX(char ** strs, int strsSize){
   char *s = *strs;
   int j = 0;
    while (*s) {
        for (int i = 1; i < strsSize; i++) {
            char ch = *(*(strs + i) + j);
            if (*s != ch) {
                *s = '\0';
                return *strs;
            }
        }
        s++;
        j++;
    }
    return *strs;
}

