 bool isCheckStringOk(char *s, int len, int left, int right)
{
    if (s == NULL) {
        return false;
    }
    while (left <= right && right < len) {
        if (s[left] != s[right]) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}


char * XXX(char * s)
{
    if (s == NULL) {
        return NULL;
    }
    int len = strlen(s);
    char* pstr = (char* )malloc(len + 1);
    memset(pstr, 0, len + 1);
    int curlen = 0;
    for (int i = 0; i < len; ++i) {
        for (int j = 0; j < len; ++j) {
            if ((j - i + 1) <= curlen) {
                continue;
            }
            if (isCheckStringOk(s, strlen(s), i, j)) {
                curlen = j - i + 1;
                memcpy(pstr, &s[i], curlen);
            }
        }
    }

    pstr[curlen] = '\0';
    return pstr;
}

