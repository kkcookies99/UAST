 char * XXX(char ** strs, int strsSize){
    char ans[10];
    for(int i=0;i<strlen(strs[0]);i++){
        ans[i]=strs[0][i];
        for(int j=1;j<strsSize;j++){
            if(ans[i]!=strs[j][i]){
                ans[i]=='\0';
            }
        }
    }
    return ans;
}

