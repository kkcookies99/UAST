 bool XXX(char * s){
    if (strlen(s) == 0) {
        return true;
    }

    int totalLen = strlen(s);
    int number = 0;
    char *tempS = (char *)malloc(sizeof(char) * (totalLen + 1));

    for (int i = 0; i < totalLen; i++) {
        if ((s[i] >= '0') && (s[i] <= '9')) {
            tempS[number++] = s[i];
        } 
        if ((s[i] >= 'a') && (s[i] <= 'z')) {
            tempS[number++] = s[i];
        }
        if ((s[i] >= 'A') && (s[i] <= 'Z')) {
            tempS[number++] = s[i] + 32;
        }
    }
    tempS[number] = '\0';

    int len = strlen(tempS);

    for (int i = 0; i < len; i++) {
        if (tempS[i] != tempS[len - i - 1]) {
            free(tempS);
            return false;
        }
    }
    free(tempS);
    return true;
}

