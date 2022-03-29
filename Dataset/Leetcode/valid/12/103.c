 char * XXX(int num){
    char buff[7];
    memset(buff, 0, sizeof(char) * 7);
    char *str = calloc(16, sizeof(char));
    memset(str, '\0', sizeof(char) * 16);
    const char c[7] = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
    while (num > 999) {
        buff[0]++;
        num -= 1000;
    }
    while (num > 499) {
        buff[1]++;
        num -= 500;
    }
    while (num > 99) {
        buff[2]++;
        num -= 100;
    }
    while (num > 49) {
        buff[3]++;
        num -= 50;
    }
    while (num > 9) {
        buff[4]++;
        num -= 10;
    }
    while (num > 4) {
        buff[5]++;
        num -= 5;
    }
    while (num > 0) {
        buff[6]++;
        num -= 1;
    }
    int index = 0;
    for (int i = 0; i < 7; i++) {
        char n = buff[i];
        if (n == 4 && buff[i - 1] == 1) {
            str[index++] = c[i];
            str[index++] = c[i - 2];
            continue;
        }
        if (n == 4) {
            str[index++] = c[i];
            str[index++] = c[i - 1];
            continue;
        }
        if ((i & 1) == 1 && buff[i + 1] == 4) {
            continue;
        }
        while (n-- > 0) {
            str[index++] = c[i];
        }
    }
    return str;
}

