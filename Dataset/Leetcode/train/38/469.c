 char * XXX(int n){
    int i=0,j=0,left=0,right=0,num=0;
    char temp;
    char **res=malloc(sizeof(char*)*(n+1)); 
    for(i=0;i<n;i++){
        res[i]=malloc(sizeof(char)*5000);  
    } 
    res[0][0]='1'; 
    res[0][1]='\0';
    i=1;
    while(i<n){  
        j=left=right=0;  
        while(left<strlen(res[i-1])){
            num=1;
            temp=res[i-1][right]; 
            while(right<strlen(res[i-1]) && res[i-1][right+1]==res[i-1][right]){
                num++;
                right++; 
            } 
            res[i][j++]=num+'0'; 
            res[i][j++]=temp; 
            res[i][j]='\0';  
            right++;
            left=right; 
        }
        i++; 
    
    } 
    return res[i-1];
}

