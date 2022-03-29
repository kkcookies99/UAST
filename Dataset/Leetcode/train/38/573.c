 char * XXX(int n){
    char *res;
    char *temp;
    int count = 1;
    int index = 0;
    int size = 1;
    int bufSize = 5000;

    res = (char *)malloc(sizeof(char) * bufSize);
    memset(res, '\0', sizeof(char) * bufSize);

    temp = (char *)malloc(sizeof(char) * bufSize);
    memset(temp, '\0', sizeof(char) * bufSize);

    res[0] = '1';

    for (int i = 1; i < n; i++) {
        index = 0;
        for (int j = 0; j < size; j++) {
            if (res[j] == res[j +1]) {
                count++;
            } else {
                temp[index++] = count + '0';
                temp[index++] = res[j];
                count = 1;
            }
        }
        memcpy(res, temp, index);
        size = index;
        memset(temp, '\0', sizeof(char) * bufSize);
    }

    free(temp);

    return res;
}

