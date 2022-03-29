 char * XXX(char ** strs, int strsSize){
int i=1,j=0;
if(strsSize==0) 
return "";
for(;j<strlen(strs[0]);j++){
    for(;i<strsSize;i++){
        if(strs[0][j]!=strs[i][j])
        {
        strs[0][j]='\0';
        break;
        }
    }
} 
return strs[0];
}

