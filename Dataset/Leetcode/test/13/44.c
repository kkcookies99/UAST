int XXX(char * s){
    int res = 0;
    while (*s)
    {
        switch (*s)
        {
            case 'I':
                res += 1;
                if (*(s+1) == 'V' || *(s+1) == 'X') res -= 2;
                break;
            case 'V':
                res += 5;
                break;
            case 'X':
                res += 10;
                if (*(s+1) == 'L' || *(s+1) == 'C') res -= 20;
                break;
            case 'L':
                res += 50;
                break;
            case 'C':
                res += 100;
                if (*(s+1) == 'D' || *(s+1) == 'M') res -= 200;
                break;
            case 'D':
                res += 500;
                break;
            case 'M':
                res += 1000;
                break;
        }
        s++;
    }
    return res;
}

