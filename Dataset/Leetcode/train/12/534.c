 char * XXX(int num){
    char *ans = malloc(sizeof(char)*(num*num+1));
    int k = 0;
    if(num >= 1000){
        int n = num/1000;
        for(int i = 0;i < n;i++){
            ans[k++] = 'M';
        }
        num %= 1000;
    }
    if(num >= 900){
        int n = ceil(num/900);
        for(int i = 0;i < n;i++){
            ans[k++] = 'C';
            ans[k++] = 'M';
        }
        num %= 900;
    }
    if(num >= 500){
        int n = ceil(num/500);
        for(int i = 0;i < n;i++){
            ans[k++] = 'D';
        }
        num %= 500;
    }    
    if(num >= 400){
        int n = ceil(num/400);
        for(int i = 0;i < n;i++){
            ans[k++] = 'C';
            ans[k++] = 'D';
        }
        num %= 400;
    }    
    if(num >= 100){
        int n = ceil(num/100);
        for(int i = 0;i < n;i++){
            ans[k++] = 'C';
        }
        num %= 100;
    }    
    if(num >= 90){
        int n = ceil(num/90);
        for(int i = 0;i < n;i++){
            ans[k++] = 'X';
            ans[k++] = 'C';
        }
        num %= 90;
    }    
    if(num >= 50){
        int n = num/50;
        for(int i = 0;i < n;i++){
            ans[k++] = 'L';
        }
        num %= 50;
    }    
    if(num >= 40){
        int n = ceil(num/40);
        for(int i = 0;i < n;i++){
            ans[k++] = 'X';
            ans[k++] = 'L';
        }
        num %= 40;
    }
        if(num >= 10){
        int n = ceil(num/10);
        for(int i = 0;i < n;i++){
            ans[k++] = 'X';
        }
        num %= 10;
    }
        if(num >= 9){
        int n = ceil(num/9);
        for(int i = 0;i < n;i++){
            ans[k++] = 'I';
            ans[k++] = 'X';

        }
        num %= 9;
    }
    if(num >= 5){
        int n = ceil(num/5);
        for(int i = 0;i < n;i++){
            ans[k++] = 'V';
        }
        num %= 5;
    }
        if(num >= 4){
        int n = ceil(num/4);
        for(int i = 0;i < n;i++){
            ans[k++] = 'I';
            ans[k++] = 'V';

        }
        num %= 4;
    }
    if(num >= 1){
        int n = num/1;
        for(int i = 0;i < n;i++){
            ans[k++] = 'I';
        }
        // n %= 1;
    }
    ans[k] = '\0';
    return ans;
}```

