 bool XXX(char * s){
    int finalsize = 0;
    char *tmp = malloc(sizeof(char) * 200000);
    for (int i = 0; i < strlen(s); ++i){
        if (s[i] >= 'a' && s[i] <= 'z'){
            tmp[finalsize] = s[i];
            finalsize++;
        }
        if (s[i] >= 'A' && s[i] <= 'Z'){
            tmp[finalsize] = s[i] - 'A' + 'a';
            finalsize++;
        }
        if (s[i] >= '0' && s[i] <= '9'){
            tmp[finalsize] = s[i];
            finalsize++;
        }
    }
    for (int i = 0; i < finalsize; i++){
        if (tmp[i] != tmp[finalsize -1 - i]){
            return false;
        }
    }
    return true;
}

