 char * XXX(char ** strs, int strsSize){
    char *prefix = NULL;
    int n = 0;
    prefix = (char *)malloc(200);
    memset(prefix, 0, 200);
    for (int i = 0; i < 200; i++) {
        for (int j = 0; j < strsSize; j++) {
            if (j == 0) {
                prefix[n] = *(*(strs + j) + i);
                n++;
            }
            if ((*(*(strs + j) + i) == '\0') || (*(*(strs + j) + i) != prefix[n - 1])) {
                prefix[n - 1] = '\0';
                return prefix;
            }

        }
    }
    return prefix;
}

