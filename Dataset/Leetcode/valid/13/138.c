int XXX(char * s){
    int len = strlen(s);
    int res = 0;
    int *arr = (int *)calloc(len, sizeof(int));
    for (int i = 0; i < len; i++) {
        switch (s[i]) {
            case 'I':
                arr[i] = 1;
                break;
            case 'V':
                arr[i] = 5;
                break;
            case 'X':
                arr[i] = 10;
                break;
            case 'L':
                arr[i] = 50;
                break;
            case 'C':
                arr[i] = 100;
                break;
            case 'D':
                arr[i] = 500;
                break;
            default:
                arr[i] = 1000;
                break;
        }
    } 
    for (int i = 0; i < len; i++) {
        if (i+1 < len && arr[i] < arr[i + 1]) {
            res -= arr[i]; 
            continue;
        }
        res += arr[i];
    }
    return res;
}

