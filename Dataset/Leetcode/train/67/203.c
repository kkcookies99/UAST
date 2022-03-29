 char * XXX(char * a, char * b){
    int alen = strlen(a);
    int blen = strlen(b);
    char *temp = alen > blen ? a : b;
    int p = 0;
    int k = strlen(temp) - 1;
    for (int i = alen - 1, j = blen - 1; i >= 0 || j >= 0; i--, j--) {
        char aa = i >= 0 ? *(a + i) : '0';
        char bb = j >= 0 ? *(b + j) : '0';
        *(temp + (k--)) = ((aa - '0') + (bb - '0') + p) % 2 + '0';
        p = ((aa - '0') + (bb - '0') + p) / 2;
        if ((i <=0 || j <= 0) && p == 0) {
            return temp;
        }
    }
    char *s = (char*)malloc(sizeof(char) * (strlen(temp) + 2));
    *s = '1';
    int i = 0;
    for (; i <= strlen(temp); i++) {
        *(s + i + 1) = *(temp + i);
    } 
    return s;
}

