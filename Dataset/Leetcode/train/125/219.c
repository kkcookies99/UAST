 bool XXX(char * s){
    if (s == NULL) {
        return true;
    }
    int strLen = strlen(s);
    char *ptrSStart = s;
    char *ptrSEnd = s + strLen - 1;
    char *tmpS = ptrSEnd;
    while (ptrSStart < ptrSEnd) {
        while (isalnum(*ptrSEnd) == 0 && ptrSEnd != s) {
            ptrSEnd--;
            if (ptrSEnd == s && isalnum(*ptrSEnd) == 0) {
                return true;
            }
        }
        while (isalnum(*ptrSStart) == 0 && ptrSStart != tmpS) {
            ptrSStart++;
        }
        if (tolower(*ptrSStart) == tolower(*ptrSEnd)) {
            ptrSEnd--;
            ptrSStart++;
        } else {
            return false;
        }
    }
    return true;
}

