 char * XXX(char * a, char * b){
    int lena = strlen(a);
    int lenb = strlen(b);
    int lenmax = fmax(lena, lenb);
    int up = 0;
    char *tmpa;
    char *tmpb;
    char *tmpretstr;
    char *retstr;
    tmpa = (char *)malloc(sizeof(char) * (lenmax + 2));
    tmpb = (char *)malloc(sizeof(char) * (lenmax + 2));
    tmpretstr = (char *)malloc(sizeof(char) * (lenmax + 2));
    for (int i = 0; i < lenmax + 2; i++){
        if (i < (lenmax + 1 - lena)){
            tmpa[i] = '0';
        }
        if (i >= (lenmax + 1 - lena) && i < (lenmax + 1)){
            tmpa[i] = a[i - (lenmax - lena + 1)];
        }
        if (i == lenmax + 1){
            tmpa[i] = '\0';
            tmpb[i] = '\0';
            tmpretstr[i] = '\0';
        }
        if (i < (lenmax + 1 - lenb)){
            tmpb[i] = '0';
        }
        if (i >= (lenmax + 1 - lenb) && i < (lenmax + 1)){
            tmpb[i] = b[i - (lenmax + 1 - lenb)];
        }
    }
    printf("%s\n", tmpa);
    printf("%s\n", tmpb);
    for (int i = lenmax; i >= 0; i--){
        if (((tmpa[i] - '0') + (tmpb[i] - '0') + up)>= 2){
            tmpretstr[i] = ((tmpa[i] - '0') + (tmpb[i] - '0') + up) % 2 + '0';
            up = 1;
        } else {
            tmpretstr[i] = (tmpa[i] - '0') + (tmpb[i] - '0') + up + '0';
            up = 0;
        }
    }
    if (tmpretstr[0] == '0'){
        retstr = (char *)malloc(sizeof(char) * (lenmax + 1));
        for (int i = 1; i < lenmax + 2; i++){
            retstr[i - 1] = tmpretstr[i];
        }
    } else {
        retstr = (char *)malloc(sizeof(char) * (lenmax + 2));
        for (int i = 0; i < lenmax + 2; i++){
            retstr[i] = tmpretstr[i];
        }
    }
    free(tmpretstr);
    free(tmpa);
    free(tmpb);
    return retstr;
}

