char * XXX(int n){
    char* resultEnd = (char*)malloc(sizeof(char) * 150 * n);
    if(n == 1) {
        resultEnd[0] = '1';
        resultEnd[n] = '\0';
        return resultEnd;
    }
    char * result = XXX(n -1);
    int cnt = 0, k = -1;
    for(int i = 0; i < strlen(result); i++){
        if(result[i] != result[i + 1]){
            resultEnd[cnt] = i - k + '0';
            cnt++;
            resultEnd[cnt] = result[i];
            cnt++;
            k = i;
        }
    }
    resultEnd[cnt] = '\0';
    return resultEnd;
}

