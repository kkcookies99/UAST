int XXX(char * s){
    int len = strlen(s);
    if (len == 0) return 0;
    int i = 0;
    long num = 0;
    int flag = 1;
    int step = 1;
    while (i < len) {
        if (step == 1 && s[i] == ' ') {
            i++;
        }
        if (step == 1 && s[i] != ' ') {
            step = 2;
        }
        if (step == 2 && s[i] == '+') {
            flag = 1;
            step = 3;
            i++;
        } else if (step == 2 && s[i] == '-') {
            flag = -1;
            step = 3;
            i++;
        } else if (step == 2 && (s[i] >= '0'&& s[i] <= '9')){
            while (i < len && (s[i] >= '0'&& s[i] <= '9')) {
                num = num * 10 + s[i] - '0';
                if (num > (long)(INT_MAX) + 1) {
                    num = (long)(INT_MAX) + 1;
                    break;
                }
                i++;
            }
            break;
        }

        if (step == 3 && (s[i] >= '0'&& s[i] <= '9')) {
            while (i < len && (s[i] >= '0'&& s[i] <= '9')) {
                num = num * 10 + s[i] - '0';
               if (num > (long)(INT_MAX) + 1) {
                    num = (long)(INT_MAX) + 1;
                    break;
                }
                i++;
            }
            break;
        }

        if ((step == 2 || step == 3) && !(s[i] >= '0'&& s[i] <= '9')) return 0;
    }

    num = num * flag;
    if (num > INT_MAX) {
        num = INT_MAX;
    }
    if (num < INT_MIN) {
        num = INT_MIN;
    }
    return num;
}

