 char * XXX(int n){

    char **ret = (char**)malloc(sizeof(char*)*n);
    for(int i = 0;i < n;i++){

        ret[i] = (char*)malloc(sizeof(char)*10240);
        memset(ret[i],0,sizeof(char)*10240);
    }

    ret[0][0] = '1';

    for(int i = 1;i < n;i++){
        
        int index = 0,sum = 1,pos = 0;
        while(ret[i-1][index] != '\0'){

            if(ret[i-1][index] == ret[i-1][index+1]){
                index++,sum++;
                continue;
            }

            ret[i][pos++] = sum + '0';
            ret[i][pos++] = ret[i-1][index];
            sum = 1;

            index++;
        }
    }
    return ret[n-1];
}

