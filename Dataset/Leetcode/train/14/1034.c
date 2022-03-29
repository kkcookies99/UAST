 char * XXX(char ** strs, int strsSize){
    char *ans=(char *)malloc(sizeof(char)*200);
    int maxlen=strlen(strs[0]);
    int i,j=0;
    bool flag=true;
    while(j<maxlen){
        for(i=0;i<strsSize-1;i++){
            if(strs[i][j]!=strs[i+1][j]){
                flag=false;
                break;
            }
        }
        if(flag==true){
            ans[j]=strs[0][j];
            j++;
        }
        else{
            ans[j]='\0';
            return ans;
        }
    }
    ans[j]='\0';
    return ans;
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


