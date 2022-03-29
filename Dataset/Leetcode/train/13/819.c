 int XXX(char * s){
    int sum = 0;
    int len = strlen(s);
    for (int i = 0; i < len; i++) {
        switch (s[i]) {
            case 'M':
                sum += 1000;
                break;
            case 'C':
                if (i != len - 1 && s[i + 1] == 'M') {
                    sum += 900;
                    i = i + 1;
                } else if (i != len - 1 && s[i + 1] == 'D'){
                    sum += 400;
                    i = i + 1;
                } else {
                    sum += 100;
                }
                break;
            case 'D':
                sum += 500;
                break;
            case 'X':
                if (i != len - 1 && s[i + 1] == 'C') {
                    sum += 90;
                    i = i + 1;
                } else if (i != len - 1 && s[i + 1] == 'L'){
                    sum += 40;
                    i = i + 1;
                } else {
                    sum += 10;
                }
                break;
            case 'L':
                sum += 50;
                break;
            case 'I':
                if (i != len - 1 && s[i + 1] == 'X') {
                    sum += 9;
                    i = i + 1;
                } else if (i != len - 1 && s[i + 1] == 'V'){
                    sum += 4;
                    i = i + 1;
                } else {
                    sum += 1;
                }
                break;
            case 'V':
                sum += 5;
        }

    }
    return sum;

}

