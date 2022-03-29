 char * XXX(char * a, char * b){
    int len1 = strlen(a);
    int len2 = strlen(b);
    char* res = malloc(sizeof(char) * 10001);
    char* res1 = malloc(sizeof(char) * 10001);
    int flag = 0;
    int flaga = 0;
    int flagb = 0;
    int length = 0;
    int i, j;
    for(i = len1 - 1, j = len2 - 1; i >= 0 || j >= 0; i--, j--) {
        if(i < 0) {
            flaga = 1;
        }
        if(j < 0) {
            flagb = 1;
        }
        if(flaga != 1 && flagb != 1) {
            res[length++] = '0' + (flag + (a[i] - '0') + (b[j] - '0')) % 2;
            flag = ((flag + (a[i] - '0') + (b[j] - '0')) / 2 >= 1) ? 1 : 0;
        } else if (flaga == 1 && flagb != 1) {
            res[length++] = '0' + (flag  + (b[j] - '0')) % 2;
            flag = ((flag + (b[j] - '0')) / 2 >= 1) ? 1 : 0;
        } else if (flaga != 1 && flagb == 1) {
            res[length++] = '0' + (flag  + (a[i] - '0')) % 2;
            flag = ((flag + (a[i] - '0')) / 2 >= 1) ? 1 : 0;
        }
    }
    if(flag == 1) {
        res[length++] = '1';
    }
    for(int i = 0; i < length; i++) {
        res1[i] = res[length - 1 - i];
    }
    res1[length] = 0;
    return res1;
}

