 #define max(a,b) (((a) > (b)) ? (a) : (b))

char * XXX(char * s){
    if (strlen(s) == 0) return "";
    int start = 0, end = 0;
    for (int i = 0; i < strlen(s); i++) {
        int len1 = expandaroundcenter(s, i, i);
        int len2 = expandaroundcenter(s, i, i+1);
        int len = max(len1, len2);
        if (len > end - start) {
            start = i - ((len - 1)>>1);
            end = i + (len>>1);
        }
    }
    char *p = malloc(sizeof(char) * (end - start + 2));
    strncpy(p, s + start, end - start + 1);
    p[end - start + 1] = '\0';
    return p;
}

int expandaroundcenter(char *s, int left, int right)
{
    int L = left, R = right;
    while (L >= 0 && R < strlen(s) && s[L] == s[R]) {
        L--;
        R++;
    }
    return R - L - 1;
}

