 int XXX(char * s){

    if(strlen(s) == 1){
        return 1;
    }

    int len = strlen(s);
    int i,j;
    int maxSubLength = 0;
    char *arr = (char *)malloc(sizeof(char)*len+1);
    for(i=0;i<len;i++){
        int num[128] = {0};
        int count = 0;
        char *p = arr;
        for(j=i;j<len;j++){
            if(num[s[j]] != 0){
                break;
            }
            num[s[j]] = s[j];
            *(p++) = s[j];
            count++;
        }
                if(count > maxSubLength){
                    maxSubLength = count;
                }
    }
    return maxSubLength;
}

